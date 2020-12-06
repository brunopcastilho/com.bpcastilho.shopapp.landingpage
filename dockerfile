FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
ADD ${JAR_FILE} landingpage-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-Djava.security.ecd=file:/dev/./urandom", "-jar", "/landingpage-0.0.1-SNAPSHOT.jar"]