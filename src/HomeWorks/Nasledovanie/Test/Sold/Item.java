package HomeWorks.Nasledovanie.Test.Sold;

public interface Item {
    String name = null;
    int quantity = 0;
    int price = 0;

    default String getName(){
        return name;
    }

    static int getQuantity(){
        return quantity;
    }

}
