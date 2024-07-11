In Java, threads are a fundamental part of concurrent programming, allowing you to execute multiple tasks or processes concurrently. Threads enable your Java programs to efficiently utilize multi-core processors and perform tasks in parallel.

### What is a Thread?:

A thread is the smallest unit of execution in a Java program.
Java programs can consist of multiple threads, each running independently.
Threads share the same memory space within a process and can communicate with each other.

### Отличие Thread and Runnable

Чем различаются Thread и Runnable?
Thread - это класс, некоторая надстройка над физическим потоком.

Runnable - это интерфейс, представляющий абстракцию над выполняемой задачей.

Помимо того, что Runnable помогает разрешить проблему множественного наследования, несомненный плюс от его использования состоит в том, что он позволяет логически отделить логику выполнения задачи от непосредственного управления потоком.


### Creating Threads:

There are two primary ways to create threads in Java:
Extending the Thread class:
```java
class MyThread extends Thread {
    public void run() {
// Code to be executed in this thread
    }
}
```

### Implementing the Runnable interface:
```java
class MyRunnable implements Runnable {
    public void run() {
// Code to be executed in this thread
    }
}
```
Threads created by implementing Runnable are generally preferred because they allow better class design and flexibility.
### Starting Threads:

To start a thread, you need to call the start() method on a Thread object.
The run() method of the thread is executed asynchronously when start() is called.
```java
private class MyClass{
    MyThread myThread = new MyThread();
    myThread.start();
}
```

### Thread States:

Threads can be in various states, including:
New: When a thread is created but not yet started.
Runnable: When a thread is ready to run.
Blocked/Waiting: When a thread is waiting for a resource or an event.
Terminated: When a thread has completed its execution.
### Thread Lifecycle:

A thread goes through various states during its lifecycle, from creation to termination.
The start(), sleep(), wait(), and other methods control the transitions between states.

### Thread Synchronization:

Synchronization is used to ensure that only one thread accesses a shared resource at a time.
The synchronized keyword, wait(), and notify() methods are commonly used for synchronization.

### Daemon Threads:

Daemon threads are background threads that run without preventing the JVM from exiting.
They are typically used for tasks like garbage collection.
### Thread Pools:

Thread pools manage a pool of worker threads to efficiently execute tasks concurrently.
The ExecutorService framework simplifies thread pool management.
### Thread Interruption:

You can interrupt a thread's execution by calling its interrupt() method.
Threads can check their interrupted status using Thread.interrupted() or Thread.isInterrupted().
### Java Concurrency Utilities:

Java provides a rich set of concurrency utilities in the java.util.concurrent package, including ExecutorService, ThreadPoolExecutor, CountDownLatch, Semaphore, and more.
### Thread Safety in Collections:

Java collections have thread-safe counterparts, such as ConcurrentHashMap and CopyOnWriteArrayList, for safe concurrent access.
### ThreadLocal:

ThreadLocal allows each thread to have its own copy of a variable, ensuring thread safety without synchronization.
### Thread Deadlock and Starvation:

Deadlock occurs when two or more threads are blocked indefinitely, waiting for each other.
Starvation occurs when a thread is unable to gain necessary resources due to unfair scheduling.
### Thread Group:

A ThreadGroup is a way to group threads for management purposes, but it's less commonly used in modern Java.
### Thread Termination:

Threads can be terminated explicitly using Thread.stop() (deprecated) or gracefully by letting them exit their run() method.
### Java Memory Model:

Understanding the Java Memory Model is crucial for avoiding memory visibility issues and ensuring thread safety.
### Best Practices and Patterns:

Follow best practices for multithreaded programming, such as avoiding shared mutable state, using immutable objects, and minimizing the use of synchronization.
Modern Concurrency Libraries:

Consider using modern concurrency libraries like Project Loom (Java 17+) for lightweight threads and fibers.


### Shortly about thread
Multithreading in Java refers to the ability of a program to execute multiple threads concurrently. Each thread represents a separate flow of control within the program, allowing tasks to be performed simultaneously.

To ensure thread safety and prevent race conditions (where multiple threads access shared resources concurrently, potentially leading to inconsistent or incorrect behavior), Java provides several synchronization techniques:

Synchronized methods and blocks: By using the synchronized keyword, you can ensure that only one thread can execute a synchronized method or block at a time. This prevents multiple threads from accessing shared resources simultaneously.

Locks: Java's Lock interface and its implementations (such as ReentrantLock) provide a more flexible approach to synchronization compared to synchronized methods and blocks. They allow finer-grained control over locking and unlocking mechanisms.

Atomic variables: Java's java.util.concurrent.atomic package provides classes such as AtomicInteger, AtomicLong, and AtomicReference, which offer atomic operations for primitive types and object references. These classes ensure that operations on these variables are atomic and thread-safe without the need for explicit synchronization.

Thread-safe collections: The java.util.concurrent package provides thread-safe implementations of common collection classes, such as ConcurrentHashMap and CopyOnWriteArrayList, which are designed to be used in concurrent environments without the need for external synchronization.