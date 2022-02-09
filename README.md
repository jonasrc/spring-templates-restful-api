<h1 style="text-align: center">Spring Templates - RESTful API</h1>
<h4 style="text-align: center">
A template for building RESTful APIs with Java and Spring Framework.
</h4>

## Index

1. [Tech stack](#tech-stack)
2. [Building and running](#building-and-running)
    - [Installing dependencies](#installing-dependencies)
    - [Running the application](#running-the-application)
    - [Database seed](#database-seed)
3. [License](#license)

## Tech stack

* [Java](https://www.java.com)
* [Apache Maven](https://maven.apache.org/guides/index.html)
  * [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.3/maven-plugin/reference/html/)
* [Spring Framework](https://spring.io/)
  * [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.6.3/reference/htmlsingle/#using-boot-devtools)
  * [Spring Web](https://docs.spring.io/spring-boot/docs/2.6.3/reference/htmlsingle/#boot-features-developing-web-applications)
  * [Spring Rest Repositories](https://docs.spring.io/spring-boot/docs/2.6.3/reference/htmlsingle/#howto-use-exposing-spring-data-repositories-rest-endpoint)
  * [Spring HATEOAS](https://docs.spring.io/spring-boot/docs/2.6.3/reference/htmlsingle/#boot-features-spring-hateoas)
  * [Spring Security](https://docs.spring.io/spring-boot/docs/2.6.3/reference/htmlsingle/#boot-features-security)
  * [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.6.3/reference/htmlsingle/#boot-features-jpa-and-spring-data)
  * [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/2.6.3/reference/htmlsingle/#production-ready)
* [Validation](https://docs.spring.io/spring-boot/docs/2.6.3/reference/htmlsingle/#boot-features-validation)
* [H2 Database](https://www.h2database.com/html/main.html)
* [Lombok](https://projectlombok.org/juni)
* [JUnit 5](https://junit.org/junit5/)
* [Mockito](https://site.mockito.org/)

## Building and running

The following steps will guide users of this API through the process of building and running the application locally.

### Installing dependencies

This guide recommends using Chocolatey to simplify the installation of basic Java and Maven dependencies. The following
steps are

- Install the latest Java Runtime Environment version:
  ```sh
  choco install javaruntime
  ```

- Install the latest version of OpenJDK:
  ```sh
  choco install openjdk
  ```

- Install the latest version of Maven:
  ```sh
  choco install maven
  ```

- After installing both dependencies, open a Powershell window on the project's root folder and do a clean install via
  Maven:
  ```sh
  mvn clean install
  ```

### Running the application

- After building the JAR with Maven, run the application JAR:
  ```sh
  java -jar ./target/restfulapi-0.0.1-SNAPSHOT.jar
  ```

- In the command prompt, look for the H2 Database connection string on the `o.f.c.i.database.base.BaseDatabaseType` log.
  The log is as follows:
  ```sh
  "Database: jdbc:h2:mem:90c648bd-e1f5-4a32-8f2f-74c193db107b (H2 1.4)"
  ```

- Access the H2 Database console via http://localhost:8080/h2-console.
- Paste the connection string (e.g. `jdbc:h2:mem:90c648bd-e1f5-4a32-8f2f-74c193db107b`)  on the "JDBC URL" field.
  Leave "User Name" as "sa" and "Password" blank.
- Access Swagger UI via http://localhost:8080/swagger-ui/index.html.

## License

[Apache License Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)