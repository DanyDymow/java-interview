# Dependency Injection (DI)
Dependency Injection (DI) is a fundamental concept in Spring Boot, as well as in the broader Spring ecosystem. It is a
design pattern and technique used to achieve Inversion of Control (IoC), as discussed in the previous response.
Dependency Injection helps manage the relationships and dependencies between components in a Spring Boot application by
providing a way to inject dependent objects (dependencies) into a component rather than having the component create them
itself. This promotes loose coupling between components and enhances modularity, maintainability, and testability in
your application.

In Spring Boot, you can perform Dependency Injection using various techniques, but the most common ones involve using
annotations and XML configuration:
## Annotation-Based Dependency Injection:
### @Autowired:
This annotation is used to inject a dependency into a bean. Spring Boot automatically scans the classpath for components
and injects the appropriate dependencies based on their types. For example:
```java

@Service
public class ProductService {
    private final ProductRepository repository;

    @Autowired
    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }
}
```
### @Qualifier:
When you have multiple beans of the same type and need to specify which one to inject, you can use @Qualifier along with
@Autowired. It helps Spring Boot disambiguate between multiple candidate beans.
```java

@Service
public class OrderService {
    private final PaymentProcessor paymentProcessor;

    @Autowired
    public OrderService(@Qualifier("creditCardPayment") PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    // ...
}
```
### @Value:
You can use the @Value annotation to inject values from properties files or configuration into your beans.
```java

@Service
public class MyService {
    @Value("${my.property}")
    private String myProperty;
}
```
## Constructor Injection:
Constructor injection is considered a best practice in Spring Boot. It involves injecting
dependencies through a constructor. This ensures that all required dependencies are provided when an object is created.
```java

@Service
public class OrderService {
    private final PaymentProcessor paymentProcessor;

    @Autowired
    public OrderService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }
}
```
## Setter Injection:
In setter injection, dependencies are injected using setter methods. While it's less common than
constructor injection, it can be useful in certain scenarios.
```java

@Service
public class MyService {
    private DataSource dataSource;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
```
## XML Configuration:
In addition to annotation-based configuration, Spring Boot also supports XML-based configuration for
defining beans and their dependencies in an XML file. However, XML configuration is less common in modern Spring Boot
applications, as most developers prefer annotation-based configuration.
Example XML configuration for a bean:
```xml
<bean id="myService" class="com.example.MyService">
    <property name="dataSource" ref="myDataSource"/>
</bean>
```