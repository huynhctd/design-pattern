package decorator_pattern.beverage;

import decorator_pattern.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        super();
        description = "HouseBlend";
    }

    public HouseBlend(Beverage beverage) {
        super(beverage);
    }
    @Override
    public double cost() {
        return 0.89;
    }
}
