FROM openjdk:17
COPY http_app/build/libs/http_app-0.0.1-SNAPSHOT.jar /app/app.jar
WORKDIR /app
CMD ["java","-jar", "app.jar"]

# docker buildx build --push --platform linux/amd64/v3 -t juni416/economy_monitoring:0.0.1 .

