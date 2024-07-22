
Каким образом мы можем управлять размещением PODов на конкретных нодах кластера k8s?
— Для этого существует несколько возможностей.
NodeSelector/node affinity — механизм, позволяющий запускать PODы на нодах с определённым набором меток (labels). Это может быть полезно, если, например, PODы требуют определённого оборудования — скажем, у нас есть пул нод с GPU для нужд машинного обучения.
taints/tolerations — механизм, позволяющий запрещать запуск на ноде PODов (taint — описывается на ноде), которые не имеют разрешения (toleration — описывается на POD’е). Это может быть полезно, если у нас в кластере несколько окружений — мы можем выделить ноды под production и при помощи taint запретить запускать там PODы тестовых окружений.
pod affinity/antiAffinity — механизм, позволяющий группировать PODы разных приложений на общих нодах (если, например, им важен быстрый сетевой доступ) или наоборот — заставлять их запускаться на разных нодах (например, чтобы распределить PODы одного приложения по нодам кластера для повышения отказоустойчивости в случае сбоя на ноде).