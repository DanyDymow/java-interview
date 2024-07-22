### equals() Method:

- The equals method is used to compare the content or value equality of two objects.
- By default, the equals method in the Object class compares object references (memory addresses), so two objects are considered equal only if they reference the same memory location.
- To provide meaningful content-based comparison for custom classes, you should override the equals method in your class.
- When you override equals, you typically compare the fields or attributes of objects to determine if they are equal.
- Here's an example of how to override the equals method in a custom class:

```java
public class MyClass{

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return myField == myClass.myField; // Compare fields for equality
    }
}
```

### hashCode() Method

- The hashCode method returns an integer value that represents the object's hash code.
- Hash codes are used in data structures like HashSet and HashMap to efficiently organize and search for objects.
- When you override the equals method, you should also override the hashCode method to ensure that equal objects have the same hash code.
- The hashCode method should be consistent with the equals method. That is, if two objects are equal according to the equals method, they must have the same hash code.

```java
public class MyClass{

    @Override
    public int hashCode() {
        return Objects.hash(myField); // Use Objects.hash to combine hash codes of fields
    }
}
```

### Collision

It is the way when hash can be same but values is different because integer value in ended

- If the hashes the same then value is the same
- If value not the same hash could be same 

