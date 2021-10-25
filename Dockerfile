FROM  java:8
EXPOSE 8094
ADD /target/euroka-1.0.jar euroka.jar 
ENTRYPOINT ["java", "-jar", "euroka.jar"]


