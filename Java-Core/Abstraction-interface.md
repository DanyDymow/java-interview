### Abstraction

Provides common behavior to methods left choice use it or not to the child class

- Only one class extends
- Can have variable with default values
- Can have abstract or concrete methods

```java
public class MyClass extends AbstractClass {
}
```

### Interface

Says what exactly methods should be but left the implementation to the child class 

- It is contract that defines a set of methods that must be implemented
- Only have abstract methods without implementation
- Can have only static final variables
- Class must provide implementation of all methods
- One class can implements couple interfaces

```java
public class MyClass implements MyInterface, MyAnotherInterface {
}
```

