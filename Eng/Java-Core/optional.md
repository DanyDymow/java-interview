## Optional

- orElse(T other)
```java
public static void main(String[] args) {
    String value = "Hello";
    
    String result = Optional.ofNullable(value)
                            .orElse(getDefaultValue());

    System.out.println(result);
}

static String getDefaultValue() {
    System.out.println("Executing getDefaultValue()");
    return "Default Value";
}
```
the method will be executed

- orElseGet(Supplier<? extends T> supplier)

```java
public static void main(String[] args) {
    String value = "Hello";
    
    String result = Optional.ofNullable(value)
                            .orElseGet(() -> getDefaultValue());

    System.out.println(result);
}

static String getDefaultValue() {
    System.out.println("Executing getDefaultValue()");
    return "Default Value";
}

```
the method will NOT be executed

