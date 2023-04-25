# Use the official OpenJDK image as the base image
FROM openjdk:11-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the project's JAR file into the image
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# Expose the port your application will run on
EXPOSE 8080

# Define the entry point of the application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
