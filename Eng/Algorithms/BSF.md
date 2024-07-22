Breadth-First Search (BFS) on graph:
```java
public static void bfs(Graph graph, int startVertex) {
        boolean[] visited = new boolean[graph.numVertices];
        Queue<Integer> queue = new LinkedList<>();

        // Начинаем с начальной вершины
        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            // Получаем список смежных вершин для текущей вершины
            List<Integer> neighbors = graph.adjList.get(vertex);

            // Проходим по всем смежным вершинам
            for (int neighbor : neighbors) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
```

BSF for Tree:
```java
public static void bfs(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.value + " ");

            // Добавляем всех дочерних узлов в очередь
            for (TreeNode child : node.children) {
                queue.add(child);
            }
        }
    }
```