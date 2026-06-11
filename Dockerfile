FROM openjdk:27-ea-trixie

COPY target/flutter-push.jar /app/flutter-push.jar

ENTRYPOINT ["java", "-jar", "/app/flutter-push.jar"]