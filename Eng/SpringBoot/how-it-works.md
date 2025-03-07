## . Архитектура Spring Boot
Spring Boot строится на основе Spring Framework и включает в себя:
✅ Spring Core – управление зависимостями (IoC Container).
✅ Spring MVC / WebFlux – обработка HTTP-запросов.
✅ Spring Data – работа с базами данных.
✅ Spring Security – безопасность и аутентификация.
✅ Spring Boot Starter'ы – автоматическая конфигурация зависимостей.
✅ Spring Boot AutoConfiguration – автоматическое создание бинов.

## . Основные Механизмы Spring Boot
### Встроенный Tomcat / Jetty / Undertow
Spring Boot использует Embedded Tomcat (по умолчанию), но можно заменить его на Jetty или Undertow.
Как это работает:

spring-boot-starter-web автоматически подтягивает Tomcat.
При запуске создаётся Spring Boot ApplicationContext, инициализируются бины.
TomcatServletWebServerFactory создаёт и конфигурирует Tomcat.
Контроллеры (RestController, Controller) маппятся на URL.
Spring запускает сервер и принимает HTTP-запросы.