package decorator.topping;

import decorator.Beverage;
import decorator.BeverageSize;
import decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        super(beverage);
        this.beverage = beverage;
    }

    public BeverageSize getSize() {
        return beverage.getSize();
    }


    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
    @Override
    public double cost() {
        double cost = beverage.cost();
        if (getSize().equals(BeverageSize.TALL)) {
            cost += 0.10;
        }else if (getSize().equals(BeverageSize.GRADE)) {
            cost += 0.15;
        } else if(getSize().equals(BeverageSize.BIG)) {
            cost += 0.20;
        }
        return cost;
    }
}
