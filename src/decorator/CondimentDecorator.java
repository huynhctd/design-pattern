package decorator;

public abstract class CondimentDecorator extends Beverage{
    public CondimentDecorator(Beverage beverage) {
        super(beverage);
    }

    public abstract double cost();
}
