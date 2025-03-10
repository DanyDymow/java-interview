## Consumer Architecture
Consumers use the Kafka Consumer API to interact with Kafka brokers. They receive messages and process them according to their logic. Consumers can be grouped into Consumer Groups.

### Summary
"Smart" Consumer
A consumer polls Kafka
A consumer is responsible for guaranteeing processing
Automatic failover in a consumer group
Independent processing by different consumer groups
### Components
Consumer Group
Kafka uses the concept of Consumer Groups, which allows multiple consumers to work together to process data from topics in parallel. Each consumer in a group processes only a portion of the data from a topic, providing scalability and load balancing.

All messages from a single Kafka Topic are shared among all consumers in the group
If there are multiple consumers in a group, Kafka ensures that each partition of the topic is processed by only one consumer
If one of the consumers goes down, its partitions are automatically redistributed among the remaining active consumers
Offset
A consumer keeps track of the offset of each partition to know which message to continue reading from. The offset is a unique identifier for each message in a partition.

Consumers can store the offset in Kafka or externally (for example, in a database or file system). If a consumer goes down, it can resume processing where it left off by reading the stored offset.

### Poll
Consumers use the poll() method to poll Kafka for new messages. This is an asynchronous process, and Kafka will send available messages to the consumer as they become available.

The consumer can specify a timeout after which the poll() method will return an empty result if there are no messages.
The consumer must process the messages and then poll Kafka again for new data.
### Workflow
Initialization: The consumer connects to the Kafka brokers and joins the consumer group. It receives information about the partition of the topic it will read.
Subscribe to a topic: The consumer subscribes to specific topics using the subscribe() method.
Polling: The consumer calls the poll() method to get new messages. If there are messages in the queue, they are passed to the consumer for processing.
Processing messages: The consumer processes the messages, extracting useful information from each.
Committing processing: After processing a message, the consumer commits the processing using commit(). This updates the offset, allowing the consumer to continue reading from where it left off.
Error handling: In case of an error, the consumer can decide how to retry processing the message (for example, using a retry mechanism).
Shutdown: When a consumer has finished processing, it leaves the consumer group and can close the connection to Kafka.