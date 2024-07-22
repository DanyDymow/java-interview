## Records

What is Record in Java?
Record in Java is a class designed to store data. It is similar to a traditional Java class, but is lighter and has some unique features. Records are immutable by default, which means their state cannot be changed once they are created. This makes them ideal for storing immutable data, such as configuration parameters or values ​​returned from a database query.

It is also a way to create a custom data type consisting of a set of fields or variables, as well as methods for accessing and modifying those fields. Record in Java makes working with data easier by reducing the amount of boilerplate code that developers have to write over and over again.

```java
public record Book(String name, double price) { }
```