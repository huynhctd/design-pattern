package mediator;

public class MemberVip extends MemberBase{

    MemberVip(String name) {
        super(name);
    }
    @Override
    public String getName() {
        return "[VIP] " + super.name;
    }
}
