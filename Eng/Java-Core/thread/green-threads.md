## Green Threads

Green (lightweight) threads (green threads) - threads emulated by a virtual machine or runtime environment. Creating a green thread does not imply creating a real OS thread.

The Java virtual machine takes care of switching between different green threads, and the machine itself runs as a single OS thread. This offers several benefits. OS threads are relatively expensive on most POSIX systems. In addition, switching between native threads is much slower than switching between green threads.

This all means that in some situations green threads are much more profitable than native threads. The system can support a much larger number of green threads than OS threads. For example, it is much more practical to start a new green thread for a new HTTP connection to a web server, instead of creating a new native thread.

However, there are also disadvantages. The biggest one is that you can't run two threads at the same time. Since there is only one native thread, it is the only one that is called by the OS scheduler. Even if you have multiple processors and multiple green threads, only one processor can call a green thread. And all because from the point of view of the OS task scheduler, all this looks like one thread.

----------------

In Java, the concept of green threads, that is, threads that are managed entirely by the virtual machine (VM) rather than the operating system, was used in very early versions of Java (before JDK 1.2). Since JDK 1.2, Java uses native threads, which are managed by the operating system.

However, the idea of ​​green threads has returned to Java with the Loom project. The Loom project adds support for lightweight threads called virtual threads, which provide high scalability and low overhead.