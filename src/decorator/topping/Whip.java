package decorator.topping;

import decorator.Beverage;
import decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        super(beverage);
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.45 + beverage.cost();
    }
}
