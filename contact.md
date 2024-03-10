# Contact Api spec

## Create Contact 
Endpoint: POST /api/contacts
Request Header :

- X-API-TOKEN : Token(Mandatory)

Request Body :

```json
{
  "id": "Random String",
  "firstName": "Wildan",
  "lastName": "kasep",
  "email": "example@gmail.com",
  "phone": "089999999999"
}
```

Response Body (success):

```json
{
  "data": {
    "firstName": "Wildan",
    "lastName": "kasep",
    "email": "example@gmail.com",
    "phone": "089999999999"
  }
}
```

Response Body (failed):

```json
{
  "error": "format invalid, ..."
}
```

## Update Contact

Endpoint: PUT /api/contacts/{idContacts}
Request Header :

- X-API-TOKEN : Token(Mandatory)

Request Body :
```json
{
  "id": "Random String",
  "firstName": "Wildan",
  "lastName": "kasep",
  "email": "example@gmail.com",
  "phone": "089999999999"
}
```


Response Body (success):

```json
{
  "data": {
    "firstName": "Wildan",
    "lastName": "kasep",
    "email": "example@gmail.com",
    "phone": "089999999999"
  }
}
```

Response Body (failed):

```json
{
  "error": "format invalid, ..."
}
```


## Get Contact

Endpoint: GET /api/contacts/{idContact}
Request Header :

- X-API-TOKEN : Token(Mandatory)

Response Body (success):

```json
{
  "data": {
    "firstName": "Wildan",
    "lastName": "kasep",
    "email": "example@gmail.com",
    "phone": "089999999999"
  }
}
```

Response Body (failed, 404):

```json
{
  "error": "Not found, ..."
}
```
## Search Contact
Endpoint : GET /api/contact 

Query param: 
- name : String, contact first name or last name , using like query , optional 
- phone : String, contact phone , using like query , optional
- email : String, contact email, using like query , optional 
- page : Integer , Start from 0
- size : Integer , Default 10
Request Header : 

- X-API-TOKEN : Token (Mandatory)

Response Body :

```json
{
  "data": [
    {
      "firstName": "Wildan",
      "lastName": "kasep",
      "email": "example@gmail.com",
      "phone": "089999999999"
    }
  ],
  "paging": {
    "currentPage": 0,
    "totalPage": 10,
    "size": 10
  }
}
```
Response Body (failed):

```json
{
  "error": "Unauthorized"
}
```

## Delete Contact 

Endpoint: DELETE /api/contacts
Request Header :

- X-API-TOKEN : Token(Mandatory)

Request Body :

```json
{
  "data": "ok"
}
```

Response Body (failed):

```json
{
  "error": "Unauthorized"
}
```

