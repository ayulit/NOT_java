package HomeWorks.Nasledovanie.Test.Sold;

public class Main {
    public static void main(String[] args) {
        AbstractItem[] market = new AbstractItem[100];

        Saw saw1 = new Saw("Пила Bosch", 3500, 12.3, 32000, true, true);
        Saw saw2 = new Saw("Пила Gorenje", 4200, 11.5, 30000, true, true);

        market[0] = saw2;
        System.out.println(market[0].getName());
        System.out.println(Saw.getQuantity());

        market[1] = saw1;
        System.out.println(market[1].getName());
        System.out.println(Saw.getQuantity());


    }
}
