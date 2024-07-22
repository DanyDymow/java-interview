## @Transactional

In Spring Boot, the @Transactional annotation is a powerful tool for managing database transactions declaratively. It's part of the Spring Framework's support for declarative transaction management and provides an easy way to define transactional behavior for methods in your Spring Boot application. Here's everything you need to know about the @Transactional annotation:

### Purpose of @Transactional:

The @Transactional annotation is used to specify that a method or a class should be wrapped in a database transaction.
A transaction is a sequence of one or more SQL operations treated as a single unit of work. Transactions ensure that the database remains in a consistent state, even if an error occurs during the operation.
### Transactional Semantics:

Spring Boot supports different transactional semantics, including REQUIRED, REQUIRES_NEW, NESTED, and more. These semantics determine how transactions are managed in different scenarios.
For example, the REQUIRED semantics indicate that a method should participate in an existing transaction if one exists, or start a new transaction if no transaction is currently active.
### Propagation:

- **REQUIRED (Default)**: If a transaction exists, the method joins it. If there's no existing transaction, a new one is created. This is the most common choice and ensures that the method always runs within a transaction.

- **REQUIRES_NEW**: A new transaction is always created for the method, even if there's an existing transaction. If there's an existing transaction, it's temporarily suspended and resumed after the method completes.

- **SUPPORTS**: If a transaction exists, the method joins it. If there's no transaction, the method executes without a transaction.

- **NOT_SUPPORTED**: The method is executed without a transaction. If an existing transaction is in progress, it's temporarily suspended.

- **MANDATORY**: The method must run within an existing transaction. If there's no transaction, an exception is thrown.

- **NEVER**: The method must execute without an existing transaction. If a transaction is in progress, an exception is thrown.

- **NESTED**: A new transaction is created, which is nested within the current transaction. If there's no existing transaction, a new one is created. If an existing transaction is in progress, the new transaction is nested within it.

- **IMPLICIT**: This is not a separate propagation behavior but refers to the default behavior based on the actual transaction manager and the specific use case. For example, in a JPA environment with a JTA transaction manager, the default propagation may be REQUIRED, while in a JDBC environment with a local transaction manager, it might be the same as REQUIRED.
### Isolation Level:

- **Default Isolation**: If you do not explicitly specify an isolation level, Spring Boot uses the default isolation level supported by the underlying database. This is often the database's default isolation level, which can vary between database systems.
- **READ_COMMITTED**: This is the most common isolation level. It allows a transaction to read only committed data from other transactions. It prevents dirty reads and guarantees that committed data is visible to other transactions.
- **READ_UNCOMMITTED**: This is the lowest isolation level. It allows a transaction to read uncommitted data from other transactions. It does not guarantee data consistency and can lead to dirty reads.
- **REPEATABLE_READ**: This level ensures that, within the scope of a transaction, a row that has been read cannot be modified by another transaction until the first transaction is complete. It prevents non-repeatable reads.
- **SERIALIZABLE**: This is the highest isolation level. It ensures full data integrity by preventing concurrent transactions from accessing the same data. It offers strong consistency but can result in slower performance due to locking.
### Rollback Rules:

You can define specific exceptions or exception types using the rollbackFor and noRollbackFor attributes. These attributes determine which exceptions trigger a rollback of the transaction.
For example, you can specify that a transaction should be rolled back for specific custom exceptions but not for others.
### Timeout:

The timeout attribute allows you to set a maximum time limit (in seconds) for a transaction. If the transaction exceeds this limit, it will be automatically rolled back.
### Read-Only Transactions:

You can mark a transaction as read-only by setting the readOnly attribute to true. This can improve the performance of read-heavy operations since it allows the database to optimize its behavior for read-only transactions.
### Nested Transactions:

The @Transactional annotation also supports nested transactions using the propagation attribute set to NESTED. Nested transactions are a way to create savepoints within a transaction, allowing you to roll back to a specific point within the transaction while preserving the outer transaction's state.
### Applying @Transactional:

You can apply the @Transactional annotation to methods within your Spring Boot components, such as service classes, repository methods, or controllers.
You can also apply it at the class level to indicate that all methods in the class should be transactional.
### Enabling Transaction Management:

To enable Spring's transaction management in your Spring Boot application, you typically need to include the @EnableTransactionManagement annotation in a configuration class or application class.
Additionally, you should configure a PlatformTransactionManager bean, which is responsible for managing transactions. Spring Boot provides built-in support for popular transaction managers like DataSourceTransactionManager.
Example of using @Transactional:

```java
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public void updateUser(User user) {
        userRepository.save(user);
    }
}
```