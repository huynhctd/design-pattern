package mediator;

import java.util.Objects;

public abstract class MemberBase implements Member {
    protected String name;

    protected ChatRoom chatRoom;

    MemberBase(String name) {
        this.name = name;
    }

    @Override
    public void joinChatRoom(ChatRoom chatRoom){
        chatRoom.addMember(this);
        this.chatRoom = chatRoom;
    }

    @Override
    public void actionToChatRoom(Action action, String message){
        if (Objects.isNull(chatRoom)) {
            System.out.println("You not already join chat room");
        }

        this.chatRoom.act(this, action, message);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberBase that = (MemberBase) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
