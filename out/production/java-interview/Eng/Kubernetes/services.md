## Services

On all nodes:
- kubelet (communication between nodes), a process that launches, deletes, updates pods with containers;
- Container Runtime (creation and control of containers)
- kube-proxy (network resources) configures network rules on worker nodes.

On master node:
- API Server (service for communication of all nodes with master)
- Scheduler (service for scheduling and load distribution between nodes)
- Kube Controller Manager (controller of all pods in the cluster)
- Cloud Controller Manager (controller of all pods with cloud)
- etcd (saving logs)
- DNS (allows you to use names)

![Alt ​​text](/img/k8s/structure.png)