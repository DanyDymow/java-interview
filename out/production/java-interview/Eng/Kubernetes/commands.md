minikube start/stop/status - start minikube
minikube ssh - access to the container
minikube service [service_name] --url - opens a tunnel to the service
alias kubectl=k - create an alias for the kubectl command

k expose deploy [service_name] --port=8080 --target-port=80 - create a service for deployment where we specify the general port 8080 and the internal ports of the pods 80
k expose deploy [service_name] --type=NodePort --port=8080 --target-port=80 - create the NodePort service for deployment
k create deploy [deploy_name] image=[image_name] - create a deployment with image
k scale deploy [deploy_name] --replicas=4 - expand the deployment with additional pods
k delete deploy [deploy_name] - delete deployment
k delete pod [pod_name] - delete pod
k rollout status deploy [deploy_name] - shows process logs
k set image deploy [deploy_name] [image_name]=[hub.docker.name]/[hub.docker.image_name]:[version] - image updates
(k set image deploy k8s-web-hello k8s-web-hello-ua=mrduckjack/k8s-web-hello-ua:2.0.0)

k apply -f deployment.yaml -f service.yaml - executes all commands from the yaml file
k delete -f deployment.yaml -f service.yaml - deletes all services and delements

k get pods -o wide - look at information about pods in expanded form with IP addresses
k describe service [service_name] - get information about the service