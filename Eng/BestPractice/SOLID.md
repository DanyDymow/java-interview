## SOLID
It is an acronym that represents a set of five design principles for writing maintainable and scalable software. These principles were introduced by Robert C. Martin and have become fundamental guidelines for object-oriented programming and software architecture. The SOLID principles are meant to improve code quality, maintainability, and extensibility.
Here are the five SOLID principles:

DRY - dont repeat yourself
KISS - Keep it simple simon
YAGNI - You Aren't Gonna Need It

### Single Responsibility Principle (SRP): (one type logic for class)

The SRP states that a class should have only one reason to change, meaning it should have a single responsibility or job.
In practical terms, this principle suggests that a class should encapsulate only one piece of functionality or behavior.
By adhering to the SRP, you make your code more maintainable because changes to one responsibility won't affect other unrelated parts of the code.
### Open/Closed Principle (OCP): (class should be open for extend but close for change)

The OCP states that software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.
In other words, you should be able to extend the behavior of a module without changing its source code.
Achieving this principle often involves using techniques like inheritance, interfaces, and polymorphism to allow for easy extension.
### Liskov Substitution Principle (LSP): (each parent class can replace by child)

The LSP states that objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program.
In simpler terms, if you have a base class and a derived class, you should be able to use instances of the derived class wherever you use instances of the base class.
Violating the LSP can lead to unexpected behavior in your code.
### Interface Segregation Principle (ISP): (should not use interface which is not needed)

The ISP states that clients (classes or modules that use interfaces) should not be forced to depend on methods they do not use.
In other words, an interface should be specific to the needs of the class that uses it, rather than a one-size-fits-all interface.
Splitting large interfaces into smaller, more specialized interfaces adheres to the ISP and avoids unnecessary dependencies.
### Dependency Inversion Principle (DIP): (entities must depend on abstraction not on concretions)

The DIP states that high-level modules should not depend on low-level modules. Both should depend on abstractions.
Abstractions should not depend on details; details should depend on abstractions.
By using abstractions (such as interfaces or abstract classes) to define dependencies, you can decouple your code and make it more flexible and testable.