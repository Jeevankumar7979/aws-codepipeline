FROM eclipse-temurin:21-jre-jammy

WORKDIR /app

COPY target/aws-ecr-eks.jar aws-ecr-eks.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "aws-ecr-eks.jar"]
