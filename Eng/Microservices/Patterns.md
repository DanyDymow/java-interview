## Microservice patterns
- Chained design pattern

The Chain microservice design pattern produces a single, consolidated response to a request. In this case, Service A receives a request from a client, communicates with Service B, which in turn can contact Service C. All of these services will most likely exchange synchronous request/response messages over HTTP.
![Alt ​​text](/img/micro-patterns/chained.png)


- Asynchronous Messaging pattern

As widespread and understandable as the REST pattern is, it has an important limitation: it is synchronous and, therefore, blocking. It is possible to provide asynchrony, but this is done differently in each application. Therefore, some microservice architectures may use message queues rather than the REST request/response model.
![Alt ​​text](/img/micro-patterns/asynchronous.png)


- API Gateway / Aggregator

This provides a single entry point for all services, rather than the client having to communicate directly with each service. The API gateway provides aggregation, authentication, caching, etc.
![Alt ​​text](/img/micro-patterns/api.png)


- Service Discovery/Service Registery

Service Discovery was created so that at minimal cost you can connect a new application to our existing environment. Using Service Discovery, we can maximally separate either a Docker container or a virtual service from the environment in which it is running.

![Alt ​​text](/img/micro-patterns/service-registery.png)

Here we see that we are launching a third instance of the application. Accordingly, when the application starts, it registers with Service Discovery. Service Discovery notifies load-balancer. Load-balancer changes its config automatically and the new backend is put into operation. In this way, backends can be added, or, conversely, excluded from work.

-Bulkheads

This pattern gets its name from ship bulkheads. They divide the ship's interior into compartments, allowing a hole in the hull to be isolated. In this case, only one or several compartments are flooded, the rest remain dry and keep the ship afloat. In a software context, the pattern involves dividing a service's resources into several independent units, for example, creating two pools of database connections: one for critical tasks, one for the rest. Thus, one fully occupied pool will not lead to a complete denial of customer service and the service will maintain limited performance.

- Circuit breaker

To limit the execution time of an operation or request, we can use timeouts. They help prevent operations from stalling, but finding appropriate times in complex, dynamic, distributed systems is nearly impossible. Therefore, instead of relying on timeouts, you should use the fuse pattern.

The fuse protects service resources (connections, handles), preventing them from being used if the called service fails. At the same time, the called service will recover faster after a failure, since it does not receive requests from other services.

The fuse opens when it detects a certain number of errors in a short period of time. All subsequent requests through it will return an error immediately, without sending to an external service. The fuse maintains this state for a specified period of time, after which it closes and again passes all requests to the external service.


- Service Mesh

Service Mesh is a fairly simple integration pattern to provide network elasticity mechanisms, improve security and visibility of applications. Most often, Service Mesh is used in cloud infrastructures, that is, in containers and Kubernetes.


The conceptual Service Mesh consists of two parts.

The first part is Control Plane. Responsible for assigning and distributing traffic routing policies, artifacts, security, tokens, keys, certificates. And also for collecting telemetry and integrating with external infrastructure. Most often these are PKI, logging, monitoring, etc.

The second part is the Data Plane. It is located directly with applications and does a very simple thing: it executes the policies that it receives from the Control Plane. Accordingly, Data Plane are most often network proxies that are responsible for routing and balancing traffic in a busy environment. Data Plane also performs authentication, authorization of all calls, generates spans for distributed tracing and metrics in order to increase the level of visibility of microservice systems.