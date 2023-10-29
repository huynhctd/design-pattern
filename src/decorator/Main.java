package decorator;

import decorator.beverage.Espresso;
import decorator.beverage.HouseBlend;
import decorator.topping.Mocha;
import decorator.topping.Soy;
import decorator.topping.Whip;

public class Main {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $ " +espresso.cost());

        Beverage houseBlend = new HouseBlend();
        // add Mocha 1 times
        houseBlend = new Mocha(houseBlend);
        // add Mocha 2 times
        houseBlend = new Mocha(houseBlend);
        // add Whip
        houseBlend = new Whip(houseBlend);
        //add Soy
        houseBlend = new Soy(houseBlend);
        System.out.println(houseBlend.getDescription() + " $ " +houseBlend.cost());


        Beverage houseBlend2 = new HouseBlend();
        houseBlend2.setSize(BeverageSize.GRADE);
        // add Mocha 1 times
        houseBlend2 = new Mocha(houseBlend2);
        // add Mocha 2 times
        houseBlend2 = new Mocha(houseBlend2);
        // add Whip
        houseBlend2 = new Whip(houseBlend2);
        //add Soy
        houseBlend2 = new Soy(houseBlend2);
        System.out.println(houseBlend2.getDescription() + " $ " +houseBlend2.cost());
    }
}
