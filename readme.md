# This is a fullstack template project for quick starting development.

### Bakend is Maven Spring Boot 2.7.1 with Java 17

### Frontend is Vite React Typescript with Zod and Tailwindcss

### Databse is mysql

&nbsp;

Before running the project you need to create a .env in the backend folder and add the following:

```
MYSQL_HOST=mysql:3306
MYSQL_DATABASE=demo
MYSQL_USER=root
MYSQL_PASSWORD=root
```

To start the project simply run :

```
$ docker-compose -f docker-compose.yml up -d --build
```
