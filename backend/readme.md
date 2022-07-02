# This is a template Maven Spring Boot project with the following dependencies :
    - Spring web
    - Spring data JPA
    - Spring data JDBC
    - Spring dev tools
    - Lombok
    - Mapstruct
    - Jackson
  
### Java version 17
### Spring Boot version 2.7.1  

&nbsp;

If you want to quickly test if the application is working :  
4 requests are set up for testing purposes (GET, POST, PUT, DELETE). To test the requests a database is required.  
The db only contains one table named text :  

| Field | Type          | Null | Key | Extra          |
|-------|---------------|------|-----|----------------|
| id    | bigint(20)    | NO   | PRI | auto_increment |
| text  | varchar(4096) | NO   |     |                |

CREATE TABLE text(
    id bigint(20) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    text varchar(4096) NOT NULL
);

Change the values in src/main/resources/application.properties to connect to your database.  
Run ```mvn clean install```  
Run ```mvn spring-boot:run```  
The application starts on port 8080 by default.