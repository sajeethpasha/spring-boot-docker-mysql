# Use the official image as a parent image
FROM openjdk:17-jdk-slim

VOLUME /tmp
COPY target/Holidays-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
