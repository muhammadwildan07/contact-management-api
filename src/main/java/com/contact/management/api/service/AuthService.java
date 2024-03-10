package com.contact.management.api.service;

import com.contact.management.api.entity.User;
import com.contact.management.api.model.LoginUserRequest;
import com.contact.management.api.model.TokenResponse;
import com.contact.management.api.repository.UserRepository;
import com.contact.management.api.security.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.UUID;

@Service

public class AuthService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ValidationService validationService;

    @Transactional
    public TokenResponse login(LoginUserRequest request) {
        validationService.validate(request);
        User user = userRepository.findById(request.getUsername())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.UNAUTHORIZED, "username or password wrong"));
        if (BCrypt.checkpw(request.getPassword(), user.getPassword())) {
            user.setToken(UUID.randomUUID().toString());
            user.setTokenExpiredAt(next30Day());
            userRepository.save(user);

            return TokenResponse.builder()
                    .Token(user.getToken())
                    .expiredAt(user.getTokenExpiredAt())
                    .build();
        } else {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "username or password wrong");
        }
    }
    private Long next30Day() {
        return System.currentTimeMillis() + (1000L * 60 * 60 * 24 * 30);
    }
}
