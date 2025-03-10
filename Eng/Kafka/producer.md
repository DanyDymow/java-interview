Producer Architecture
- Record: The producer creates a message containing a key (optional), a value, and metadata such as the time it was sent. The message is sent to a Topic, which consists of one or more partitions
- Partition Selection: If a message key is specified, Kafka uses it to hash the message and determine which partition to write the message to (messages with the same key are put into the same partition). If no key is specified, Kafka distributes messages across partitions using round-robin or other rules
- Batching: To improve performance, the Kafka producer batches multiple messages before sending them to the broker rather than sending each message individually. This reduces network latency and the load on the broker
- Compression: To reduce the amount of data transferred, the producer can compress messages using algorithms such as GZIP, Snappy, or LZ4. Compression reduces network and storage overhead, but adds a small amount of CPU overhead
- Asynchronous Sending: The producer sends batches of messages asynchronously. This means that messages are written to a memory buffer and sent to the broker without waiting for previous operations to complete. This improves throughput
- Acknowledgments: Kafka allows you to configure the level of acknowledgments from brokers
- Retry and Idempotency: If sending a message fails, the producer can retry sending (retry). You can also enable idempotent producer mode, which prevents the same message from being sent more than once in the event of a failure, ensuring that a unique message is sent once
- Error Handling: The producer handles errors when sending messages. Depending on the settings, the producer may attempt to resend the message or report the problem via a callback

## Producer Settings
Bootstrap Servers (bootstrap.servers)
Description: Specifies the addresses of the Kafka brokers that the producer should connect to to send messages
Example: bootstrap.servers: localhost:9092,localhost:9093
Why: The Kafka producer uses these brokers to obtain metadata about the cluster (such as topic and partition information). These brokers serve as entry points into the Kafka cluster.
Serialization of key and value
The producer must serialize the data into byte format before sending it to Kafka

Key setting for serialization of key:
key.serializer
Example: key.serializer: org.apache.kafka.common.serialization.StringSerializer
Key setting for serialization of value:
value.serializer
Example: value.serializer: org.apache.kafka.common.serialization.StringSerializer
Serializer options:

StringSerializer for strings
ByteArraySerializer for byte arrays
LongSerializer for numbers
You can also implement your own serializers