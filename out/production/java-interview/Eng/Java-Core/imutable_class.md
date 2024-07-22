## Immutable class 

Rules for creating an immutable class
Declare the class as final to prevent subclassing.
Make all fields private and final to prevent them from being changed after initialization.
Don't provide setters, only getters to access fields.
Initialize all fields via the constructor.
Make copies of mutable objects when assigning them to fields to avoid external changes.
Return copies of mutable objects in getters to protect internal data.


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