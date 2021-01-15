FROM java:8
ADD /cloud-gateway-1.0-SNAPSHOT.jar //
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=prod","/cloud-gateway-1.0-SNAPSHOT.jar"]
