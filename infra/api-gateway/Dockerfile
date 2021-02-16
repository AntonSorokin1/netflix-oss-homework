# OpenJDK как основа контейнера
FROM openjdk:8-jre-alpine
# Копируем в контейнер получившийся jar-архив
COPY /build/libs/api-gateway-0.1.0.jar api-gateway.jar
# Запускаем jar-файл при старте контейнера
CMD ["java", "-jar", "api-gateway.jar"]
# Открываем порт 9094
EXPOSE 9094