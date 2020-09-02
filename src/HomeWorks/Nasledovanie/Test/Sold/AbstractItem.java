package HomeWorks.Nasledovanie.Test.Sold;

abstract class AbstractItem implements Item {
    String name;
    static int quantity;
    int price;

    public AbstractItem(){
            }

    public AbstractItem(String name, int price) {
        this.name = name;
        this.price = price;

    }
    public String getName(){
        return name;
    }

    static int getQuantity(){
        return quantity;
    }

}
