## Docker Swarm: Overview & Key Concepts
Docker Swarm is a container orchestration tool that allows you to manage and scale multiple Docker containers across multiple hosts (nodes). It is natively integrated into Docker and enables easy clustering of Docker nodes into a single virtual system.

### Key Features of Docker Swarm
- Clustering & Load Balancing – Groups multiple Docker hosts into a cluster and balances workloads across them.
- Scalability – Easily scale services up or down using simple commands (docker service scale).
- High Availability – If a node or container fails, Swarm automatically reschedules containers on healthy nodes.
- Service Discovery – Swarm provides a built-in DNS to allow services to find each other within the cluster.
- Rolling Updates – Allows seamless updates of running services with minimal downtime.
- Security – Uses TLS encryption for secure communication between nodes.