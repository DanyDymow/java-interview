The String Pool (also known as the String Intern Pool) in Java is a special memory area in the heap where Java stores string literals to optimize memory usage and improve performance.

Instead of creating a new String object every time a string literal is encountered, Java reuses existing strings from the pool to save memory.

```java
public class StringPoolExample {
    public static void main(String[] args) {
        String s1 = "Java";  // Stored in the String Pool
        String s2 = "Java";  // Reuses the same reference from the String Pool
        String s3 = new String("Java"); // Creates a new object outside the pool

        System.out.println(s1 == s2); // true (same reference in pool)
        System.out.println(s1 == s3); // false (different objects in memory)
        System.out.println(s1.equals(s3)); // true (same content)

        //we can use intern to force save object in string pool
        String s4 = new String("Java").intern();
        System.out.println(s1 == s4); // true
    }
}
```

### Why String in immutable 

- 1.1 Security
Strings are commonly used for storing passwords, API keys, database URLs, and file paths.
If String were mutable, an attacker could modify a sensitive string value, causing security vulnerabilities.

- 1.2 String Pool Optimization
If String were mutable, the String Pool mechanism would break.
Example of a problem if String was mutable:
```java
String s1 = "Hello";
String s2 = "Hello";
s1.append(" World"); // If strings were mutable, s2 would also change!
```
This would make string sharing dangerous.
Since strings are immutable, s1 and s2 remain independent, making the pool memory-efficient.

- 1.3 Thread-Safety 
Strings are often used across multiple threads.
Since String is immutable, no synchronization is required to prevent concurrent modification

- 1.4 Hashcode Consistency (Performance in Collections)
String is widely used as a key in HashMap, HashSet, and Hashtable.
If String were mutable, its hashcode could change, breaking the consistency of hash-based collections

### Why string pool created

- 2.1 Memory Optimization
Strings are used extensively in Java programs.
Instead of creating a new String object every time, Java reuses strings in the String Pool.

- 2.2 Faster String Comparisons (== Instead of .equals())
Since strings in the pool share references, comparisons using == are much faster.