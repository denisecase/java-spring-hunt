# Java Spring Hunt

> Example application using Java and Spring Boot Reactive 

## Prerequisites

- OpenJDK 14+
- VS Code IDE
- Mongodb running locally

## Built with Spring Boot Initializr

- [Spring Initializr](https://start.spring.io/)

## VS Code Prompts

- Trust Maven? Answer yes
- Install related tools? Answer yes

## Start Data Service

Start cmd as Admin:

```cmd
"C:\Program Files\MongoDB\Server\4.4\bin\mongod.exe" --dbpath="C:\data\db"
```

## Run App (or Tests)

```Powershell
.\mvnw spring-boot:run
.\mvnw test
```

## View in Browser

- [http://localhost:8080/](http://localhost:8080/)
- [http://localhost:8080/team](http://localhost:8080/team)
- [http://localhost:8080/team/1](http://localhost:8080/team/1)

## Resources

- [Mechero full-reactive-stack Repo](https://github.com/mechero/full-reactive-stack)
- [Spring Reactive](https://spring.io/reactive)
