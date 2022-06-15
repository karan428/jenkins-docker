FROM openjdk:11
ADD target/Jenkin-Docker.jar jenkin-docker.jar
Expose 9001
ENTRYPOINT ["java","-jar","jenkin-docker.jar"]
