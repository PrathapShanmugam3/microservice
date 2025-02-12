FROM eclipse-temurin:17
WORKDIR /app

COPY . .

RUN ./mvnw clean package -DskipTests
EXPOSE 10000
CMD ["java", "-jar", "target/*.jar"]
