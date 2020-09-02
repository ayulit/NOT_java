package HomeWorks.Nasledovanie.Test.Sold;

public class Saw extends PowerTool implements Returnable {
    double rad;
    boolean order;
    boolean passport;

    public Saw(String name, int powerConsumption, double rad, int price,
               boolean order, boolean passport) {

        super.powerConsumption = powerConsumption;
        super.name = name;
        super.price = price;
        this.rad = rad;
        this.order = order;
        this.passport = passport;
        quantity++;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getDay2Return() {

        return days2Return * 2;
    }

    public boolean hasNeededDocs() {
        if (order && passport) {
            return true;
        }
        else {
            return false;
        }
    }


}
