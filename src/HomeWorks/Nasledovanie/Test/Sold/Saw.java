package HomeWorks.Nasledovanie.Test.Sold;

public class Saw extends PowerTool implements Returnable {
    double rad;
    static int count;
    int quantity;
    String name;
    int price;

    public Saw(String name, double rad, int powerConsumption, int price) {
        super.powerConsumption = powerConsumption;
        this.rad = rad;
        this.name = name;
        this.price = price;
        quantity++;
    }

    public boolean hasNeededDocs() {
        if (order && passport) return true;
        else return false;
    }

    public int getDay2Return() {

        return days2Return * 2;
    }


}
