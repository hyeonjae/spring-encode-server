# spring-encode-server
[![Build Status](https://travis-ci.org/hyeonjae/spring-encode-server.svg?branch=master)](https://travis-ci.org/hyeonjae/spring-encode-server)

## REST API

### POST /api/base64/encode
#### Request body
```json
{
    "text": "hello world"
}
```
#### Response body
```json
{
    "result": "aGVsbG8gd29ybGQ="
}
```


### POST /api/base64/decode
#### Request body
```json
{
    "text": "aGVsbG8gd29ybGQ="
}
```
#### Response body
```json
{
    "result": "hello world"
}
```

### POST /api/urlencode/encode
#### Request body
```json
{
    "text": "https://github.com/hyeonjae/spring-encode-server"
}
```
#### Response body
```json
{
    "result": "https%3A%2F%2Fgithub.com%2Fhyeonjae%2Fspring-encode-server"
}
```


### POST /api/urlencode/decode
#### Request body
```json
{
    "text": "https%3A%2F%2Fgithub.com%2Fhyeonjae%2Fspring-encode-server"
}
```
#### Response body
```json
{
    "result": "https://github.com/hyeonjae/spring-encode-server"
}
```
