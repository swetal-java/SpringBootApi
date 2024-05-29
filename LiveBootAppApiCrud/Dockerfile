FROM openjdk:17
EXPOSE 8081
ADD target/springboot-mysql-docker.jar springboot-mysql-docker.jar 
ENTRYPOINT [ "java", "-jar", "/springboot-mysql-docker.jar" ]