package visitor;

import java.util.*;

public class Graph <K, V>{
    private final Map<K, Vertex<K, V>> vertexByKey;
    private final Map<Vertex<K, V>, List<Vertex<K, V>>> adjVertices;

    public Graph() {
        this.vertexByKey = new HashMap<>();
        this.adjVertices = new HashMap<>();;
    }

    public void addVertex(K key, V value) {
        Vertex<K, V> vertex =  new Vertex<>(key, value);
        vertexByKey.put(key, vertex);
        adjVertices.computeIfAbsent(vertex, kvVertex -> new LinkedList<>());
    }

    public void addEdge(K key1, K key2) {
        Vertex<K, V> v1 = vertexByKey.get(key1);
        Vertex<K, V> v2 = vertexByKey.get(key2);

        if (Objects.nonNull(v1) && Objects.nonNull(v2)) {
            adjVertices.computeIfAbsent(v1, kvVertex -> new LinkedList<>()).add(v2);
            adjVertices.computeIfAbsent(v2, kvVertex -> new LinkedList<>()).add(v1);
        }
    }

    public void deepFirstTraversal(K rootKey, Visitor<Vertex<K, V>> visitor) {
        Deque<Vertex<K, V>> stack =  new ArrayDeque<>();

        Vertex<K, V> root = getRootByKey(rootKey);
        if (Objects.nonNull(root)) {
            stack.add(root);
        }

        Set<K> visited= new HashSet<>();
        while (!stack.isEmpty()) {
            Vertex<K, V> vertex = stack.pop();
            if (!visited.contains(vertex.getKey())) {
                visited.add(vertex.getKey());
                vertex.accept(visitor);
                for (Vertex<K, V> v : adjVertices.get(vertex)) {
                    stack.push(v);
                }
            }
        }
    }

    private Vertex<K, V> getRootByKey(K key) {
        Vertex<K, V> root =  null;
        if (Objects.nonNull(key)) {
            root = vertexByKey.get(key);
        } else if (!adjVertices.isEmpty()) {
            root = adjVertices.keySet().iterator().next();
        }
        return root;
    }
}
