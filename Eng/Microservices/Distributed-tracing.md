## Distributed tracing

Distributed tracing in combination with logging - allows you to assign a unique ID to a request by which you can determine its entire path through all microservices

Distributed Tracing - advantages of using it for Dev and SRE
Understanding the whole picture of a distributed system;

Detailed analysis of requests;

Identification of bottlenecks;

Ability to view the entire transaction.

This is such a helicopter view of everything. But at the same time, you can look at each specific transaction under a microscope and understand how a request goes through a particular service and what bottlenecks there are. The key is to understand how to improve the system by looking at it - using distributed tracing - from the general overview to the small details.

AWS X_ray, new relic, zipkin