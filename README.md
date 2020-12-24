# Java Spring Hunt

> Example application using Java and Spring Boot Reactive 

Benefits: 

- non-blocking
- plain old Java objects (POJO) for models

## Prerequisites

- OpenJDK 15 - modern Java
- VS Code - cross-platform code editor
- Mongodb - local NoSQL datastore

```Powershell
choco install openjdk -y
choco install vscode -y
choco install mongodb -y
choco upgrade all -y
refreshenv
```

## Built with Spring Boot Initializr

- [Spring Initializr](https://start.spring.io/)

## VS Code Prompts

- Trust Maven? Answer yes
- Install related tools? Answer yes

## Start MongoDB Data Service

Open Command Window as Admin (and leave it running):

```cmd
"C:\Program Files\MongoDB\Server\4.4\bin\mongod.exe" --dbpath="C:\data\db"
```

## Run Test

```Powershell
.\mvnw test
```

## Run App

```Powershell
.\mvnw spring-boot:run
```

## View Application in Browser

- [http://localhost:8080/](http://localhost:8080/)
- [http://localhost:8080/team](http://localhost:8080/team)
- [http://localhost:8080/team/1](http://localhost:8080/team/1)

## Resources

- [Mechero full-reactive-stack Repo](https://github.com/mechero/full-reactive-stack)
- [Spring Reactive](https://spring.io/reactive)
