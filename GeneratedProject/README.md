# Test Server

Spring Boot Server 

## Overview  
This is a swagger-enabled server in Java using the SpringBoot framework created for MobileMiddleware.  

The underlying library integrating swagger to SpringBoot is [springfox]

Start your server as an instantly deployable spring boot application using:
mvn spring-boot:run 

You can view the api documentation in swagger-ui by pointing to  
http://localhost:8080/  

- Port can be changed from GeneratedProject -> src -> main -> resources -> application.properties

Change default port value in application.properties

[Documentation](./src/site/markdown/index.md)
[FAQ](./src/site/markdown/faq.md)