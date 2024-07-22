##ELB

The Elastic Load Balancer (ELB) is a key component of the Amazon Web Services (AWS) infrastructure designed to automatically distribute incoming application traffic across multiple Amazon EC2 instances. This ensures high availability, fault tolerance and application scalability. Let's look at the main aspects and functions of ELB:

Main types of ELB

### Application Load Balancer (ALB):

Designed for applications running at Layer 7 of the OSI model, which allows routing based on the content of HTTP/HTTPS requests.
Supports routing functionality based on URLs, headers, HTTP methods, and request parameters.
Supports websockets and HTTP/2.

### Network Load Balancer (NLB):

Operates at Layer 4 of the OSI model and is designed for high-performance applications that require low latency.
Capable of processing millions of requests per second and maintaining very low latency.
Supports TCP and UDP.

### Gateway Load Balancer (GWLB):

Specifically designed for integration with network virtual appliances such as firewalls and intrusion detection systems.
Combines load balancing and routing functions for network devices.

### Classic Load Balancer (CLB):

Operates at layers 4 and 7 of the OSI model.
Supports both HTTP/HTTPS and TCP traffic.
Typically used for applications built on earlier versions of AWS, although all new developments typically use ALB or NLB.
Basic functions of ELB

### Automatic load balancing:

ELB automatically distributes incoming traffic among EC2 instances, containers, or other target resources in one or more Availability Zones.

### High availability and fault tolerance:

ELB distributes traffic across multiple Availability Zones, ensuring application continuity even if one of the zones fails.

### Instance health:

ELB regularly checks the health of target resources (such as EC2 instances) and directs traffic only to healthy resources.

### Scalability:

ELB automatically scales in response to traffic changes, ensuring optimal application performance.

### Safety:

Supports SSL/TLS encryption for secure data exchange.
Integration with AWS Certificate Manager (ACM) for certificate management.
Configuring security groups and access policies.

### Flexible routing:

ALB allows you to do intelligent routing based on the content of HTTP/HTTPS requests.
NLB provides a static IP address and the ability to use your own IP addresses.

### Examples of using
- Web applications:

Ensure high availability and fault tolerance for websites and APIs.
Routing traffic based on URL and other parameters.
Mobile and Internet applications:

Scaling and balancing traffic for mobile applications and Internet services.
Microservice architectures:

ALB is well suited for microservice architectures, allowing requests to be routed to different services depending on the content of the request.
Enterprise applications:

Support high-performance and low-latency applications with NLB.
Management and monitoring
AWS Management Console: Web-based interface for creating and managing ELBs.
AWS CLI: Command line to automate ELB management.
AWS SDKs: Libraries for interacting with AWS APIs in various programming languages.
Amazon CloudWatch: Monitor metrics and logs for ELBs such as requests, latencies, errors, and health checks.
ELB is a powerful tool for providing high availability, fault tolerance, and scalability to applications running on AWS.