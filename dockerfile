FROM openjdk:18
EXPOSE 8088
ADD target/product-0.0.1-SNAPSHOT.jar product-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/product-0.0.1-SNAPSHOT.jar "]