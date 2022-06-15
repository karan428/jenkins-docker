FROM openjdk:11
ADD target/Jenkin-Docker.jar jenkin-docker.jar
Expose 8086
ENTRYPOINT ["java","-jar","jenkin-docker.jar"]
