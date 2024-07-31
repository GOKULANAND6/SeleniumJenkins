FROM openjdk:18
WORKDIR /app
COPY ./target/seleniumassessment-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java", "-jar", "seleniumassessment-0.0.1-SNAPSHOT.jar"]