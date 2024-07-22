## As-if-serial

- As-if-serial semantics are a concept used in programming, especially in the context of multithreading and concurrency, to describe certain guarantees about a program's behavior. As-if-serial semantics means that a parallel or multi-threaded program must behave as if its instructions were executed sequentially (in some specific order), even if they are actually executed simultaneously or in a different order.

- sequential consistency - the same as as-if-serial semantics, a guarantee that within one thread the side effects of all operations will be as if all operations were performed sequentially.

- visibility determines when actions in one thread become visible from another thread.

- happens-before - logical restriction on the order of execution of program instructions. If it is indicated that writing to a variable and its subsequent reading are connected through this dependency, then no matter how the instructions are reordered during execution, at the time of reading all the results associated with the writing process are already recorded and visible.

- atomicity - atomicity of operations. An atomic operation looks like a single and indivisible processor command, which can either be already executed or not yet executed.

- mutual exclusion (mutually exclusive locking, single-state semaphore) - a mechanism that guarantees a thread exclusive access to a resource. Used to prevent simultaneous access to a shared resource. Only one thread can own such a resource at any given time. The simplest example: synchronized(obj) { … }.

- an ordering mechanism that determines when one thread can see the out-of-order (incorrect) execution order of another thread's instructions. To improve performance, the CPU can reorder processor instructions and execute them in random order until no difference is visible for the thread inside. The guarantee provided by this mechanism is called as-if-serial semantics.