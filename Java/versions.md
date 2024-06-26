## - Java 8 -
- Возможности языка: лямбды и т.д.

До Java 8 всякий раз, когда вы хотели создать экземпляр, например, нового Runnable, вам приходилось писать анонимный внутренний класс следующим образом:

```java
Runnable runnable = () -> System.out.println("Hello world two!");
```

- Коллекции и потоки

В Java 8 вы также получили функциональный стиль операций для коллекций, также известный как Stream API. Быстрый пример:

```java
List<String> list = Arrays.asList("franz", "ferdinand", "fiel", "vom", "pferd");
```

- С помощью API Streams вы можете сделать следующее:
```java
list.stream()
    .filter(name -> name.startsWith("f"))
    .map(String::toUpperCase)
    .sorted()
    .forEach(System.out::println);
```

## - Java 9 -

- Коллекции

Коллекции получили несколько новых вспомогательных методов для простого создания списков, наборов и карт.
```java
List<String> list = List.of("one", "two", "three");
Set<String> set = Set.of("one", "two", "three");
Map<String, String> map = Map.of("foo", "one", "bar", "two");
```
- Streams

Потоки получили несколько дополнений в виде методов takeWhile, dropWhile и iterate.
```java
Stream<String> stream = Stream.iterate("", s -> s + "s")
  .takeWhile(s -> s.length() < 10);
```
- Optionals

Optionals получили метод ifPresentOrElse, которого очень не хватало.
```java
user.ifPresentOrElse(this::displayAccount, this::displayLogin);
```
- Интерфейсы

Интерфейсы получили private методы:
```java
public interface MyInterface {

    private static void myPrivateMethod(){
        System.out.println("Yay, I am private!");
    }
}
```

- HttpClient. 

До этого встроенная поддержка Http в Java была довольно низкоуровневой, и вам приходилось прибегать к использованию сторонних библиотек, таких как Apache HttpClient или OkHttp (кстати, отличные библиотеки!).

## - Java 10 -
Вывод типа локальной переменной: ключевое слово var
```java
var myName = "Marco"
```

## - Java 11 -
Java 11 также была несколько меньшей версией с точки зрения разработчика.

- Строки и файлы

Строки и файлы получили несколько новых методов (здесь перечислены не все):
```java
"Marco".isBlank();
"Mar\nco".lines();
"Marco  ".strip();
```

- Запуск исходных файлов
Начиная с Java 10, вы можете запускать исходные файлы Java без предварительной их компиляции. Это шаг к созданию сценариев.

## - Java 12 -
В Java 12 появилось несколько новых функций и исправлений, но единственные, о которых стоит упомянуть здесь, это поддержка Unicode 11 и предварительный просмотр нового выражения switch, о котором вы узнаете в следующем разделе.

## - Java 13 -
Полный список возможностей можно найти здесь, но в основном вы получаете поддержку Unicode 12.1, а также две новые или улучшенные превью функции (могут быть изменены в будущем):

Switch выражение (Preview — предварительная версия)
Switch выражения теперь могут возвращать значение. И вы можете использовать синтаксис в стиле лямбда для своих выражений, без проблем с ошибками:

В то время как в Java 13 операторы switch могут выглядеть следующим образом:
```java
boolean result = switch (status) {
    case SUBSCRIBER -> true;
    case FREE_TRIAL -> false;
    default -> throw new IllegalArgumentException("something is murky!");
};
```

- Многострочные строки (предварительная версия)
Наконец‑то, вы можете сделать это на Java:

```java
String htmlBeforeJava13 = "<html>\n" +
              "    <body>\n" +
              "        <p>Hello, world</p>\n" +
              "    </body>\n" +
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

- Records (Записи - превью)

Теперь существуют классы Records (записей), которые помогают упростить задачу написания большого количества шаблонного кода на Java.

Посмотрите на этот класс до Java 14, который содержит только данные, (потенциально) геттеры/сеттеры, equals / hashcode, toString.

```java
record Point(int x, int y) { }
```

- Проверка классов объектов
```java
if (obj instanceof String s) {
    System.out.println(s.contains("hello"));
}
```

## - Java 15 -
- Текстовые блоки / многострочные строки
Представленные в качестве экспериментальной функции в Java 13 (см. выше), многострочные тексты теперь готовы к использованию.
```java
String text = """
                Lorem ipsum dolor sit amet, consectetur adipiscing \
                elit, sed do eiusmod tempor incididunt ut labore \
                et dolore magna aliqua.\
                """;
```

## - Java 16 -

- Сопоставление шаблонов для instanceof

Теперь вы можете сделать следующее:
```java
if (obj instanceof String s) {
    // Пусть сопоставление шаблонов сделает свою работу!
    // ... s.substring(1)
}
```

## - Java 17 -
Java 17 — это новая версия Java с долгосрочной поддержкой (LTS) после Java 11.

Сопоставление шаблонов для switch (предварительная версия)
Уже доступно на многих других языках:
```java
public String test(Object obj) {

    return switch(obj) {

    case Integer i -> "An integer";

    case String s -> "A string";

    case Cat c -> "A Cat";

    default -> "I don't know what it is";

    };
}
```

- Резюме: если вы когда‑либо хотели иметь еще более жесткий контроль над тем, кому разрешено создавать подклассы ваших классов, теперь у вас есть функция sealed.
```java
public abstract sealed class Shape
    permits Circle, Rectangle, Square {...}
