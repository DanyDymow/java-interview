### Consumer Group Coordinator vs Consumer Group Leader

The consumer group coordinator is one of the brokers while the group leader is one of the consumer in a consumer group.

The group coordinator is nothing but one of the brokers which receives heartbeats (or polling for messages) from all consumers of a consumer group. Every consumer group has a group coordinator. If a consumer stops sending heartbeats, the coordinator will trigger a rebalance.

