## Iterator() iterator and iterable

1. Iterator() method
The iterator() method is a method of the Iterable interface and collections such as List, Set, and Queue that implement this interface. It returns an object that implements the Iterator interface. This method allows you to obtain an iterator for a collection that you can use to iterate over the elements of the collection.

Example:

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

2. Iterator Interface
The Iterator interface provides methods for traversing a collection. It defines three main methods:

boolean hasNext(): Returns true if there are more elements to traverse in the collection.
E next(): Returns the next element in the collection.
default void remove(): Removes the last element returned by the iterator from the collection (optional method).
Example of using Iterator:

```java
Iterator<String> iterator = list.iterator();
while (iterator.hasNext()) {
 String element = iterator.next();
 System.out.println(element);
 // iterator.remove(); // optional if you need to remove the element
}
```

3. Iterable Interface
The Iterable interface represents a collection that can be iterated over. This interface defines only one method:

Iterator<E> iterator(): Returns an iterator for elements of type E.
Any collection that implements the Iterable interface can be used in an improved for-each loop. For example, all collections from the java.util package (such as ArrayList, HashSet, etc.) implement the Iterable interface.

Example:

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