## Аннотация @MockBean 
is part of the Spring Framework and is used in application testing to create mocks (stubs) of beans. Here are the main points you should know about it:

- Purpose: @MockBean is used to replace real beans in a test context with their mocks. This allows you to isolate components and test their behavior separately from the rest of the system.
- Usage: You can apply @MockBean annotation to fields or methods in your test classes. When the test context is initialized, beans marked with this annotation will be replaced by mocks.
- Creating mocks: @MockBean uses Mockito to create mocks. This means that the generated beans will be empty stubs that can simulate the behavior of real beans within a test context.

```java
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.Mockito.when;

@SpringBootTest
public class MyServiceTest {

    @Autowired
    private MyService myService;

    @MockBean
    private ExternalDependency externalDependency;

    @Test
    public void testMyService() {
        // Подготовка мокованного поведения
        when(externalDependency.someMethod()).thenReturn("mockedResult");

        // Вызов метода, который зависит от ExternalDependency
        String result = myService.doSomething();

        // Проверка результата
        // ...
    }
}
```