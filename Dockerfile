FROM openjdk:11
VOLUME /tmp
COPY target/VetApp-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","/app.jar"]
