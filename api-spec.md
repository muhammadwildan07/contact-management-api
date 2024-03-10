# User API Spec

## Register User

Endpoint : Post /api/users

Request Body:

```json
{
  "username" : "wildan",
  "password" : "rahasia",
  "name" : "Muhammad Wildan"
}
``` 
Response Body (Success):

```json
{
  "data" : "ok"
}
```

Response Body (Failed) :
```json
{
  "error" : "Username Must Not Blank, ??? "
}
```

## Login User

Endpoint : POST /api/auth/login

Request Body:

```json
{
  "username" : "wildan",
  "password" : "rahasia"
}
``` 
Response Body (Success):

```json
{
"data":{
  "Tolen": "Token",
  "expiredAt": 27813612736 // millisecond
   }
}
```
Response Body (Failed, 401) :
```json
{
  "errors" : "password or username wrong"
}
```
## Get User
Endpoint : GET /api/users/current

Request Header :
- X-API-Token (Mandatory)

Response Body (Success):

```json
{
  "data" : {
    "username" : "wildan",
    "name" : "Muhammad Wildan"
  }
}
```
Response Body (Failed, 401) :
```json
{
  "errors" : "Unauthorized"
}
```

## Update User
Endpoint : PATCH /api/users/current
Request Header :
- X-API-Token (Mandatory)


Request Body :

```json
{
 
  "name" : "Muhammad Wildan", //put if only want to update name
  "password" : "new password"  //put if only want to update password
  
}
```

Response Body (Success):

```json
{
 
  "name" : "Muhammad Wildan",
  "password" : "new password"
  
}
```
Response Body (Failed, 401) :
```json
{
  "errors" : "Unauthorized"
}
```



## Logout User

Endpoint : DELETE /api/users/current
Request Header :
- X-API-Token (Mandatory)

Response Body (Success) :

```json
{
  "data" : "ok"
}
```