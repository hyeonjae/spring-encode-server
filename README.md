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

```
#### Response body
```json

```


### POST /api/urlencode/decode
#### Request body
```json

```
#### Response body
```json

```
