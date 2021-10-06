# Laboratório 6 - Programação Para Internet

## Curl utilizados, gerados a partir do Postman

### GET all
curl --location --request GET 'http://localhost:8080/api/post'

### GET by id
curl --location --request GET 'http://localhost:8080/api/post/1'

### POST
curl --location --request POST 'http://localhost:8080/api/post' --header 'Content-Type: application/json' --data-raw '{"title": "new title", "content": "new content"}'

### DELETE
curl --location --request DELETE 'http://localhost:8080/api/post/3'

### PUT
curl --location --request PUT 'http://localhost:8080/api/post/3' --header 'Content-Type: application/json' --data-raw '{"title": "updated title", "content": "updated content"}'