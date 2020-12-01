FROM openjdk:8u121-jre-alpine
ADD target/eurekaserver-0.0.1-SNAPSHOT.jar eurekaserver-0.0.1-SNAPSHOT.jar
EXPOSE 8761
ENTRYPOINT ["sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar /eurekaserver-0.0.1-SNAPSHOT.jar"]

