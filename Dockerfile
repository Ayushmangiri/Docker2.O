FROM openjdk:26-slim-bullseye
LABEL authors="ayush"
ADD target/Docker-Learning.jar rest-demo.jar
ENTRYPOINT ["java", "-jar","/rest-demo.jar"]


