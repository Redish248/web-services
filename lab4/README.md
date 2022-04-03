# web-services
ИТМО, технологии веб-сервисов.

1) Лабораторная 4
Перед началом работы необходимо установить Glassfish4.
В проекте корне репозитория в /sql/postgres.sql лежит скрипт к базе для создания таблицы и её заполнения.

Стек:
PostgreSQL 14
Java 8
Gradle 7.1

1.1) Server-standalone
Запуск: 
- gradle clean build
- cd build/libs
- java -jar cat-war.jar

1.2) Server-j2ee
Запуск:
- gradle clean build
- gradle war
- артифакт называется cat-war-rest
- Задеплоить на glassfish через Admin console или через Intellij idea, добавив PostgreSQL JDBC Connection pool и Resource

1.3) Client
Запуск:
- gradle clean build
- cd build/libs
- java -jar cat-war-client.jar

В классе RequestService нужно в зависимости от того, к какому сервису идёт подключение, раскомментировать соответствующую строку с URL.
