FROM openjdk:8
ADD target/docker-spring-boot.jar dsb.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","dsb.jar"]