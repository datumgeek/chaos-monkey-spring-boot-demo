FROM adoptopenjdk/openjdk11:alpine-slim
ARG SERVICE_NAME
ARG JAR_FILE

VOLUME /tmp

COPY ${JAR_FILE} app.jar

ENV JAVA_OPTS="-Xmx128m -Xms32m" \
    SERVICE_NAME=${SERVICE_NAME}

LABEL APP=${SERVICE_NAME} \
      DOMAIN="shopping-demo"

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar --spring.profiles.active=docker"]