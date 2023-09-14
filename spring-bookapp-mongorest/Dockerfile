FROM openjdk:17-alpine
EXPOSE 8080
COPY /target/book-mongoapi.jar book-mongoapi.jar
ENTRYPOINT [ "java","-jar","book-mongoapi.jar" ]