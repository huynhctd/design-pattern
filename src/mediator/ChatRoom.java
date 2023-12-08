package mediator;

public interface ChatRoom {
    void addMember(Member member);
    void act(Member member, Action action, String message);
}
