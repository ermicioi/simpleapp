# Authors

## GET `/authors` - get list of authors
### Headers
| Header  | Value                                        | Comment                           |
|---------|----------------------------------------------|-----------------------------------|
| Accept  | application/vnd.simpleapp.api+json;version=1 | Return payload format JSON        |
| Accept  | application/vnd.simpleapp.api+csv;version=1  | Return payload format in CSV file |

## POST `/authors` - add author
### Headers
| Header       | Value                                        |
|--------------|----------------------------------------------|
| Content-Type | application/vnd.simpleapp.api+json;version=1 |

### Payload
```json
{
  "firstName": "string",
  "lastName": "string"
}
```


## PUT `/authors/{id}` - update author
### Path parameters
| Parameter | Type    |
|-----------|---------|
| id        | integer |

### Headers
| Header       | Value                                        |
|--------------|----------------------------------------------|
| Content-Type | application/vnd.simpleapp.api+json;version=1 |

### Payload
```json
{
  "firstName": "string",
  "lastName": "string"
}
```

# Books
## GET `/books` - get books
### Versions
| Version | Description                                                                         | 
|---------|-------------------------------------------------------------------------------------|
| 1       | Requires header `Accept` to equal to `application/json`                             | 
| 2       | Requires addition to path `/v2/`                                                    |
| 3       | Requires version provided as query parameter, `version=3`                           |
| 4       | Requires header `Accept` to equal to `application/vnd.simpleapp.api+json;version=4` |
