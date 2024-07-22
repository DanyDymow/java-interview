## Singleton
We declare the instance variable using static so that it is created once
Closing the ability to create class instances via private constructor
We create a static method for getting an instance, if it is null then we create it once, otherwise we get this instance
Everything is static because we don't create instances of the class.

```java
public class Singleton {
    private static Singleton instance;

    // Приватный конструктор
    private Singleton() {}

    // Публичный метод доступа к единственному экземпляру
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```