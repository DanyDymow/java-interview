## Concurrent vs parallels

Competition is a way of solving multiple problems simultaneously.

Signs:

The presence of several control threads (for example, Thread in Java, coroutine in Kotlin); if there is only one control thread, then there can be no concurrent execution
Non-deterministic execution result. The result depends on random events, implementation and how the synchronization was carried out. Even if each thread is completely deterministic, the final result will be non-deterministic

Parallelism is a way of performing different parts of the same task.

Signs:

Optionally has multiple threads of control
It can lead to a deterministic result, for example, the result of multiplying each element of an array by a number will not change if you multiply it in parts in parallel.