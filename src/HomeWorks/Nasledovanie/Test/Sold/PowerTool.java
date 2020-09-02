package HomeWorks.Nasledovanie.Test.Sold;

public abstract class PowerTool extends AbstractItem {
    int powerConsumption;

    static int countPT;


    public PowerTool() {
    countPT++;
    }

    public PowerTool(String name, int powerConsumption, int price) {
        super(name, price);
        this.powerConsumption = powerConsumption;
        countPT++;

    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public static int getCountPT() {
        return countPT;
    }
}
