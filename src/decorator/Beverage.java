package decorator;

public abstract class Beverage {
    protected String description = "Unknown Beverage";
    protected BeverageSize size = BeverageSize.TALL ;

    protected Beverage(Beverage beverage) {
        this.description = beverage.getDescription();
        this.size = beverage.getSize();
    }

    public Beverage() {

    }


    public String getDescription() {
        return description;
    }

    public BeverageSize getSize() {
        return size;
    }

    public void setSize(BeverageSize size) {
        this.size = size;
    }

    public abstract double cost();
}
