## Command Query Responsibility Segregation
Well suited for the Database per Service pattern

CQRS (Command Query Responsibility Segregation) is an architectural pattern that proposes separating write and read operations of data in an application into two separate branches. Instead of using a single interface for both operations, CQRS suggests using different data models for commands and queries. This allows you to optimize each model for specific tasks and improve application performance.

The use of CQRS can be especially useful in systems with a large number of writes or when distributed query processing is required. CQRS can also make an application easier to maintain, since changes to one part of the system will not affect other parts.

Although CQRS can be a complex architecture to get started with, when used correctly it can bring many benefits.

**CQRS Principles**

Let's look at the basic principles.

- 1. Separation of commands and requests

One of the main principles of CQRS is the separation of commands (changing state) and queries (getting state) into different models. This allows you to use different approaches to handle each of them and improve application performance and scalability.

Commands are typically processed using synchronous queries, which allows for more precise control of state changes and higher data consistency. Requests, on the other hand, can be processed using asynchronous requests, which improves application performance and scalability.

- 2. Refusal from ORM

CQRS abandons ORM (Object-Relational Mapping) in favor of using Aggregates, which represent related entities in the application and contain the logic for changing their state. This improves performance and scalability, as ORM can become a bottleneck when working with large amounts of data.

Aggregates contain state change logic, which allows for more precise change control and higher data consistency. Each unit can have its own life cycle and state.

- 3. Asynchronous processing

CQRS uses asynchronous processing to improve application performance and scalability. Asynchronous processing allows multiple operations to be performed simultaneously, which speeds up the processing of requests and commands.


### Advantages:

Improved performance: In projects with large volumes of data and high load on the servers, CQRS allows you to separate command and query logic into separate components so that query processing is faster and more efficient.

More flexible design: CQRS provides greater flexibility in application design and architecture, allowing developers to create more precise and specialized data models that better suit the requirements of a specific application.

Ease of testing: Separating command and query logic allows you to more efficiently test each component separately, making testing easier and bugs easier to find.

Increased fault tolerance: CQRS allows you to create more fault-tolerant applications by separating read and write components, which prevents the entire system from crashing if a problem occurs with one of the components.

### Flaws:

Greater complexity: CQRS requires a more complex architecture and more skilled developers, which can complicate the process of developing and maintaining applications.

Additional Costs: Implementing CQRS may require additional development and support costs, which may impact the project budget.

Not suitable for all applications: CQRS may not be suitable for all types of applications, especially those that do not have complex command and query logic or for projects with small amounts of data.