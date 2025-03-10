### Broker
- Each partition has leader-broker respons for reading and writing
- Messages writes in partition leader pool
- data replicas between brokers for fault tolerance
- In leader broker failure case the new leader broker assigned by Kafka automatically

### Broker config 
### Replication and consistency 
min.insync.replicas
Desc: Min amount syn replicas 
Exp: min.insync.replicas=2
unclean.leader.election.enable
Desc: Allow Allows leader election from stale replicas if there are no synchronized replicas
Exp: unclean.leader.election.enable=false
Логирование и хранение данных
log.dirs
Desc: Directory on disk where partition logs are stored
Exp: log.dirs=/var/lib/kafka/logs
log.retention.hours
Desc: Maximum time to store data in logs
Exp: log.retention.hours=168 (7 дней)
log.segment.bytes
Desc: Maximum size of log segment, after which a new one is created
Exp: log.segment.bytes=1073741824 (1 GB)
Производительность и задержки
num.network.threads
Desc: Number of threads to handle network requests
Exp: num.network.threads=3
num.io.threads
Desc: Number of threads for input/output
Exp: num.io.threads=8
socket.send.buffer.bytes
Desc: Buffer size for sending data over the network
Exp: socket.send.buffer.bytes=102400
Управление сообщениями
message.max.bytes
Desc: The maximum message size the broker can accept.
Exp: message.max.bytes=1048576 (1 MB)
replica.fetch.max.bytes
Desc: Maximum data size for replica request
Exp: replica.fetch.max.bytes=1048576 (1 MB)
Безопасность
ssl.keystore.location
Desc: Path to SSL keystore
Exp: ssl.keystore.location=/var/private/ssl/kafka.keystore.jks
ssl.truststore.location
Desc: Path to trusted certificate store
Exp: ssl.truststore.location=/var/private/ssl/kafka.truststore.jks