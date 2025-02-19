## Even Sourcing

Event Sourcing
Event sourcing (event sourcing, event logging, event generation) is an architectural pattern in which all changes made to the application state are stored in the sequence in which they were made. These records serve as both a source for obtaining the current state and an audit log of what happened in the system. Event sourcing promotes decentralized modification and reading of data. This architecture scales well and is suitable for systems that already work with events or are suitable for migration to such an architecture.

Event sourcing keeps pace with CQRS. The "DELUXE" scheme of the CQRS + Event Sourcing combination looks like this:

event sourcing

Event sourcing has the following advantages and disadvantages:

![Alt ​​text](/eng/img/micro-patterns/event_sourcing.png)


### Benefits of Event Sourcing

- Events are immutable and can be saved using append-only operation.
- Events can appear in the background.
- Event sourcing can help prevent conflicts caused by parallel updates, as it eliminates the need to directly update objects in the Data store. However, the domain model must be able to protect itself from requests that could cause an inconsistent state.
- Append-only storage provides an audit log that can be used to monitor events that occurred in the Data store, recreate the current state as a materialized view or projections by replaying events at any time, and simplify system testing and debugging.
- Each event can be processed by several tasks. This allows for easy integration with other services and systems that only listen for new events raised by the data store. However, event sourcing events are often low-level, which may require the creation of specific integration events.

### Disadvantages of Event Sourcing

- The biggest difficulties are usually associated with changing the way developers think. Developers should forget about conventional CRUD applications and entity stores. Now events become the main concept.
- With Event Sourcing, a lot of effort is spent on modeling events. Once events are saved to storage, they must be immutable, otherwise the history and state may be corrupted or corrupted. Event Log is raw data, which means that great care must be taken to ensure that it contains all the information necessary to obtain the complete state of the system at a specific point in time. It is also important to consider that events may be reinterpreted as the system (and the business it represents) changes over time.
- For simple business logic, the transition to Event Sourcing can be quite easy, but for more complex ones it can become a problem (especially with a large number of dependencies and relationships between entities). There may also be difficulties in integrating with external systems that do not provide data at a certain point in time.
- Event Sourcing can work well in large systems because the Event Log pattern naturally scales horizontally. For example, one entity's event log does not need to be physically co-located with another entity's event log. However, such ease of scaling leads to additional problems in the form of problem solving and the implementation of eventual consistency.
- It is important to take into account the structure of events. The structure of events may change at some point, such as the set of fields. There may be situations where historical events must be processed by current business logic. And having an extensible event schema will help in the future, if necessary, to distinguish new events from old ones. Periodic snapshots also help isolate major changes in event structure.