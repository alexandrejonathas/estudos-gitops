FROM maven:3.8.4-openjdk-11-slim AS build

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

FROM openjdk:11-jre-slim

WORKDIR /app

RUN apt update && apt install -y fontconfig libfreetype6

COPY --from=build /app/target/hello-java-0.0.1-SNAPSHOT.jar .

CMD ["java", "-jar", "hello-java-0.0.1-SNAPSHOT.jar"]