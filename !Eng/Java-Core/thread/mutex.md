##  Mutex
In a multithreaded application, two or more threads may need to access a shared resource at the same time, resulting in unexpected behavior. Examples of such shared resources are data-structures, input-output devices, files, and network connections.

We call this scenario a race condition. And, the part of the program which accesses the shared resource is known as the critical section. So, to avoid a race condition, we need to synchronize access to the critical section.

A mutex (or mutual exclusion) is the simplest type of synchronizer – it ensures that only one thread can execute the critical section of a computer program at a time.

To access a critical section, a thread acquires the mutex, then accesses the critical section, and finally releases the mutex. In the meantime, all other threads block till the mutex releases. As soon as a thread exits the critical section, another thread can enter the critical section.

## Using synchronized Keyword
First, we’ll discuss the synchronized keyword, which is the simplest way to implement a mutex in Java.

Every object in Java has an intrinsic lock associated with it. The synchronized method and the synchronized block use this intrinsic lock to restrict the access of the critical section to only one thread at a time.

Therefore, when a thread invokes a synchronized method or enters a synchronized block, it automatically acquires the lock. The lock releases when the method or block completes or an exception is thrown from them.

Let’s change getNextSequence to have a mutex, simply by adding the synchronized keyword:
``` java
public class SequenceGeneratorUsingSynchronizedMethod extends SequenceGenerator {
    
    @Override
    public synchronized int getNextSequence() {
        return super.getNextSequence();
    }

}
```

The synchronized block is similar to the synchronized method, with more control over the critical section and the object we can use for locking.

So, let’s now see how we can use the synchronized block to synchronize on a custom mutex object:
``` java
public class SequenceGeneratorUsingSynchronizedBlock extends SequenceGenerator {
    
    private Object mutex = new Object();

    @Override
    public int getNextSequence() {
        synchronized (mutex) {
            return super.getNextSequence();
        }
    }

}
```
## Using ReentrantLock
The ReentrantLock class was introduced in Java 1.5. It provides more flexibility and control than the synchronized keyword approach.

Let’s see how we can use the ReentrantLock to achieve mutual exclusion:

```java 
public class SequenceGeneratorUsingReentrantLock extends SequenceGenerator {
    
    private ReentrantLock mutex = new ReentrantLock();

    @Override
    public int getNextSequence() {
        try {
            mutex.lock();
            return super.getNextSequence();
        } finally {
            mutex.unlock();
        }
    }
}
```

## Using Semaphore
Like ReentrantLock, the Semaphore class was also introduced in Java 1.5.

While in case of a mutex only one thread can access a critical section, Semaphore allows a fixed number of threads to access a critical section. Therefore, we can also implement a mutex by setting the number of allowed threads in a Semaphore to one.

Let’s now create another thread-safe version of SequenceGenerator using Semaphore:
``` java
public class SequenceGeneratorUsingSemaphore extends SequenceGenerator {
    
    private Semaphore mutex = new Semaphore(1);

    @Override
    public int getNextSequence() {
        try {
            mutex.acquire();
            return super.getNextSequence();
        } catch (InterruptedException e) {
            // exception handling code
        } finally {
            mutex.release();
        }
    }
}
```

## Using Guava’s Monitor Class
So far, we’ve seen the options to implement mutex using features provided by Java.

However, the Monitor class of Google’s Guava library is a better alternative to the ReentrantLock class. As per its documentation, code using Monitor is more readable and less error-prone than the code using ReentrantLock.

First, we’ll add the Maven dependency for Guava:
``` xml
<dependency>
    <groupId>com.google.guava</groupId>
    <artifactId>guava</artifactId>
    <version>31.0.1-jre</version>
</dependency>
```
Now, we’ll write another subclass of SequenceGenerator using the Monitor class:
``` java
public class SequenceGeneratorUsingMonitor extends SequenceGenerator {
    
    private Monitor mutex = new Monitor();

    @Override
    public int getNextSequence() {
        mutex.enter();
        try {
            return super.getNextSequence();
        } finally {
            mutex.leave();
        }
    }

}
```