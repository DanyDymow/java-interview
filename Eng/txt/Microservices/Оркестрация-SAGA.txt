## Orchestration SAGA

![Alt ​​text](/img/micro-patterns/saga.png)

We have service A, which acts as an orchestrator, it calls service B and recovers from crashes using compensatory operation if necessary.

The key point is that both services are running in their own local transactions
In this case, the request from service A to service B will be executed as part of a transaction.

Orchestration is an end-to-end consistency approach that may include retrays and rollbacks to maintain a consistent state.

Services participating in this pattern must provide idempotent operations, since retries are possible, and they must also provide endpoints for rolling back transactions to maintain data consistency.

The strength of this approach is the ability of various services that do not support distributed transactions to remain in a consistent state using only local transactions.

In this case, you can always find out the current state of the system from the coordinator.

Pros of Orchestration:
- state management between different services in a distributed system
- no need for XA transactions
- you can always find out what state the system is in

Cons of Orchestration:
- complex distributed development model
- requires idempotency and compensatory transactions
- eventual consistency
- unrecoverable failures are possible when performing compensatory transactions