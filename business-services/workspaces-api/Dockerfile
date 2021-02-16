# OpenJDK как основа контейнера
FROM openjdk:8-jre-alpine
# Копируем в контейнер получившийся jar-архив
COPY /build/libs/workspaces-api-0.0.1.jar workspaces-api.jar
# Запускаем jar-файл при старте контейнера
CMD ["java", "-jar", "workspaces-api.jar"]
# Открываем порт 9090
EXPOSE 9090