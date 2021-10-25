FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8095
ADD target/Zuul-Gateway-0.0.1-SNAPSHOT.jar Zuul-Gateway.jar
ENTRYPOINT ["java","-jar","/Zuul-Gateway.jar"]




 




