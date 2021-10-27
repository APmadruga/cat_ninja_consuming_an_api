FROM openjdk:latest
ADD target/simple-microservice-0.0.1-SNAPSHOT.jar simple-microservice.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "simple-microservice.jar"]