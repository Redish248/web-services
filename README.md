# web-services
ИТМО, технологии веб-сервисов.

1) Лабораторная 1
Перед началом работы необходимо установить Glassfish4.
Java 8
Gradle 7.x

1.1) Server-standalone
Запуск: 
- gradle clean build
- cd build/libs
- java -jar lab1-*.jar

1.2) Server-j2ee
Запуск:
- gradle clean build
- gradle war
- Задеплоить на glassfish через Admin console или через Intellij idea, добавив PostgreSQL JDBC Connection pool и Resource

1.3) Client
Запуск:
- gradle clean build
- cd build/libs
- java -jar lab1-*.jar
