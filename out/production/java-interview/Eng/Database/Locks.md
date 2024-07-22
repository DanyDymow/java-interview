## Shared lock

- Shared lock

shared locking allows other transactions to read a row and take the same shared lock on it, but does not allow them to modify the row or take an exclusive lock.

- Exclusive lock

 exclusive locking prevents other transactions from locking the row, and can also lock the row for both writing and reading, depending on the current isolation level (which is discussed below).

- Optimistic Locking

Optimistic locking is based on the assumption that lock conflicts are rare and that most transactions will not conflict with each other. When using optimistic locking, Hibernate does not lock data while it is being read, but only checks its state before saving changes. If the data was modified by another transaction, Hibernate throws an OptimisticLockException and allows you to handle the conflict.

Optimistic locking in Hibernate is implemented using the versioning mechanism. Each entity has a version field that is automatically incremented with each change. When saving changes, Hibernate checks to see if the version in the database matches the version you are trying to save. If the versions do not match, an OptimisticLockException is thrown.

For optimistic locks, everything is already done for us - this is AtomicInteger. If you look at the AtomicInteger code, you will find
regular volatile variable
```java
private volatile int value;
```
And a function that updates this variable using the Compare-and-swap (CAS) algorithm:
```java
public final native boolean compareAndSetInt(Object o, long offset, int expected, int x);
```

- Pessimistic Locking

Pessimistic locking is based on the assumption that locking conflicts occur frequently and that most transactions will conflict with each other. When using pessimistic locking, Hibernate locks data while it is being read to prevent other transactions from changing that data before the current transaction completes.

In Hibernate, pessimistic locking can be implemented using various locking strategies such as row-level locking or table-level locking. You can choose a suitable blocking strategy depending on your application requirements.

For pessimistic locks, the simplest solution is to use a synchronized block.

We get a simple class:
```java
public class Counter {
 private int counter;
 public int incrementAndGet() {
 synchronized (this) {
 counter += 1;
 return counter;
 }
 }
 public int get() {
 synchronized (this) {
 return counter;
 }
 }
}
```