## Сервисы 

На всех nodes: 
- kubelet (комуникация между узлами),
- Container Runtime (создание и контроль контейнеров)
- kube-proxy (сетевые ресурсы)

На master node:
- API Server (сервис для комуникации всех узлов с master)
- Scheduler (сервис для планирования и распределения нагрузки между узлами)
- Kube Controller Manager (контроллер всех подов в кластере)
- Cloud Controller Manager (контроллер всех подов с cloud) 
- etcd (сохранение логов)
- DNS (позволяет использовать имена)