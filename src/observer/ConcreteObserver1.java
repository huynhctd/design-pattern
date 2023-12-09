package observer;

public class ConcreteObserver1 implements Observer{
    @Override
    public void update(String state) {
        System.out.println("ConcreteObserver1 update state : " + state);
    }
}
