## EC2

Amazon Web Services (AWS) Elastic Compute Cloud (EC2) is one of the key components of the AWS cloud platform. EC2 provides scalable computing power in the cloud, allowing users to run virtual servers, known as instances, to perform a variety of tasks. Here are the main aspects and features of AWS EC2:

Main characteristics

### Scalability:

EC2 allows you to easily scale resources by increasing or decreasing the number of instances depending on your current needs.

### Instance types:

AWS EC2 offers many instance types optimized for a variety of workloads, including General Purpose, Compute Optimized, Memory Optimized, Storage Optimized, and GPU instances.

### Amazon Machine Images (AMIs):

AMIs are templates that contain the operating system, applications, and configurations needed to run an EC2 instance.

### Networks and Security:

- Virtual Private Cloud (VPC): Isolated networks for running EC2 instances.
- Security Groups: Firewalls that control incoming and outgoing traffic for instances.
- Network Access Control Lists (NACLs): An additional layer of access control at the subnet level.

### Elastic Load Balancing (ELB):
Automatically distributes incoming traffic across multiple EC2 instances to ensure high availability and fault tolerance.

### Auto Scaling:

Automatically add or remove EC2 instances based on specific metrics (such as CPU usage) to maintain performance and cost efficiency.
### Data storage:

- Elastic Block Store (EBS): Block storage for EC2 instances.
- Instance Store: Temporary storage associated with the physical host on which the EC2 instance is running.
- Elastic File System (EFS): A scalable file system for use with EC2 instances.

### Examples of using
Web Hosting: Run web servers and applications with dynamic scaling.
Data Analysis: Processing large volumes of data using powerful computing resources.
Machine learning: Train machine learning models on powerful GPU instances.
Development and Testing: Creating and testing applications in an isolated environment.

### Management and monitoring
AWS Management Console: Web-based interface for managing instances and other AWS resources.
AWS CLI: Command line to automate the management of AWS resources.
AWS SDKs: Libraries for various programming languages ​​that allow you to interact with AWS APIs.
Amazon CloudWatch: A service for monitoring and managing AWS logs and metrics.

### Additional functions
Elastic IPs: Static IP addresses for EC2 instances.
Placement Groups: Groups for managing the placement of EC2 instances, providing low latency or high availability.
Dedicated Hosts: Dedicated physical servers to run EC2 instances, which can be useful for compliance with licensing requirements.