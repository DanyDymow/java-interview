 DSF on graph:
 ```java
 private static void dfsUtil(Graph graph, int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        // Получаем список смежных вершин для текущей вершины
        List<Integer> neighbors = graph.adjList.get(vertex);

        // Проходим по всем смежным вершинам
        for (int neighbor : neighbors) {
            if (!visited[neighbor]) {
                dfsUtil(graph, neighbor, visited);
            }
        }
    }
```
DSF on tree:
```java
public static void dfs(TreeNode root) {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.print(node.value + " ");

            // Добавляем всех дочерних узлов в стек
            List<TreeNode> children = node.children;
            for (int i = children.size() - 1; i >= 0; i--) {
                stack.push(children.get(i));
            }
        }
    }
```