FROM amazoncorretto:21
LABEL maintainer="Pradnyasurya <kuranepm@gmail.com>"
WORKDIR /app
COPY ./build/libs/authservice-0.0.1-SNAPSHOT.jar /app/authservice-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/app/authservice-0.0.1-SNAPSHOT.jar"]