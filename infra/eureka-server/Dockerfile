# OpenJDK как основа контейнера
FROM openjdk:8-jre-alpine
# Копируем в контейнер получившийся jar-архив
COPY /build/libs/eureka-server-0.0.1.jar eureka-server.jar
# Запускаем jar-файл при старте контейнера
CMD ["java", "-jar", "eureka-server.jar"]
# Открываем порт 8282
EXPOSE 8282