## Singleton
Обьявляем переменую instance через static что бы она создалась 1 раз 
Закрываем возможность создавать экзепляры классов через private constructor
Создаем статик метод получения инстанса , если он null то создаем его один раз, в ином случае получаем этот инстанс
Все является статиком потому что мы не создаем экземпляры класса 

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