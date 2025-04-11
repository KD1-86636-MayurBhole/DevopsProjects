# ====== Build Stage ======
FROM maven:3.9.6-eclipse-temurin-17-alpine AS build

# Set working directory
WORKDIR /app

# Copy the project files
COPY . .

# Build the application
RUN mvn clean package -DskipTests

# ====== Runtime Stage ======
FROM tomcat:10.1.17-jdk17 AS runtime

# Set working directory inside Tomcat
WORKDIR /usr/local/tomcat/webapps/

# Copy the built WAR file to Tomcat's webapps directory
COPY --from=build /app/target/*.war backend.war

# Expose the default Tomcat port
EXPOSE 8080

# Start Tomcat
CMD ["catalina.sh", "run"]
