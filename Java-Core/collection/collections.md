### Collection:
The root interface of the collection hierarchy. It represents a group of objects and defines the basic methods like add, remove, and contains.
### List
Extends the Collection interface and represents an ordered collection (a sequence) that allows duplicate elements. Implementations include **ArrayList** and **LinkedList**.
### Set
Extends the Collection interface and represents a collection of unique elements with no defined order. Implementations include HashSet and TreeSet.
### HashMap
Represents a collection of key-value pairs, where each key is associated with a unique value. Implementations include HashMap, TreeMap, and LinkedHashMap.
### Thread Safety:
The Java Collections Framework provides both thread-safe and non-thread-safe implementations. For example, Vector and Hashtable are thread-safe, while ArrayList and HashMap are not. To make collections thread-safe, you can use the Collections.synchronizedXXX methods or consider using classes from the java.util.concurrent package.
### Double Brace Initialization
```java
public class MyClass{
    HashMap<Integer, String> map = new HashMap<Integer,String>(){{
        put(1, 'one');
    }};
}
```

### Performance:

**ArrayList** provides fast element access but slower insertions and deletions

**LinkedList** provides fast insertions and deletions but slower element access.

![Alt текст](/img/collections/collections-time.png)



### Sorting and Searching:

The Java Collections Framework provides methods for sorting collections using the Comparable and **Comparator** interfaces. You can also search for elements using methods like **contains**, **indexOf**, and **binarySearch**.