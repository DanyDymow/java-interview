##Ingress

Ingress allows you to configure routing rules for traffic from external sources to services within the cluster.

Ingress describes the rules for routing to network services, and
The Ingress controller is responsible for executing them. The controller is not supplied with Kubernetes, but you can use one of the third-party solutions after studying their capabilities and features.

-----

— This is a reverse proxy integrated with the Kubernetes API, which allows, based on the special custom resources described in the cluster, to deliver user traffic to applications deployed in the cluster. There are many implementations of this pattern. For example, ingress-nginx from the creators of k8s based on nginx or router in openshift based on haproxy. In addition to delivering traffic, ingress allow you to create HTTPS connections based on certificates received, for example, from letsencrypt using the cert manager, as well as do many other things like timeouts/retry, limits, session affinity/sticky sessions, traffic routing for canary rollouts and so on.