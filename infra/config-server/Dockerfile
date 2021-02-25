# Используем за основу контейнер OpenJDK
FROM openjdk:8-jre-alpine
# Копируем jar-архив в docker-образ
COPY build/libs/config-server-0.0.1.jar config-server.jar
# Запускаем jar-файл
CMD ["java", "-jar", "config-server.jar"]
# Открываем порт 8888
EXPOSE 8888