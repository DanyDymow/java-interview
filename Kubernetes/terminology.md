## Terminology

## POD 
самый маленький элемент и состоит из 1 или нескольких контейнеров, для него выделяет ТОМ и выделяется общий IP адрес

Рекомендуется делать один контейнер на один под

![Alt текст](/img/k8s/pod.jpg)

## Кластер Kuberneters

- Node - узел серверов, в каждом node запускаются pod 
- Master node - один главный узел который контролирует все остальные рабочие узлы, могут быть два главных узла


## Сервисы 

На всех узлах: 
- kubelet (комуникация между узлами),
- Container Runtime (создание и контроль контейнеров)
- kube-proxy (сетевые ресурсы)
