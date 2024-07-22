## architectural style of creating web API

HTTP for client-server interaction.
XML/JSON as formatting language.
A simple URI as an address for services.
Non-stationary communication.


1. Client-Server Architecture
Client and server must be clearly separated. The client is responsible for the user interface, and the server is responsible for storing data and processing requests. This allows you to change and scale the client and server parts independently of each other.

2. Stateless
Each request from a client to a server must contain all the necessary information to process the request. The server must not save state between requests from the same client. This makes scaling and query processing easier.

3. Cacheable
Server responses must be explicitly marked as cacheable or non-cacheable. Caching improves performance by reducing the need to repeatedly request the same data.

4. Uniform Interface
A consistent interface simplifies communication between clients and servers. This is achieved through:

Resource Identification: Each resource (data) is identified by a unique URL.
Resource Manipulation through Representations: Resources are manipulated by passing representations such as JSON or XML.
Self-descriptive Messages: Each message must contain all necessary information for understanding, such as Content-Type.
Hypermedia as an application engine (HATEOAS - Hypermedia As The Engine Of Application State): The client interacts with the application exclusively through hypermedia, which allows you to detect actions and clicks in the server responses.
5. Layers (Layered System)
The architecture may contain multiple layers such as load balancers, cache servers, proxies, etc. Clients do not need to be aware of the presence or absence of these layers, allowing layers to be easily added and changed without affecting the interaction between client and server.

6. Code on Demand (optional)
The server can temporarily extend or change the client's functionality by sending executable code (such as JavaScript). This is an optional principle and not required for all RESTful services.