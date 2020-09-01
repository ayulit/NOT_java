package HomeWorks.Nasledovanie.Test.Sold;

public abstract class PowerTool implements Goods {
    int powerConsumption;
    static int count;

    public PowerTool() {
    }

    public String getName(){
        return name;
    }

    public static int getCount(){
        return count;
    }

    public int getQuantity(){
        return quantity;
    }

}
