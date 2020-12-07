FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/landingpage-1.0.1.jar
COPY ${JAR_FILE} landingpage-1.0.1.jar
ENTRYPOINT ["java","-jar","/landingpage-1.0.1.jar"]