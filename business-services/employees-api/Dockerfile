# OpenJDK как основа контейнера
FROM openjdk:8-jre-alpine
# Копируем в контейнер получившийся jar-архив
COPY /build/libs/employees-api-0.0.1.jar employees-api.jar
# Запускаем jar-файл при старте контейнера
CMD ["java", "-jar", "employees-api.jar"]
# Открываем порт 9094
EXPOSE 9092