FROM java:8
EXPOSE 8093
ADD /target/manage-project-0.0.1-SNAPSHOT.jar manage-project.jar
ENTRYPOINT ["java","-jar","manage-employees.jar"]