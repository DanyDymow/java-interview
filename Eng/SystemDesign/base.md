scalability  - масшабируемость
Reliability - надежность 
latency - задержка
high availability - высокая доступность

### 1. Understand the Problem Clearly
Clarify the requirements with the interviewer. Ask questions to understand:

- Functional requirements (what the system should do).

- Non-functional requirements (scalability, performance, fault tolerance).

- Expected load (number of users, requests per second).

- Constraints (budget, timeline, technologies).

### 2. Break Down the System
Divide the system into core components (e.g., database, cache, API, load balancer, file storage).

Define how these components will interact with each other.

### 3. Evaluate Scalability
Discuss how the system will scale:

Vertical scaling (increasing server power).

Horizontal scaling (adding more servers).

Consider how the system will handle increased load (e.g., database sharding, caching, load balancing).

### 4. Plan Data Storage
Choose the appropriate database type:

- Relational (SQL) for structured data and complex queries.

- Non-relational (NoSQL) for unstructured data or high write loads.

- Discuss replication - (write,read) - provides fault tolerance , Useful for high availability, can reduce read latencies
- Sharding - Provides horizontal scalability, helps with write-heavy workloads by distributing writes across multiple machines.

### 5. Consider Performance
How to reduce latency:

Use caching (e.g., Redis, Memcached).

Optimize database queries.

Use a CDN for static files.

Discuss how the system will handle peak loads.

### 6. Ensure Fault Tolerance
Plan how the system will recover from failures:

Data replication.

Use of auto-recovery mechanisms (e.g., Kubernetes).

Backup servers and load balancers.

Discuss how to minimize downtime.

### 7. Security
Consider security aspects:

Authentication and authorization.

Data encryption (in transit and at rest).

Protection against attacks (e.g., DDoS, SQL injection).

### 8. Use Known Patterns and Best Practices
Rely on well-known architectural patterns:

Microservices vs monolithic architecture.

Event-driven architecture.

CQRS (Command Query Responsibility Segregation).

Pub/Sub (publisher/subscriber).

Mention if you’re using popular technologies (e.g., Kafka for event processing, Docker for containerization).