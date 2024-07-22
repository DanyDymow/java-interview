Let's say you have a YAML file that describes deployment and service. You enter the command kubectl create -f file.yaml . Describe in as much detail as possible what will happen after pressing the Enter key.

- First of all, the kubectl utility will find and read kubeconfig, take from there the Kubernetes API address, certificates for verifying it, the access key to it and make a request.

- Kubernetes API will receive the request, check the rights of the user who owns the key, and, if the rights allow, write information about the new deployment and service to ETCD.

- Kubernetes controller manager will see that the deployment is described, and using the Kubernetes API, write to ETCD information about the creation of a replicaset and the required number of PODs based on it. At this stage, admission controllers can come into play, which are capable of validating the correctness of PODs or transforming them.

- Kubernetes scheduler will see information about new PODs and, based on their parameters (settings of required resources, nodeSelectors, taints/tolerations, podAntiAffinity, etc.) will assign PODs to suitable nodes.

- Kubelet, once again polling the Kubernetes API, will see a change in the node’s configuration and will begin to make changes: it will launch containers using CRI, give the kube-proxy command to the network configuration, run probes when the probes are passed, change the POD status in ETCD via Kubernetes API on Ready.

- Kubernetes controller manager will see that PODs have appeared in the Ready status, which correspond to the labels described in the service, and will create records of new Endpoints for the corresponding PODs.

- Kubelets on all nodes in the cluster will see the configuration change and call kube-proxy to create Endpoints.

- Kube-proxy will be called by CNI plugins that implement Endpoints at the infrastructure level.

- When accessing the service, traffic will go to new PODs.