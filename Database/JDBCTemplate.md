## JdbcTemplate

The JdbcTemplate is a core class provided by the Spring Framework to simplify database access and reduce the amount of
boilerplate code required when working with JDBC (Java Database Connectivity). It's a part of the Spring JDBC module and
offers a higher-level, more convenient API for database operations while still retaining the power and flexibility of
JDBC.

### DataSource:

The JdbcTemplate relies on a DataSource for establishing database connections. The DataSource is typically configured in
your Spring Boot application's configuration and injected into the JdbcTemplate.

### Simplifies Resource Management:

One of the primary benefits of using JdbcTemplate is that it simplifies resource management. It automatically opens and
closes database connections, handles exceptions, and ensures resources are properly released, reducing the risk of
resource leaks.

### Reduces Boilerplate Code:

JdbcTemplate abstracts away much of the repetitive JDBC code required for executing SQL queries and processing results,
such as creating and closing statements, handling exceptions, and iterating through ResultSet objects.

### Parameterized Queries:

JdbcTemplate supports parameterized queries, making it easy to create SQL queries with placeholders for parameters. This
helps prevent SQL injection vulnerabilities and simplifies query creation.

### Query Execution:

JdbcTemplate provides methods for executing various types of queries, including queryForObject, queryForList, and query,
to retrieve data from the database. It also offers methods like update and execute for executing non-query SQL
statements.

### Exception Handling:

When an exception occurs during database operations, JdbcTemplate translates these exceptions into Spring's
DataAccessException hierarchy, making it easier to handle database-related exceptions consistently in your code.

### Batch Processing:

JdbcTemplate supports batch processing, allowing you to execute multiple SQL statements in a single batch operation for
improved performance.

Here's a simple example of how to use JdbcTemplate in a Spring Boot application:

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public User getUserById(long id) {
        String sql = "SELECT id, username, email FROM users WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, (resultSet, rowNum) -> {
            User user = new User();
            user.setId(resultSet.getLong("id"));
            user.setUsername(resultSet.getString("username"));
            user.setEmail(resultSet.getString("email"));
            return user;
        });
    }

    public void addUser(User user) {
        String sql = "INSERT INTO users (username, email) VALUES (?, ?)";
        jdbcTemplate.update(sql, user.getUsername(), user.getEmail());
    }
}
```

