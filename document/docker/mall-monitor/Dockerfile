FROM java:8
ADD /cloud-monitor-1.0-SNAPSHOT.jar //
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=prod","/cloud-monitor-1.0-SNAPSHOT.jar"]
