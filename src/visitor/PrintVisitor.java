package visitor;

public class PrintVisitor<K, V> implements Visitor<Vertex<K, V>>{
    @Override
    public void visit(Vertex<K, V> element) {
        System.out.print(element + " ---> ");
    }
}
