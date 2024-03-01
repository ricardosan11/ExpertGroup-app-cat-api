FROM openjdk:17
VOLUME /ApiCat
EXPOSE  2002
ADD target/app-cat-api-0.0.1-SNAPSHOT.jar app-cat-api.jar
ENTRYPOINT ["java", "-jar", "/app-cat-api.jar"]