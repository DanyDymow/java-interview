## Terminology

## POD 
smallest element and in contains from 1 or several containets and there is special TOM for it and get separated IP

It is recomended to created one container for one pod


— unique IP, which allows to connect different pods betwen each other
— storage PV (if needed);
— config data which describes how container should be up 

![Alt текст](/img/k8s/pod.jpg)
![Alt текст](/img/k8s/pod.png)

## Кластер Kuberneters

- Node - узел серверов, в каждом node запускаются pod 
- Master node - один главный узел который контролирует все остальные рабочие узлы, могут быть два главных узла
 
