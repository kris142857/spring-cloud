FROM java:8
ADD /cloud-portal-1.0-SNAPSHOT.jar //
ENTRYPOINT ["java", "-Xmx256m", "-jar", "-Dspring.profiles.active=prod","/cloud-portal-1.0-SNAPSHOT.jar"]
