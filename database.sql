create database contact_management;
use contact_management;

CREATE TABLE users
(
    username         VARCHAR(100) NOT NULL,
    password         VARCHAR(100) NOT NULL,
    name             VARCHAR(100),
    token            VARCHAR(100),
    token_expired_at BIGINT,
    unique (token),
    primary key (username)
) ENGINE innoDB;

SELECT *
FROM users;
desc users;

CREATE TABLE contacts
(
    id         VARCHAR(100) NOT NULL,
    username   VARCHAR(100) NOT NULL,
    first_name VARCHAR(100) NOT NULL,
    last_name  VARCHAR(100),
    phone      VARCHAR(100),
    email      VARCHAR(100),
    primary key (id),
    FOREIGN KEY fk_user_contact (username) REFERENCES users (username)
) ENGINE innoDB;

select *
from contacts;
DESC contacts;

CREATE TABLE addresses
(
    id          VARCHAR(100) NOT NULL,
    contact_id  VARCHAR(100) NOT NULL,
    street      VARCHAR(200),
    city        VARCHAR(100),
    province    VARCHAR(100),
    country     VARCHAR(100),
    postal_code VARCHAR(10),
    primary key (id),
    FOREIGN KEY fk_addresses_contact (contact_id) REFERENCES contacts (id)
) ENGINE innoDB;

select *
from addresses;

desc addresses;