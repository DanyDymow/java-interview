## Anomalies
- Lost update
- dirty read
- non repeatable read
- phantom read
- serialization anomaly
## Решение
Уровень изоляции транзакции

### Isolation Level:

- **Default Isolation**: If you do not explicitly specify an isolation level, Spring Boot uses the default isolation level supported by the underlying database. This is often the database's default isolation level, which can vary between database systems.
- **READ_UNCOMMITTED**: Позволяет читать незакомиченые транзакции
PostgreSQL default - **READ_COMMITTED**: Позволяет читать только закомиченые транзакции и предотвращает dirty read
- **REPEATABLE_READ**: Блокирует и удерживает строки до окончания транзакции
- **SERIALIZABLE**: Все паралельные транзакции к одним данным отменяются
