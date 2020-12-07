# RESTful Web Services

Social Media Application

User -> Posts (one to many relationship)

- retrieve all users    - GET /users
- Create a user         - POST /users
- retrieve a user       - GET /users/{id}
- delete a user         - DELETE /users/{id}

- retrieve all posts for a user - GET /users/{id}/posts
- create a post for a user      - POST /users/{id}/posts
- retrieve details of a post    - GET /users/{id}/posts/{post_id}
