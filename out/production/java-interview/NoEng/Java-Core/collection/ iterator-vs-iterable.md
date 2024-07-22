## Iterator() iterator and iterable 

1. Метод iterator()
Метод iterator() является методом интерфейса Iterable и коллекций, таких как List, Set, и Queue, которые реализуют этот интерфейс. Он возвращает объект, который реализует интерфейс Iterator. Этот метод позволяет вам получить итератор для коллекции, который можно использовать для обхода элементов коллекции.

Пример:

```java
List<String> list = new ArrayList<>();
list.add("one");
list.add("two");
list.add("three");

Iterator<String> iterator = list.iterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}
```

2. Интерфейс Iterator
Интерфейс Iterator предоставляет методы для обхода коллекции. Он определяет три основных метода:

boolean hasNext(): Возвращает true, если в коллекции есть ещё элементы для обхода.
E next(): Возвращает следующий элемент в коллекции.
default void remove(): Удаляет из коллекции последний элемент, возвращённый итератором (опциональный метод).
Пример использования Iterator:

```java
Iterator<String> iterator = list.iterator();
while (iterator.hasNext()) {
    String element = iterator.next();
    System.out.println(element);
    // iterator.remove(); // опционально, если нужно удалить элемент
}
```

3. Интерфейс Iterable
Интерфейс Iterable представляет коллекцию, которую можно перебрать (итерацию). Этот интерфейс определяет только один метод:

Iterator<E> iterator(): Возвращает итератор для элементов типа E.
Любая коллекция, которая реализует интерфейс Iterable, может использоваться в улучшенном цикле for-each. Например, все коллекции из java.util пакета (такие как ArrayList, HashSet и т.д.) реализуют интерфейс Iterable.

Пример:

```java
public class MyIterableClass implements Iterable<String> {
    private List<String> list = new ArrayList<>();

    public MyIterableClass() {
        list.add("one");
        list.add("two");
        list.add("three");
    }

    @Override
    public Iterator<String> iterator() {
        return list.iterator();
    }

    public static void main(String[] args) {
        MyIterableClass myIterable = new MyIterableClass();
        for (String s : myIterable) {
            System.out.println(s);
        }
    }
}
```