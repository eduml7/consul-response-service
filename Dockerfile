FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD build/libs/consul-response-0.0.1-SNAPSHOT.jar app.jar
ADD consul consul 
ADD start.sh start.sh
ENV JAVA_OPTS=""
RUN ["chmod", "+x", "/start.sh"]
ENTRYPOINT /start.sh
EXPOSE 8081