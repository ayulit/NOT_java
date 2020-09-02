package HomeWorks.Nasledovanie.Test.Sold;

public class Main {
    public static void main(String[] args) {
        AbstractItem[] market = new AbstractItem[100];

        Saw saw1 = new Saw("Пила Bosch", 3500, 12.3, 32000,
                true, false);
        market[0] = saw1;
        System.out.println(AbstractItem.getCount() + "- " + market[0].getName() + " количество " + saw1.getQuantity() + " мощность: "
                + saw1.powerConsumption + " радиус диска: "
                + saw1.rad + " цена: " + saw1.price + saw1.isRet());

        Saw saw2 = new Saw("Пила Gorenje", 4200, 11.5,
                30000, true, true);
        market[1] = saw2;
        System.out.println(AbstractItem.getCount() + "- " + market[1].getName() + " количество: " + saw2.getQuantity() + " мощность: "
                + saw2.powerConsumption + " радиус диска: "
                + saw2.rad + " цена: " + saw2.price + saw2.isRet());

        Drill drill1 = new Drill("Дрель Bosch", 2000,0.5,
                5000,true);
        market[2] = drill1;
        System.out.println(AbstractItem.getCount() + "- " + market[2].getName() + " количество " + drill1.getQuantity() + " мощность: "
                + drill1.powerConsumption + " диаметр сверла: "
                + drill1.maxD + " цена: " + drill1.price + drill1.isRet());

        Drill drill2 = new Drill("Дрель Electrolux", 2500,2.5,
                7000,false);
        market[3] = drill2;
        System.out.println(AbstractItem.getCount() + "- " + market[3].getName() + " количество " + drill2.getQuantity() + " мощность: "
                + drill2.powerConsumption + " диаметр сверла: "
                + drill2.maxD + " цена: " + drill2.price + drill2.isRet());

        JigSaw jigSaw1 = new JigSaw("Лобзик Supra", 2000,0.5,
                5000);
        market[4] = jigSaw1;
        System.out.println(AbstractItem.getCount() + "- " + market[4].getName() + " количество " + jigSaw1.getQuantity() + " мощность: "
                + jigSaw1.powerConsumption + " ширина пропила: "
                + jigSaw1.maxW + " цена: " + jigSaw1.price);

        JigSaw jigSaw2 = new JigSaw("Лобзик Электроника", 2500,2.5,
                7000);
        market[5] = jigSaw2;
        System.out.println(AbstractItem.getCount() + "- " + market[5].getName() + " количество " + jigSaw2.getQuantity() + " мощность: "
                + jigSaw2.powerConsumption + " ширина пропила: "
                + jigSaw2.maxW + " цена: " + jigSaw2.price);








        System.out.println("Всего товара в магазине: " + AbstractItem.getCount() + " единиц");



    }

}
