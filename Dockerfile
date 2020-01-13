FROM java:8
ADD target/registry-service.jar registry-service.jar
ENTRYPOINT ["java","-jar","registry-service.jar"]
