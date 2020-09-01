package HomeWorks.Nasledovanie.Test.Sold;

public interface Goods {
    Goods name = null;
    int count = 0;
    int quantity = 0;

    default Goods getName(){
        return name;
    }

    static int getCount(){
        return count;
    }
    default int getQuantity(){
        return quantity;
    }

}
