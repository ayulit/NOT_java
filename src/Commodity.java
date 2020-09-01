public interface Commodity {
    String name = null;
    int count = 0;
    int quantity = 0;

    default String getName(){
        return name;
    }
    default int getCount(){
        return count;
    }
    default int getQuantity(){
        return quantity;
    }
}
