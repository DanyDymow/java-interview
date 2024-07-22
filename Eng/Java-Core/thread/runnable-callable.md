What is the difference between the two interfaces Runnable and Callable?

The Runnable interface was introduced in Java 1.0, and the Callable interface was introduced in Java 5.0 as part of the java.util.concurrent library;
Classes that implement the Runnable interface must implement the run() method to perform a task.
Classes that implement the Callable interface - call() method;

The Runnable.run() method does not return any value, Callable.call() returns a Future object that can contain the result of the calculation;
The run() method cannot throw checked exceptions, while the call() method can.


Характеристика	         Runnable	                                Callable
Возвращаемый результат	 void	                                    Обобщенный тип V
Обработка исключений	 Не может бросать проверяемые исключения	Может бросать проверяемые исключения
Введение	             Java 1.0	                                Java 5
Применение	             Используется с Thread	                    Используется с ExecutorService

```java
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable is running");
    }
    
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
```


```java
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "Callable result";
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        MyCallable myCallable = new MyCallable();
        Future<String> future = executor.submit(myCallable);
        
        try {
            String result = future.get(); // Получение результата выполнения
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}
```
