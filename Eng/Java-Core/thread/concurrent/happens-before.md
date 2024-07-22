There are several basic rules for the happens-before relationship:

- Within one thread, any operation happens-before any operation following it in the source code;
- Release of the monitor (unlock) happens before the capture of the same monitor (lock);
- Exiting a synchronized block/method happens before entering a synchronized block/method on the same monitor;
- Writing a volatile field happens before reading the same volatile field;
- Completion of the run() method of an instance of the Thread class happens-before exiting the join() method or returning false by the isAlive() method of an instance of the same thread;
- Calling the start() method of an instance of the Thread class happens-before the start of the run() method of an instance of the same thread;
- Completion of the constructor happens-before the beginning of the finalize() method of this class;
- Calling the interrupt() method on a thread happens before the thread detects that the method was called either by throwing an InterruptedException or using the isInterrupted() or interrupted() methods.
- The happens-before connection is transitive, i.e. if X happens-before Y, and Y happens-before Z, then X happens-before Z.
- Releasing/capturing the monitor and writing/reading to a volatile variable are related by a happens-before relationship only if the operations are performed on the same instance of the object.
- Only two threads participate in the happens-before relation; nothing can be said about the behavior of the remaining threads until each of them has a happens-before relation with another thread.