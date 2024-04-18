
## Static Variables (Class Variables):
- Static variables, also known as class variables, are declared using the static keyword within a class.
- They are associated with the class itself, rather than with individual objects created from the class.
- Static variables are initialized only once when the class is loaded, and their values are shared among all instances of the class.
- They are accessed using the class name followed by the variable name (e.g., ClassName.staticVariable).
```java
public class MyClass{
    static int staticVariable = 42;
} 
```
### Static Methods:

- Static methods are declared using the static keyword within a class.
- Like static variables, static methods belong to the class itself and can be invoked using the class name (e.g., ClassName.staticMethod()), without creating an instance of the class.
- Static methods cannot access instance-specific members (non-static variables and methods) directly unless they have an instance reference.

```java
public class MyClass{
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
} 
```

### Static Blocks:

- Static blocks are used to initialize static variables and perform one-time setup tasks when the class is loaded.
- Static blocks are enclosed in curly braces {} and are executed in the order they appear in the class.
- They are typically used for complex initialization or to load resources.
```java
public class MyClass{
    static {
        // Static block
        System.out.println("Static block executed.");
    }
}
```

### Static Nested Classes:

- A nested class declared as static is called a static nested class.
- Static nested classes are associated with the outer class but do not have access to non-static members of the outer class without an instance reference.
```java
public class OuterClass {
    static class StaticNestedClass {
        // Static nested class
    }
}
```
### Static Import:

- The import static statement allows you to import static members (variables and methods) from other classes without needing to prefix them with the class name.
```java
import static java.lang.Math.*;

public class MathOperations {
    public static void main(String[] args) {
        double result = sqrt(16.0); // No need to use Math.sqrt
        System.out.println("Square root: " + result);
    }
}
```

### Static Constants:

_ Constants declared as static final are often used for defining constant values that are shared among all instances of a class.```java

```java 
import static java.lang.Math.*;

public class Constants {
    public static final double PI = 3.14159265359;

```
