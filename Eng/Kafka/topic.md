- Topic separated by partitions
- Partitions stored on disk - it allowes keep message long time 
- Partitions separates by segments - regular file on disk, segment separates by passive and active. Storing on active segment
- Data is deleted by time or size. Deleting processing segment by segment from old
:retention.bytes - by size
:retention.ms - by time
- each message has Offset - unique index 


## Репликация
replication.factor
Description: Replica count by each partition in topic
Exp: replication.factor=3
min.insync.replicas
Description: Min value sync replics
Exp: min.insync.replicas=2
### Хранение данных
retention.ms
Description: Time storing messagein in topic
Exp: retention.ms=604800000 (7 дней)
retention.bytes
Description: Максимальный объём данных в топике, после чего старые сообщения удаляются
Exp: retention.bytes=10737418240 (10 GB)
segment.bytes
Description: Размер сегмента логов топика
Exp: segment.bytes=1073741824 (1 GB)
### Политики очистки
cleanup.policy
Description: Как Kafka обрабатывает старые сообщения
Значения: delete, compact
Exp: cleanup.policy=delete
### Партиции
num.partitions
Description: Количество партиций в топике
Exp: num.partitions=3