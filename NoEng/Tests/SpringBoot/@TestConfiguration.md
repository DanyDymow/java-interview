## @TestConfiguration

However, we might want to avoid bootstrapping the real application context but use a special test configuration. We can achieve this with the @TestConfiguration annotation. There are two ways of using the annotation. Either on a static inner class in the same test class where we want to @Autowire the bean:

```java
@TestConfiguration
public class EmployeeServiceImplTestContextConfiguration {
    
    @Bean
    public EmployeeService employeeService() {
        return new EmployeeService() { 
            // implement methods 
        };
    }
}
```