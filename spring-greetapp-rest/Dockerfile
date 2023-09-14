FROM openjdk:17-alpine
EXPOSE 8080
COPY /target/greet-api.jar greetrest-api.jar
ENTRYPOINT [ "java","-jar","greetrest-api.jar" ]