## @Profile
Иногда нам хочется иметь разные наборы настроек. Настройки отличаются для тестового окруения и для продакшена, для облака и для собственного железа, и так далее.


```java
@Component
@Profile("test")
class FigherJet implements Vehicle {}
```