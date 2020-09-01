package HomeWorks.Nasledovanie.Test.Sold;

public abstract class PowerTool implements Goods {
    int powerConsumption;

    public PowerTool() {
    }

    public Goods getName(){
        return name;
    }

    public static int getCount(){
        return count;
    }

    public int getQuantity(){
        return quantity;
    }

}
