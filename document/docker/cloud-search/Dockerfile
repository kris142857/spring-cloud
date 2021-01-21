FROM java:8
ADD /cloud-search-1.0-SNAPSHOT.jar //
ENTRYPOINT ["java", "-Xmx128m", "-jar", "-Dspring.profiles.active=prod","/cloud-search-1.0-SNAPSHOT.jar"]
