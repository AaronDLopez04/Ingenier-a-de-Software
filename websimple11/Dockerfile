FROM amazoncorretto:17-alpine3.17-jdk
LABEL authors="adany"
WORKDIR /app
COPY ./target/websimple11-0.0.1-SNAPSHOT.jar ./app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]