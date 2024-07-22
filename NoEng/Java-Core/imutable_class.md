## Immutable class 

Правила создания неизменяемого класса
Объявите класс как final, чтобы предотвратить создание подклассов.
Сделайте все поля private и final, чтобы предотвратить их изменение после инициализации.
Не предоставляйте сеттеров, только геттеры для доступа к полям.
Инициализируйте все поля через конструктор.
Создайте копии изменяемых объектов при их присваивании полям, чтобы избежать внешних изменений.
Возвращайте копии изменяемых объектов в геттерах, чтобы защитить внутренние данные.


Пример неизменяемого класса
```java
import java.util.Date;

public final class ImmutableClass {
    private final int id;
    private final String name;
    private final Date dateOfBirth;

    public ImmutableClass(int id, String name, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        // Создаем копию объекта Date для предотвращения изменения оригинального объекта
        this.dateOfBirth = new Date(dateOfBirth.getTime());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        // Возвращаем копию объекта Date для предотвращения изменения оригинального объекта
        return new Date(dateOfBirth.getTime());
    }
}
```