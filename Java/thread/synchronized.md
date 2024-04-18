### Synchronization in Java 
is the ability to control access of multiple threads to any shared resource.

When multiple threads attempt to execute the same task, there is a chance of incorrect results. To address this issue, Java uses synchronization, which allows only one thread to work at any given moment.

Synchronization can be achieved in three ways:

- Synchronizing a method
``` java
class Printer {

   synchronized void print(List<String> wordsToPrint) {
       wordsToPrint.forEach(System.out::print);
       System.out.println();
   }

   public static void main(String args[]) {
       // один объект для двух тредов
       Printer printer  = new Printer();

       // создаем два треда
       Writer1 writer1 = new Writer1(printer);
       Writer2 writer2 = new Writer2(printer);

       // запускаем их
       writer1.start();
       writer2.start();
   }
}
```
- Synchronizing a specific block
``` java
/**
* Вот как добавляется блок синхронизации.
* Внутри нужно указать у кого будет взят мьютекс для блокировки.
*/
class Printer {

   void print(List<String> wordsToPrint) {
       synchronized (this) {
           wordsToPrint.forEach(System.out::print);
       }
       System.out.println();
   }

   public static void main(String args[]) {
       // один объект для двух тредов
       Printer printer = new Printer();

       // создаем два треда
       Thread writer1 = new Thread(new Runnable() {
           @Override
           public void run() {
               List<String> poem = Arrays.asList("Я ", "Writer1", " Пишу", " Письмо");
               printer.print(poem);
           }
       });
       Thread writer2 = new Thread(new Runnable() {
           @Override
           public void run() {
               List<String> poem = Arrays.asList("Не Я ", "Writer2", " Не пишу", " Не Письмо");
               printer.print(poem);
           }
       });

       // запускаем их
       writer1.start();
       writer2.start();
   }
}
```
- Static synchronization
