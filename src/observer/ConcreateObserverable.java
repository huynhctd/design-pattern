package observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreateObserverable implements Observerable{
    private String state;

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void setState(String state) {
        this.state = state;
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyNewState() {
        observers.forEach(observer -> observer.update(this.state));
    }
}
