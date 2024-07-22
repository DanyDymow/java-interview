## Heap Stack

Heap and Stack are two areas of memory used in programming to store data and control program execution. Here are the main differences between them:

### Purpose:

- Heap: Used to dynamically allocate memory during program execution to store objects and data created while the program is running. Objects on the heap exist for the duration of the program's execution and are accessible from anywhere in the program.
- Stack: Used to store local variables and method runtime data. Each time a method is called, a new stack frame is allocated for its local variables and context, which is then deallocated when the method completes.
### Memory management:

- Heap: Managed by an automatic garbage collection system that automatically frees memory occupied by objects that are no longer in use.
- Stack: Managed by a stack management system that automatically allocates and frees memory for local variables and method runtime data.
### Access speed:

- Heap: Objects on the heap are accessed through pointers, which can make accessing them slower than local variables on the stack.
- Stack: Accessing local variables on the stack is much faster than accessing objects on the heap because the data is closer to the processor.
### Size and restrictions:

- Heap: Heap memory is typically larger and expands dynamically as needed, although there may be a size limit depending on the operating system and JVM settings.
- Stack: The stack size is usually limited and cannot be dynamically expanded. Exceeding the limit may result in a stack overflow (StackOverflowError).
### Life cycle:

- Heap: Objects on the heap can exist longer than the program's execution time and are destroyed only when garbage collection is necessary.
- Stack: Local variables and runtime data of methods on the stack exist only during the execution of the method and are destroyed when the method terminates.