# web-services
ИТМО, технологии веб-сервисов.

1) Лабораторная 1
Перед началом работы необходимо установить Glassfish4.
В проекте lab1-server-j2ee в /sql/postgres.sql лежит скрипт к базе для создания таблицы и её заполнения.

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
- Задеплоить на glassfish через Admin console или через Intellij idea, добавив PostgreSQL JDBC Connection pool и Resource

1.3) Client [соединяется со standalone]
Запуск:
- gradle clean build
- cd build/libs
- java -jar cat-war-client.jar

1.4) SoapUI
Там лежит проект к SoapUI для тестирования.
Request1 - для соединения с Server-Standalone
Request2 - для соединения с Server-j2ee
