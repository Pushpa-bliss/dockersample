FROM openjdk:8
ADD target/docker-sample.jar docker-sample.jar
EXPOSE 8081
ENTRYPOINT["java", "-jar", "docker-sample.jar"]
