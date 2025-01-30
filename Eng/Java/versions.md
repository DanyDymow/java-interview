## - Java 8 -
- Language features: lambdas, etc.

Before Java 8, whenever you wanted to instantiate, for example, a new Runnable, you had to write an anonymous inner class like this:

```java
Runnable runnable = () -> System.out.println("Hello world two!");
```

- Collections and streams

In Java 8 you also got a functional style of operations for collections, also known as the Stream API. Quick example:

```java
List<String> list = Arrays.asList("franz", "ferdinand", "fiel", "vom", "pferd");
```

- With the Streams API you can do the following:
```java
list.stream()
 .filter(name -> name.startsWith("f"))
 .map(String::toUpperCase)
 .sorted()
 .forEach(System.out::println);
```

## - Java 9 -

- Collections

Collections have received several new helper methods to easily create lists, sets, and maps.
```java
List<String> list = List.of("one", "two", "three");
Set<String> set = Set.of("one", "two", "three");
Map<String, String> map = Map.of("foo", "one", "bar", "two");
```
- Streams

Streams have received several additions in the form of takeWhile, dropWhile, and iterate methods.
```java
Stream<String> stream = Stream.iterate("", s -> s + "s")
 .takeWhile(s -> s.length() < 10);
```
-Optionals

Optionals got an ifPresentOrElse method, which was sorely missed.
```java
user.ifPresentOrElse(this::displayAccount, this::displayLogin);
```
- Interfaces

Interfaces received private methods:
```java
public interface MyInterface {

 private static void myPrivateMethod(){
 System.out.println("Yay, I am private!");
 }
}
```

- HttpClient.

Before this, Java's native Http support was pretty low-level, and you had to resort to using third-party libraries like Apache HttpClient or OkHttp (great libraries by the way!).

## - Java 10 -
Inferring the type of a local variable: the var keyword
```java
var myName = "Marco"
```

## - Java 11 -
Java 11 was also a slightly smaller version from a developer's perspective.

- Strings and files

Strings and files have received several new methods (not all are listed here):
```java
"Marco".isBlank();
"Mar\nco".lines();
"Marco".strip();
```

- Running source files
Starting with Java 10, you can run Java source files without compiling them first. This is the step towards creating scripts.

## - Java 12 -
Java 12 comes with several new features and fixes, but the only ones worth mentioning here are support for Unicode 11 and the preview of the new switch statement, which you'll learn about in the next section.

## - Java 13 -
The full list of features can be found here, but basically you get Unicode 12.1 support, as well as two new or improved preview features (subject to change in the future):

Switch expression (Preview)
Switch expressions can now return a value. And you can use lambda-style syntax for your expressions, without error issues:

While in Java 13 switch statements might look like this:
```java
boolean result = switch (status) {
 case SUBSCRIBER -> true;
 case FREE_TRIAL -> false;
 default -> throw new IllegalArgumentException("something is murky!");
};
```

- Multiline strings (preview)
Finally, you can do this in Java:

```java
String htmlBeforeJava13 = "<html>\n" +
 " <body>\n" +
 " <p>Hello, world</p>\n" +
 " </body>\n" +
 "</html>\n";

String htmlWithJava13 = """
 <html>
 <body>
 <p>Hello, world</p>
 </body>
 </html>
 """;
```

## - Java 14 -

- Records (Records - preview)

There are now Records classes that help simplify the task of writing a lot of boilerplate code in Java.

Look at this pre-Java 14 class that only contains data, (potentially) getters/setters, equals/hashcode, toString.

```java
record Point(int x, int y) { }
```

- Checking object classes
```java
if (obj instanceof String s) {
 System.out.println(s.contains("hello"));
}
```

## - Java 15 -
- Text blocks/multi-line strings
Introduced as an experimental feature in Java 13 (see above), multiline texts are now ready for use.
```java
String text = """
 Lorem ipsum dolor sit amet, consectetur adipiscing\
 elit, sed do eiusmod tempor incididunt ut labore\
 et dolore magna aliqua.\
 """;
```

## - Java 16 -

- Pattern matching for instanceof

Now you can do the following:
```java
if (obj instanceof String s) {
 // Let pattern matching do the work!
 // ... s.substring(1)
}
```

## - Java 8 -
- Language features: lambdas, etc.

Before Java 8, whenever you wanted to instantiate, for example, a new Runnable, you had to write an anonymous inner class like this:

```java
Runnable runnable = () -> System.out.println("Hello world two!");
```

- Collections and streams

In Java 8 you also got a functional style of operations for collections, also known as the Stream API. Quick example:

```java
List<String> list = Arrays.asList("franz", "ferdinand", "fiel", "vom", "pferd");
```

- With the Streams API you can do the following:
```java
list.stream()
 .filter(name -> name.startsWith("f"))
 .map(String::toUpperCase)
 .sorted()
 .forEach(System.out::println);
```

