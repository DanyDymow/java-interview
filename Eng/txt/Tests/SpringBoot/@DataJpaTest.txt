## Аннотация @DataJpaTest , @JdbcTest , @DataMongoTest
is part of Spring Boot Test and is used for testing JPA (Java Persistence API) in the Spring context. Here are the main points you should know about it:

- Purpose: @DataJpaTest allows you to configure and run tests associated with the JPA layer of your application. It creates a minimal application context sufficient for testing JPA repositories without having to run the entire application.
- Test isolation: @DataJpaTest automatically scans JPA application components such as repositories and creates the appropriate test context. However, it does not load components required only by non-JPA layers (such as controllers).
- Dependency Injection: As part of the test tagged @DataJpaTest, you can inject the repositories you want to test and use them to perform read and write operations on the database.
- Transactional: Tests run with @DataJpaTest typically run within a transaction, which is automatically rolled back when the test completes. This allows you to isolate changes made by the test from the real database.
- Test Context Settings: @DataJpaTest provides various attributes that can be used to customize the test context, such as excluding classes that need to be loaded or substituting beans using @MockBean.


While an in-memory database may not be the best choice for validating your own query using native functions, you can disable this automatic setting with:

```java
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
```
и используйте, например, Testcontainers для создания базы данных PostgreSQL для тестирования.

Помимо автоконфигурации, все тесты выполняются внутри транзакции и откатываются после выполнения.

```java
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindByName() {
        // Создаем и сохраняем сущность в базе данных
        User user = new User("John Doe");
        entityManager.persist(user);
        entityManager.flush();

        // Вызываем метод, который мы хотим протестировать
        User found = userRepository.findByName(user.getName());

        // Проверяем результат
        assertThat(found.getName()).isEqualTo(user.getName());
    }
}
```