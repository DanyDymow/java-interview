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



- В Java класс может одновременно реализовать несколько интерфейсов, но наследоваться только от одного класса.
- Абстрактные классы используются только тогда, когда присутствует тип отношений «is a» (является). Интерфейсы могут реализоваться классами, которые не связаны друг с другом.
- Абстрактный класс - средство, позволяющее избежать написания повторяющегося кода, инструмент для частичной реализации поведения. Интерфейс - это средство выражения семантики класса, контракт, описывающий возможности. Все методы интерфейса неявно объявляются как public abstract или (начиная с Java 8) default - методами с реализацией по-умолчанию, а поля - public static final.
- Интерфейсы позволяют создавать структуры типов без иерархии.
- Наследуясь от абстрактного, класс «растворяет» собственную индивидуальность. Реализуя интерфейс, он расширяет собственную функциональность.

