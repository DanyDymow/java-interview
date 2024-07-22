## Sharding DB
Sharding is horizontal scaling DB. Using sharding id for founding entries.

## Replication DB
Database replication is the process of creating and maintaining multiple copies of a database in different locations or on different servers. The main purpose of replication is to improve data availability, distribute workload, and improve the overall performance of the database system. It also provides redundancy and fault tolerance by ensuring that data is replicated across multiple nodes either synchronously or asynchronously.

## Mirroring
On the other hand, mirroring involves creating an exact copy of the database on another server, known as a mirror server. The mirror server remains synchronized with the main server through continuous data transfer. If the primary server fails, the mirror server can easily take over.

Keep in mind that when mirroring a database, it cannot be queried until snapshots have been taken.