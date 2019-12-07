FROM openjdk:7
COPY target/*.jar /hello.jar
CMD ["java", "-jar", "/hello.jar"]
