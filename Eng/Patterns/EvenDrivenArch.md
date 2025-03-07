## Even Drive Architecture
An event-driven architecture consists of event producers that generate a stream of events, event consumers that listen for these events, and event channels that transfer events from producers to consumers.
Events are delivered in near real time, so consumers can respond immediately to events as they occur. Producers are decoupled from consumers: A producer doesn't know which consumers are listening. Consumers are also decoupled from each other, and every consumer sees all of the events. This process differs from a Competing Consumers pattern where consumers pull messages from a queue and a message is processed only one time, assuming that there are no errors. In some systems, such as Azure Internet of Things (IoT), events must be ingested at high volumes.

- Pub/sub: The publish-subscribe messaging infrastructure tracks subscriptions. When an event is published, it sends the event to each subscriber. An event can't be replayed after it's received, and new subscribers don't see the event.

- Event streaming: Events are written to a log. Events are strictly ordered within a partition and are durable. Clients don't subscribe to the stream. Instead, a client can read from any part of the stream. The client is responsible for advancing their position in the stream. That means a client can join at any time and can replay events.

On the consumer side, there are some common variations:

- Simple event processing: An event immediately triggers an action in the consumer. For example, you can use Azure Functions with an Azure Service Bus trigger so that a function runs whenever a message is published to a Service Bus topic.

- Basic event correlation: A consumer processes a few discrete business events, correlates them by some identifier, and persists information from earlier events for use when processing later events. Libraries like NServiceBus and MassTransit support this pattern.

- Complex event processing: A consumer uses a technology like Azure Stream Analytics to analyze a series of events and identify patterns in the event data. For example, you can aggregate readings from an embedded device over a time window, and generate a notification if the moving average crosses a certain threshold.

- Event stream processing: Use a data streaming platform, such as Azure IoT Hub or Apache Kafka, as a pipeline to ingest events and feed them to stream processors. The stream processors act to process or transform the stream. There might be multiple stream processors for different subsystems of the application. This approach is a good fit for IoT workloads.

### AWS Tools
- Amazon SNS (Simple Notification Service) – Pub/Sub-model
🔹 Uses for:
✅ Notification (SMS, Email, Push).
✅ Sending events to couple services
✅ Connection between microservices

📌 Example:

Service User Service pubs event "user.created" в SNS.
Email Service и Notification Service subs on SNS и gets events.

- Amazon SQS (Simple Queue Service) – message queue

- AWS EventBridge – centrilized Event Bus

🔹 Uses for:
✅ Central managing events (aggregation events).
✅ Integration microservces и SaaS-apps.
✅ triggers for automations (CI/CD, Security Alerts).

📌 Example:

Service Order Service sends event "order.placed" в EventBridge.
Inventory Service update things, and Payment Service charge money.

- AWS Lambda – processing events serverless

Lambda runs as reaction to event (from S3, EventBridge, DynamoDB, SNS, SQS).
Totally automating scaling.
🔹 Uses for:
✅ Reaction for events in real time
✅ Serverless processing events
✅ ETL (извлечение, обработка, загрузка данных).

📌 Example:

S3 downloads new file - Lambda runs with new process
DynamoDB updates → Lambda runs recalculating data


### When to use this architecture
You should use this architecture when:

Multiple subsystems must process the same events.
Real-time processing with minimum time lag is required.
Complex event processing, such as pattern matching or aggregation over time windows, is required.
High volume and high velocity of data is required, as with, for example, IoT.


### Benefits
The benefits of this architecture are:

Producers and consumers are decoupled.
No point-to-point integrations. It's easy to add new consumers to the system.
Consumers can respond to events immediately as they occur.
Highly scalable, elastic, and distributed.
Subsystems have independent views of the event stream.