```

## - Java 18 -
UTF-8 по умолчанию
Если вы пытались, например, читать файлы без явного указания окончания символов, то в предыдущих версиях Java использовалась кодировка операционной системы (например, UTF-8 в Linux и macOS и Windows-1252 в Windows). В Java 18 она изменилась на UTF-8 по умолчанию.

## - Java 19 -
В Java 19 добавлено несколько интересных функций, таких как Virtual Threads (preview) и новый Foreign Function & Memory API, а также структурированный параллелизм и Vector API, но все они находятся в режиме предварительного просмотра, поэтому могут быть изменены в следующих релизах.


## - Java 21 -

- Pattern Matching for switch (JEP 441)

Паттерн-матчинг для switch наконец-то был финализирован и стал стабильной конструкцией языка. Напомним, что он появился в Java 17 и был в состоянии preview четыре релиза: 17, 18, 19 и 20.
Новый паттерн-матчинг существенно расширяет возможности оператора switch. Начиная с Java 1.0, switch поддерживал только сравнение с примитивными константами. Позже список типов был расширен (Java 5 – перечисления, Java 7 – строки), но в ветках case всё ещё могли быть только константы.

```java
Object obj = …
return switch (obj) {
    case Integer i when i > 0 -> String.format("positive int %d", i);
    case Integer i -> String.format("int %d", i);
    case String s -> String.format("String %s", s);
    case null -> System.out.println("Null");
    default -> obj.toString();
};
```

- Record Patterns (JEP 440)

Отдельным видом паттернов являются паттерны записей. Они появились в Java 19 в режиме preview и стали стабильными в Java 21.
Паттерны записей позволяют осуществлять деконструкцию значений записей чрезвычайно компактно:
```java
record Point(int x, int y) {}

static void printSum(Object obj) {
    if (obj instanceof Point(int x, int y)) {
        System.out.println(x + y);
    }
}
```

Или через оператор switch:
```java
static void printSum(Object obj) {
    switch (obj) {
        case Point(int x, int y) -> System.out.println(x + y);
        default -> System.out.println("Not a point");
    }
}
```


- String Templates (Preview)

Строковые шаблоны – новая синтаксическая возможность, позволяющая встраивать в строки выражения:

```java
int x = 10;
int y = 20;
String str = STR."\{x} plus \{y} equals \{x + y}";
```


- Unnamed Patterns and Variables (Preview) (JEP 443)

Ещё одно новшество в режиме preview: теперь можно объявлять так называемые безымянные переменные и паттерны. Делается это с помощью символа подчеркивания (_). Это часто необходимо, когда переменная или паттерн не используются:

```java
int acc = 0;
for (Order _ : orders) {
    if (acc < LIMIT) {
        … acc++ …
    }
}
```
Довольно частый пример нужности безымянных переменных – блок catch с неиспользуемым исключением:

```java
String s = …
try {
    int i = Integer.parseInt(s);
    …
} catch (NumberFormatException _) {
    System.out.println("Bad number: " + s);
}
```


- Unnamed Classes and Instance Main Methods (Preview) (JEP 445)

Теперь в режиме preview можно запускать программы с методами main(), которые не являются public static и у которых нет параметра String[] args:

```java
class HelloWorld {
    void main() {
        System.out.println("Hello, World!");
    }
}
```

В таком случае JVM сама создаст экземпляр класса (у него должен быть не-private конструктор без параметров) и вызовет у него метод main().
Протокол запуска будет выбирать метод main() согласно следующему приоритету:

```java
static void main(String[] args)
static void main()
void main(String[] args)
void main()

//Кроме того, можно писать программы и без объявления класса вовсе:


String greeting = "Hello, World!";

void main() {
    System.out.println(greeting);
}
```

- Sequenced Collections (JEP 431)

Появились три новых интерфейса SequencedCollection, SequencedSet и SequencedMap.


SequencedCollection является наследником Collection и представляет собой коллекцию с установленным порядком элементов. Такими коллекциями являются LinkedHashSet и все реализации List, SortedSet и Deque. У этих коллекций есть общее свойство последовательности элементов, но до Java 21 их общим родителем был Collection, который является слишком общим интерфейсом и не содержит многих методов, характерных для последовательностей (getFirst(), getLast(), addFirst(), addLast(), reversed() и т.д). При этом у самих вышеописанных коллекций такие методы были несогласованны друг с другом (например, list.get(0) против sortedSet.first() против deque.getFirst()), либо вовсе отсутствовали (например, linkedHashSet.getLast()).


