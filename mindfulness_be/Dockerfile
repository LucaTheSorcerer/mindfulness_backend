FROM openjdk:21-jdk-oracle

WORKDIR /app
COPY target/mindfulness_v1.jar /tmp/mindfulness_v1.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/tmp/mindfulness_v1.jar"]