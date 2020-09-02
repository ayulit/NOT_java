package HomeWorks.Nasledovanie.Test.Sold;

public abstract class PowerTool extends AbstractItem {
    int powerConsumption;


    public PowerTool() {
    }

    public PowerTool(String name, int powerConsumption, int price) {
        super(name, price);
        this.powerConsumption = powerConsumption;
    }

    public String getName() {
        return name;
    }

    static int getQuantity() {
        return quantity;
    }

}
