FROM openjdk:8-jre
MAINTAINER jinwei<756033241@qq.com>
RUN mkdir /app
COPY quanty-cloud-gateway-1.0.0-SNAPSHOT.jar /app/app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/app.jar"]
EXPOSE 8900