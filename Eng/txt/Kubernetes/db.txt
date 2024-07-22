Let's say we have postgresql on a k8s cluster, and developers are asking for access to it. How can we solve this issue?
— First of all, we can deploy a web-based tooling in the cluster to work with the database, for example pgadmin, and publish it through ingress for developers.

There is also an option to use some tool for developer access to the cluster (for example, Kubernetes dashboard or LENS) with the ability to exec in POD and access the database through a command line utility.

If developers still need direct network access to the database (for example, to use their favorite database tool), we can create an account for developers in the cluster and use kubectl proxy to publish the database port on the localhost of the developer’s machine. Or raise a VPN server in the cluster.

At worst, it is possible to publish the database via Kubernetes service or ingress, but in this case we need to take care of protecting the connection to the database (users, accesses) and the protocol (enable encryption).