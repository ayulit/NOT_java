package HomeWorks.Nasledovanie.Test.Sold;

public class Main {
    public static void main(String[] args) {
        Item[] market = new Item[100];

        Saw saw1 = new Saw("Пила Bosch", 3.11, 220, 1500);
        Saw saw2 = new Saw("Пила Gorenje", 5.11, 230, 1200);
        market[0] = saw1;
        System.out.println(market[0]);


    }
}
