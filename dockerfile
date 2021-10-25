FROM  java:8
EXPOSE 8092
ADD /target/Candidate-0.0.1-SNAPSHOT.jar Employe.jar 
ENTRYPOINT ["java", "-jar", "Employe.jar"]


