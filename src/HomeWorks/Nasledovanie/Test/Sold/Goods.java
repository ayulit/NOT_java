package HomeWorks.Nasledovanie.Test.Sold;

public interface Goods {
    String name = null;
    int count = 0;
    int quantity = 0;

    default String getName(){
        return name;
    }
    static int getCount(){
        return count;
    }
    static int getQuantity(){
        return quantity;
    }

}
