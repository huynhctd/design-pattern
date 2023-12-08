package mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoomImpl implements ChatRoom{

    List<Member> members =  new ArrayList<>();

    @Override
    public void addMember(Member member) {
        members.add(member);
        actionInRoom(Action.JOIN, null, member.getName());
    }

    @Override
    public void act(Member member, Action action, String message) {
        for (Member mem : this.members) {
            if (mem.equals(member)) {
                actionInRoom(action, message, member.getName());
            }
        }
    }

    private void actionInRoom(Action action, String message, String name) {
        switch (action) {
            case OUT:
                System.out.println(name + " has left the room");
                break;
            case JOIN:
                System.out.println("Welcome " + name + " join to room");
                break;
            case CHAT:
                System.out.println(name + " : " + message);
                break;
        }
    }
}
