FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY . .
RUN javac *.java


# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
#ENTRYPOINT ["sh", "-c", "exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar javavs.jar"]
