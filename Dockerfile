FROM maven:3.8.1-openjdk-17 AS first_layer
WORKDIR /app
COPY . .
RUN mvn clean package -Dmaven.test.skip=true

FROM openjdk:17
WORKDIR /unix-system
COPY --from=first_layer /app/target/unix-system-0.0.1-SNAPSHOT.jar unix.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "unix.jar"]
