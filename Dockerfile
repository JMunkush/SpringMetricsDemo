FROM openjdk:17

WORKDIR /app

COPY ./target/SpringMetricsDemo-0.0.1-SNAPSHOT.jar .

CMD ["java", "-jar", "SpringMetricsDemo-0.0.1-SNAPSHOT.jar"]
