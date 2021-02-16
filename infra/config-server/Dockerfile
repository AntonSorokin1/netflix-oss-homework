# OpenJDK как основа контейнера
FROM openjdk:8-jre-alpine
# Копируем в контейнер получившийся jar-архив
COPY /build/libs/config-server-0.0.1.jar config-server.jar
# Запускаем jar-файл при старте контейнера
CMD ["java", "-jar", "config-server.jar"]
# Открываем порт 8888
EXPOSE 8888