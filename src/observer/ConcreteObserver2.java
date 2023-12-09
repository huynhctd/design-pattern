package observer;

public class ConcreteObserver2 implements Observer{
    @Override
    public void update(String state) {
        System.out.println("ConcreteObserver2 update state : " + state);
    }
}