## - Java 9 -

- Collections

Collections have received several new helper methods to easily create lists, sets, and maps.
```java
List<String> list = List.of("one", "two", "three");
Set<String> set = Set.of("one", "two", "three");
Map<String, String> map = Map.of("foo", "one", "bar", "two");
```
- Streams

Streams have received several additions in the form of takeWhile, dropWhile, and iterate methods.
```java
Stream<String> stream = Stream.iterate("", s -> s + "s")
 .takeWhile(s -> s.length() < 10);
```
-Optionals

Optionals got an ifPresentOrElse method, which was sorely missed.
```java
user.ifPresentOrElse(this::displayAccount, this::displayLogin);
```
- Interfaces

Interfaces received private methods:
```java
public interface MyInterface {

 private static void myPrivateMethod(){
 System.out.println("Yay, I am private!");
 }
}
```

- HttpClient.

Before this, Java's native Http support was pretty low-level, and you had to resort to using third-party libraries like Apache HttpClient or OkHttp (great libraries by the way!).

## - Java 10 -
Inferring the type of a local variable: the var keyword
```java
var myName = "Marco"
```

## - Java 11 -
Java 11 was also a slightly smaller version from a developer's perspective.

- Strings and files

Strings and files have received several new methods (not all are listed here):
```java
"Marco".isBlank();
"Mar\nco".lines();
"Marco".strip();
```

- Running source files
Starting with Java 10, you can run Java source files without compiling them first. This is the step towards creating scripts.

## - Java 12 -
Java 12 comes with several new features and fixes, but the only ones worth mentioning here are support for Unicode 11 and the preview of the new switch statement, which you'll learn about in the next section.

## - Java 13 -
The full list of features can be found here, but basically you get Unicode 12.1 support, as well as two new or improved preview features (subject to change in the future):

Switch expression (Preview)
Switch expressions can now return a value. And you can use lambda-style syntax for your expressions, without error issues:

While in Java 13 switch statements might look like this:
```java
boolean result = switch (status) {
 case SUBSCRIBER -> true;
 case FREE_TRIAL -> false;
 default -> throw new IllegalArgumentException("something is murky!");
};
```

- Multiline strings (preview)
Finally, you can do this in Java:

```java
String htmlBeforeJava13 = "<html>\n" +
 " <body>\n" +
 " <p>Hello, world</p>\n" +
 " </body>\n" +
 "</html>\n";

String htmlWithJava13 = """
 <html>
 <body>
 <p>Hello, world</p>
 </body>
 </html>
 """;
```

## - Java 14 -

- Records (Records - preview)

There are now Records classes that help simplify the task of writing a lot of boilerplate code in Java.

Look at this pre-Java 14 class that only contains data, (potentially) getters/setters, equals/hashcode, toString.

```java
record Point(int x, int y) { }
```

- Checking object classes
```java
if (obj instanceof String s) {
 System.out.println(s.contains("hello"));
}
```

## - Java 15 -
- Text blocks/multi-line strings
Introduced as an experimental feature in Java 13 (see above), multiline texts are now ready for use.
```java
String text = """
 Lorem ipsum dolor sit amet, consectetur adipiscing\
 elit, sed do eiusmod tempor incididunt ut labore\
 et dolore magna aliqua.\
 """;
```

## - Java 16 -

- Pattern matching for instanceof

Now you can do the following:
```java
if (obj instanceof String s) {
 // Let pattern matching do the work!
 // ... s.substring(1)
}
```
## - Java 17 -

We can user switch for object type checking
```java
switch (obj) {
    case String str -> System.out.println("String: " + str);
    case Integer i -> System.out.println("Integer: " + i);
    case Double d -> System.out.println("Double: " + d);
    default -> System.out.println("Unknown type");
}
```

Sealed Classes (sealed keyword) – Restricts class inheritance.
Pattern Matching for Switch (Preview) – More expressive switch statements.

## - Java 19 -
Virtual Threads (Preview) – Lightweight threads for concurrency (Project Loom).

Structured Concurrency (Incubator) – Simplifies multi-threaded programming.
Foreign Function & Memory API (Preview) – Efficient native memory and interop.
Pattern Matching for Switch (Third Preview) – Enhancements to switch.

## - Java 20 -
Scoped Values (Incubator) – Efficiently share data between threads.
Record Patterns (Second Preview) – Enhances pattern matching.
Virtual Threads (Second Preview) – More refinements.


## - Java 21 -
String Templates 
```java
String name = "John";
int age = 30;
String message = STR."Hello, my name is \{name} and I am \{age} years old.";
```
STR — this is processor
```java
int x = 10;
int y = 20;
String result = STR."The sum of \{x} and \{y} is \{x + y}.";
```
Can use our own custom processor
