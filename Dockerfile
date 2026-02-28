# Use Java 21
FROM eclipse-temurin:21-jdk

# Set working directory
WORKDIR /app

# Copy project files
COPY . .

# Build the project
RUN ./mvnw clean package -DskipTests

# Render uses dynamic PORT
EXPOSE 8080

# Start the application
CMD ["java", "-jar", "target/newstudent-0.0.1-SNAPSHOT.jar"]