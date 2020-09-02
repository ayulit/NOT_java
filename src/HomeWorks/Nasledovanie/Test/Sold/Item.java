package HomeWorks.Nasledovanie.Test.Sold;

public interface Item {
    String name = null;
    int quantity = 0;
    static int count = 0;
    int price = 0;

    default String getName(){
        return name;
    }
    static int getCount(){
        return count;
    }
    default int getQuantity(){
        return quantity;
    }

}
