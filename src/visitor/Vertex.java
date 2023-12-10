package visitor;

import java.util.Objects;

public class Vertex <K, V>{
    private final K key;
    private final V value;

    public Vertex(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex<?, ?> vertex = (Vertex<?, ?>) o;
        return Objects.equals(key, vertex.key) && Objects.equals(value, vertex.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void accept(Visitor<Vertex<K, V>> visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
