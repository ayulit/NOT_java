package HomeWorks.Nasledovanie.Test.Sold;

public class Main {
    public static void main(String[] args) {
        AbstractItem[] market = new AbstractItem[100];

        Saw saw1 = new Saw("Пила Bosch", 3500, 12.3, 32000,
                true, true);
        market[0] = saw1;
        System.out.println(market[0].getName());
        System.out.println(market[0].getQuantity());

        Saw saw2 = new Saw("Пила Gorenje", 4200, 11.5,
                30000, true, true);
        market[1] = saw2;
        System.out.println(market[1].getName());
        System.out.println(market[1].getQuantity());

        Drill drill1 = new Drill("Дрель Bosch", 2000,0.5,
                5000,true);
        market[2] = drill1;
        System.out.println(market[2].getName());
        System.out.println(market[2].getQuantity());

        Drill drill2 = new Drill("Дрель Electrolux", 2500,2.5,
                7000,true);
        market[3] = drill2;
        System.out.println(market[3].getName());
        System.out.println(market[3].getQuantity());


        System.out.println("Всего товара в магазине: " + AbstractItem.getCount() + " единиц");



    }
}
