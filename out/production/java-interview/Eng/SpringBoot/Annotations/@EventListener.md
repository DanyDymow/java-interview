## @EventListener

In Spring Boot, the @EventListener annotation is used to create event listeners in the application. It allows you to define methods that will be called when certain events occur in the Spring context.

Here are the key points to use the @EventListener annotation in Spring Boot:

### Application:
- @EventListener can be applied to regular methods in Spring bean classes such as @Component, @Service, @Repository, @Controller, etc.
### Events:
- Methods marked with @EventListener are called when certain events occur in the Spring context, such as application context, bean lifecycle, or user events.
- Events can be represented either by objects that are defined in the Spring Framework or by custom events defined in the application.
### Method parameters:
- Methods marked with @EventListener can take arguments that represent an event or an object associated with the event.
- Method parameters can be typed to handle specific types of events.
### Execution order:
- By default, methods marked with @EventListener are called in the order they are declared in the class.
- If necessary, you can control the order of execution of methods using the @Order annotation or the Ordered interface.
### Asynchronous execution:
- @EventListener supports asynchronous execution of methods, which allows events to be processed in separate threads.
- To do this, you can use the @Async annotation on methods marked with @EventListener.


```java
Copy code
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.boot.context.event.ApplicationReadyEvent;

@Component
public class MyEventListener {

 @EventListener
 public void onApplicationReady(ApplicationReadyEvent event) {
 // Handling the ApplicationReadyEvent event
 System.out.println("The application is ready to run!");
 }
}
```