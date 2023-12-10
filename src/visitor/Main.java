package visitor;

public class Main {
    public static void main(String[] args) {
        Graph<String,  Integer> graph = new Graph<>();
        graph.addVertex("Huynh", 1);
        graph.addVertex("Dat", 2);
        graph.addVertex("Trung", 3);
        graph.addVertex("Son", 4);
        graph.addVertex("Lam", 5);


        graph.addEdge("Huynh", "Dat");
        graph.addEdge("Huynh", "Son");
        graph.addEdge("Dat", "Trung");
        graph.addEdge("Son", "Trung");
        graph.addEdge("Dat", "Lam");
        graph.addEdge("Son", "Lam");

        PrintVisitor printVisitor = new PrintVisitor();

        graph.deepFirstTraversal(null, printVisitor);
    }
}
