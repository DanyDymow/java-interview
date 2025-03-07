### Encapsulation

Mechanism to hide the implementation by using public , private, package access methods

### Abstraction

Allows to focus on high level functionality

### Inheritance

Allows us to use superclass with all methods and variable of it

Relationship "is-a"

Cat -> Animal

vs  Composition

Relationship "has-a"
Car -> Engine

### Polymorphism

Possibility to overload and override methods

### Override

Allows us to use the same method with the same arguments but with different logic

```java
public class MyClass {
    
    @Override
    public void someMethod(String str) {
        System.out.println("Hello, World!");
    }
}
```

### Overload

Allows us to use the same method with different arguments

```java
public class MyClass {
    
    public void someMethod(String str) {
        System.out.println("Hello, World!");
    }

    public void someMethod(String str, Int number) {
        System.out.println("Hello, World!");
    }
}
```
