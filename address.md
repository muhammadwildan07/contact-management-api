# Address API Spec

## Create Address

Endpoint : 

Request Header :

- X-API-TOKEN : Token

Request Body :
```json
{
  
}
```

Response Body (Success):
```json
{
  
}
```
Response Body (Failed):
```json
{
  
}
```

## Update Address


Endpoint : POST /api/contact/ {idContact}/addresses

Request Header :

- X-API-TOKEN : Token

Request Body :

```json
{
  "street": "Kayuringin",
  "city": "Bekasi",
  "province": "Jawa Barat",
  "country": "Indonesia",
  "postalCode" : "12345"
}
```

Response Body (Success):

```json
{
  "data": {
    "id": "Random String",
    "street": "Kayuringin",
    "city": "Bekasi",
    "province": "Jawa Barat",
    "country": "Indonesia",
    "postalCode" : "12345"
  }
}
```
Response Body (Failed):

```json
{
  "error": "contact not found"
}
```

## Get Address


Endpoint :POST /api/contacts/ {idContact}/addresses/{idAddress }

Request Header :

- X-API-TOKEN : Token

Request Body :

```json
{
  "street": "Kayuringin",
  "city": "Bekasi",
  "province": "Jawa Barat",
  "country": "Indonesia",
  "postalCode" : "12345"
}
```

Response Body (Success):

```json
{
  "data": {
    "id": "Random String",
    "street": "Kayuringin",
    "city": "Bekasi",
    "province": "Jawa Barat",
    "country": "Indonesia",
    "postalCode" : "12345"
  }
}
```
Response Body (Failed):

```json
{
  "error": "contact not found"
}
```

## Remove Address


Endpoint :

Request Header :

- X-API-TOKEN : Token

Request Body :
```json
{
  
}
```

Response Body (Success):
```json
{
  
}
```
Response Body (Failed):
```json
{
  
}
```

## List Address


Endpoint :

Request Header :

- X-API-TOKEN : Token

Request Body :
```json
{
  
}
```

Response Body (Success):
```json
{
  
}
```
Response Body (Failed):
```json
{
  
}
```
