## Service mesh

Service mesh is a pattern that allows you to more flexibly manage traffic in Kubernetes. The service mesh consists of a control plane that collects information about the k8s cluster, the applications running in it, as well as additional objects (custom resources) that can be described for additional configuration, and the so-called sidecar containers, which are usually injected into PODs automatically using mutation webhook. Sidecar containers are reverse proxies that intercept incoming and outgoing traffic from applications in containers and manage them depending on the configuration received from the control plane.


The main tasks in which service mesh is used are:

guarantee of traffic delivery to applications (service mesh implements retry / timeouts / circuit breaker and other similar mechanisms);

increasing security by encrypting traffic, verifying traffic based on certificates, implementing additional rules and permissions for traffic transmission;

tracing requests, diagramming and visualizing traffic;

implementation of traffic switching with canary, a/b and blue/green deployment strategies.