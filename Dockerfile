# Fetch Java
FROM eclipse-temurin:21-jdk-alpine

# Expose port 8080

EXPOSE 8080 
# Set a docker volume if you want 
VOLUME /tmp 

# Add the jar file 

ADD /target/*.jar spring-boot-docker-app1-0.0.1-SNAPSHOT.jar 

# Start the application

ENTRYPOINT ["java", "-jar", "/spring-boot-docker-app1-0.0.1-SNAPSHOT.jar"]