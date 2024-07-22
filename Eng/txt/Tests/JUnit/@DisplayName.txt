## @DisplayName

Finally, you can give each test a name. It can be convenient if there are a lot of tests and you create special scripts (subsets) of tests. There is a special @DisplayName annotation for this.

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

As in the case of specifying the order of tests, here you can create a special method that will generate the names of tests and test methods. Example:

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