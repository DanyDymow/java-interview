## Spring Cloud
Spring Cloud solves essential microservices challenges such as:
✅ Service Registration and Discovery
✅ Load Balancing
✅ API Gateway
✅ Fault Tolerance
✅ Configuration Management
✅ Distributed Tracing
✅ Monitoring and Management

### Service Discovery (pattern)
In a microservices architecture, services need a way to find and communicate with each other.

🔹 Netflix Eureka (Service Registry)
A registry where all microservices register and discover each other.
Based on self-registration, meaning each service registers itself at startup.
Works over HTTP REST protocol.

```java
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
```

### Load Balancing
When multiple instances of a service are registered in Eureka, traffic needs to be distributed among them.

🔹 Spring Cloud LoadBalancer
Built-in client-side load balancing mechanism.
No need to use Ribbon (Spring Cloud Netflix).

```java
@Bean
@LoadBalanced
public RestTemplate restTemplate() {
    return new RestTemplate();
}
@FeignClient(name = "order-service")
public interface OrderServiceClient {
    @GetMapping("/orders/{id}")
    Order getOrder(@PathVariable Long id);
}
```

### API Gateway
API Gateway helps route requests between clients and microservices, providing centralized access.

🔹 Spring Cloud Gateway
Built on Spring WebFlux.
Supports reactive streams.
Easily scalable.

### Circuit Breaker (Fault Tolerance)
If one service becomes slow or fails, the system should remain operational.

🔹 Resilience4j (Circuit Breaker)
Automatically breaks connections if a service is unresponsive.
Prevents cascading failures.

```java
@CircuitBreaker(name = "userService", fallbackMethod = "fallbackUser")
public User getUser(Long id) {
    return restTemplate.getForObject("http://user-service/users/" + id, User.class);
}

public User fallbackUser(Long id, Throwable t) {
    return new User(id, "Default User", "unknown@example.com");
}
```

### Centralized Configuration
Instead of storing configurations in each service, they can be centralized.

🔹 Spring Cloud Config
Allows centralized storage of configurations (e.g., in Git).
Supports dynamic configuration updates.

```java
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
```

### Distributed Tracing
When a request passes through multiple services, it is crucial to track the entire request path.

🔹 Spring Cloud Sleuth + Zipkin
Sleuth adds trace ID to each request.
Zipkin visualizes request tracing.
