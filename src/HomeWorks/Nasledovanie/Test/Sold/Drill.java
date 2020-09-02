package HomeWorks.Nasledovanie.Test.Sold;

public class Drill extends PowerTool implements Returnable {
    double maxD;
    boolean order;
    int quantity;

    public Drill(String name, int powerConsumption, double maxD, int price,
                 boolean order) {
        super(name, powerConsumption, price);
        this.maxD = maxD;
        this.order = order;
        quantity++;

    }

    public boolean hasNeededDocs() {
        if (order) return true;
        else return false;
    }

    public int getDay2Return() {
        return days2Return;
    }
}
