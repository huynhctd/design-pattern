package decorator_pattern.beverage;

import decorator_pattern.Beverage;

public class Espresso extends Beverage {
    public Espresso(Beverage beverage) {
        super(beverage);
    }

    public Espresso(){
        super();
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
