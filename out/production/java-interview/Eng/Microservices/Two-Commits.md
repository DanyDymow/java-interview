## Two Phase Commit

Two-Phase Commit (2PC) is a protocol for coordinating distributed transactions in systems with multiple data nodes, where transactions can affect data on multiple nodes. It is used to ensure atomicity (either all operations succeed or none) and consistency (data remains in a consistent state) of such transactions. Here are the basic concepts and steps of Two-Phase Commit:

- Preparation (Prepare Phase):
- The coordinator (usually called the Transaction Manager) sends a prepare request to all participants in the transaction.
- Transaction participants perform the necessary operations and prepare to commit or abort the transaction.
- If the participant has successfully completed all operations and is ready to commit, he sends an acknowledgment to the coordinator.
Commit Phase:
- If all participants in the transaction have successfully confirmed their readiness to commit, the coordinator sends a commit command to all participants.
- Participants execute a commit command, storing changes in a permanent data store.
- After committing the transaction, participants send confirmation to the coordinator.
- Abort Phase:
- If at least one participant reported unsuccessful preparation or commit, or the coordinator did not receive confirmation from all participants, he sends an abort command to all participants.
- Participants undo all changes associated with the transaction and return to the previous state.
- After the transaction is rolled back, participants send confirmation to the coordinator.
- It is important to note that Two-Phase Commit guarantees the atomicity and consistency of distributed transactions in the system, but due to this it can also lead to performance and fault tolerance problems due to blocking of resources while waiting for confirmations. Additionally, it does not protect against network failures or system problems.


## Two-phase commit 2 Phase Commit - 2PC

Technical requirements for 2PC implementation:

- presence of a transaction manager, for example Narayana
- reliable storage of transaction logs

The application code first contacts the coordinator and receives the transaction number.

With this number, it contacts other systems, for example, several different microservices, asking them to make changes with the specified transaction identifier

Then the application turns to the coordinator with a request to commit the transaction, after which the coordinator first sends the prepare signal to everyone; if all services responded with success (they captured write locks on their databases), then the commit signal is sent to them.

The transaction is now complete.

A two-phase commit offers the same guarantees as a single transaction in a monolith, except that there may be data errors if the transaction manager crashes.

### Pros of 2PC
- is a standard solution, there are ready-made transaction managers and many databases support it
- strict data consistency

### Cons of 2PC
- complex configuration
- low performance
- limited scalability (almost impossible to scale)
- possible failures if the transaction manager crashes
- not all systems have support (for example, NoSQL is not integrated, mq or caches may not support the specification)
- special requirements in dynamic environments such as Kubernetes