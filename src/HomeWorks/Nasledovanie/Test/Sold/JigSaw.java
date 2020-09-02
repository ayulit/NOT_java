package HomeWorks.Nasledovanie.Test.Sold;

public class JigSaw extends PowerTool {
    double maxW;
    int quantity;

    public JigSaw(String name, int powerConsumption, double maxW, int price) {
        super(name,powerConsumption,price);
        this.maxW = maxW;
        quantity++;
    }
    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}
