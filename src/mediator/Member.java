package mediator;

public interface Member {
    void joinChatRoom(ChatRoom chatRoom);
    void actionToChatRoom(Action action, String messgae);
    String getName();
}
