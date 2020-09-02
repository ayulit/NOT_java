package HomeWorks.Nasledovanie.Test.Sold;

public class Saw extends PowerTool implements Returnable {
    double rad;

    public Saw(String name, int powerConsumption, double rad, int price,
               boolean order, boolean passport) {

        super.powerConsumption = powerConsumption;
        super.name = name;
        super.price = price;
        this.rad = rad;
        quantity++;
    }

    public String getName() {
        return name;
    }

    static int getQuantity() {
        return quantity;
    }

    public boolean hasNeededDocs() {
        if (order && passport) {
            return true;
        }
        else {
            return false;
        }
    }

    public int getDay2Return() {

        return days2Return * 2;
    }


}
