package HomeWorks.Nasledovanie.Test.Sold;

public interface Item {
    Item name = null;
    int count = 0;
    int quantity = 0;

    default Item getName(){
        return name;
    }

    static int getCount(){
        return count;
    }
    default int getQuantity(){
        return quantity;
    }

}
