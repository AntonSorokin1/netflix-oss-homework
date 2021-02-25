# Используем за основу контейнер OpenJDK
FROM openjdk:8-jre-alpine
# Копируем jar-архив в docker-образ
COPY build/libs/eureka-server-0.0.1.jar eureka-server.jar
# Запускаем jar-файл
CMD ["java", "-jar", "eureka-server.jar"]
# Открываем порт 8989
EXPOSE 8989