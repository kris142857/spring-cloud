FROM java:8
ADD /cloud-admin-1.0-SNAPSHOT.jar //
ENTRYPOINT ["java", "-Xmx256m", "-jar", "-Dspring.profiles.active=prod","/cloud-admin-1.0-SNAPSHOT.jar"]
