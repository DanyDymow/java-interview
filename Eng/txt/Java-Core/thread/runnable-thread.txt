## Runnable vs thread

Runnable
Runnable is a functional interface that is designed to define code to be executed on a thread. It contains only one run() method that needs to be implemented. Using Runnable allows you to separate the task (the code that needs to be executed) from the execution mechanism (flow control).

Thread
Thread is a class that represents a thread of execution. It can be created directly either by deriving from the Thread class or by passing an object that implements the Runnable interface to its constructor.
The Thread class provides additional methods for thread control such as start(), sleep(), join(), etc.