## @DisplayName

И наконец, каждому тесту можно задавать его имя. Бывает удобно, если тестов очень много и вы создаете специальные сценарии (подмножества) тестов. Для этого есть специальная аннотация @DisplayName.

Пример:
```java
@DisplayName("Понятное имя для теста")
public class DisplayNameCustomTest {

    @Test
    @DisplayName("Проверка входных данных")
    void inputData() {
    }

    @DisplayName("Проверка критических ситуаций")
    @Test
    void criticalCases() {
    }
}
```

Как и в случае с заданием порядка тестов, тут можно создать специальный метод, который будет генерировать имена тестов и тестовых методов. Пример:

```java
@DisplayNameGeneration(DisplayNameGeneratorUnitTest.ReplaceCamelCase.class)
class DisplayNameGeneratorUnitTest {

    @Test
    void camelCaseName() {
    }

    static class ReplaceCamelCase extends DisplayNameGenerator.Standard {
        @Override
        public String generateDisplayNameForClass(Class testClass) {
            return super.generateDisplayNameForClass(testClass).toUpperCase();
        }
 }
}
```