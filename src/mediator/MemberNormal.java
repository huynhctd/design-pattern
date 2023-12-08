package mediator;

public class MemberNormal extends MemberBase{
    MemberNormal(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "[Normal] " + super.name;
    }
}
