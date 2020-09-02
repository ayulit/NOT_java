package HomeWorks.Nasledovanie.Test.Sold;

public abstract class PowerTool implements Item {
    int powerConsumption;

    public PowerTool() {
    }

    public Item getName(){
        return name;
    }

    public static int getCount(){
        return count;
    }

    public int getQuantity(){
        return quantity;
    }

}
