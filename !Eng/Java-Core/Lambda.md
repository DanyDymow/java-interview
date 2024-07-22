
## Lambda
Lambda expressions in Java are a powerful and concise way to express instances of single-method interfaces (functional interfaces). Introduced in Java 8, they provide a way to write more expressive and readable code, especially when working with collections, threads, and functional-style programming.
### Lambda Expression Syntax:

- A lambda expression is a concise way to represent an anonymous function (a function without a name).
- The syntax for a lambda expression is as follows:
> (parameter1, parameter2, ...) -> expression or { statements }
- `(parameter1, parameter2, ...)`: A comma-separated list of parameters (if any).
- `->`: The lambda operator.
- `expression`: A single expression that represents the body of the method. This expression is evaluated and returned as the result.
- `{ statements }`: A block of statements enclosed in braces.
### Functional Interfaces:

- Lambda expressions are often used with functional interfaces, which are interfaces with exactly one abstract method.
- You can use a lambda expression to provide an implementation for the abstract method of a functional interface.
### Method References:

- Method references are a shorthand notation for invoking methods using lambda expressions.
- They allow you to reference an existing method as a lambda expression.
- There are four types of method references:
- Static method reference: ClassName::staticMethod
- Instance method reference: instance::instanceMethod
- Constructor reference: ClassName::new
- Array constructor reference: Type[]::new

### Example
```java
private class MyClass {
    // Lambda with no parameters and a single expression
    () -> System.out.println("Hello, Lambda!");

    // Lambda with one parameter and a single expression
    (int x) -> x * 2;

    // Lambda with multiple parameters and a block of statements
    (int a, int b) -> {
        int sum = a + b;
        return sum;
    };
}
```
