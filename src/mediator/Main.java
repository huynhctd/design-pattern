package mediator;

public class Main {
    public static void main(String[] args) {
        MemberNormal member1 = new MemberNormal("Dat");
        MemberNormal member2 = new MemberNormal("Trung");
        MemberVip memberVip = new MemberVip("Huynh");

        ChatRoom chatRoom =  new ChatRoomImpl();

        member1.joinChatRoom(chatRoom);
        member2.joinChatRoom(chatRoom);
        member1.actionToChatRoom(Action.CHAT, "Hello !!!");
        member2.actionToChatRoom(Action.CHAT, "Hi, Dat");

        memberVip.joinChatRoom(chatRoom);
        memberVip.actionToChatRoom(Action.CHAT, "Sone one cant left this room");

        member1.actionToChatRoom(Action.OUT, null);
    }
}
