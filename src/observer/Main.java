package observer;

public class Main {
    public static void main(String[] args) {
        Observerable observerable = new ConcreateObserverable();
        observerable.add(new ConcreteObserver1());
        observerable.add(new ConcreteObserver2());

        observerable.setState("start");
        observerable.notifyNewState();

        observerable.setState("stop");
        observerable.notifyNewState();
    }
}
