
## Functional Interfaces
In Java, a functional interface is an interface that contains exactly one abstract method.
### Definition:

- A functional interface is an interface that has exactly one abstract method.
- It can also have default methods (methods with a default implementation) and static methods, but it must have only one abstract method.

### Purpose:

- Functional interfaces serve as the basis for using lambda expressions and method references, which provide a concise way to represent behavior as data.
- They allow you to treat functions or methods as first-class citizens in Java, making it easier to work with behavior as if it were data.

### @FunctionalInterface Annotation:

- Java introduced the @FunctionalInterface annotation to explicitly mark an interface as a functional interface.
- While the annotation is not strictly required, it helps convey the intent and allows the compiler to check that the interface indeed meets the functional interface criteria (exactly one abstract method).

```java
@FunctionalInterface
interface MyFunctionalInterface {
    void doSomething();
}
```

### Predefined Functional Interfaces:
Java provides several predefined functional interfaces in the java.util.function package for common use cases, such as:
- **Consumer**<T>: Accepts an argument of type T and performs an action without returning a result.
- **Supplier**<T>: Supplies a result of type T without taking any arguments.
- **Function**<T, R>: Accepts an argument of type T and produces a result of type R.
- **Predicate**<T>: Accepts an argument of type T and returns a boolean result.
