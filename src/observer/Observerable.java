package observer;

public interface Observerable {
    void setState(String state);
    void add(Observer observer);
    void remove(Observer observer);
    void notifyNewState();
}
