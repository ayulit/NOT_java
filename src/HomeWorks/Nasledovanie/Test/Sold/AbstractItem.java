package HomeWorks.Nasledovanie.Test.Sold;

abstract class AbstractItem implements Item {
    String name;
    static int count;
    int quantity;
    int price;

    public AbstractItem(){
        count++;
            }

    public AbstractItem(String name, int price) {
        this.name = name;
        this.price = price;
        count++;
    }

    public String getName(){
        return name;
    }

    static int getCount(){

        return count;
    }
    public int getQuantity(){
        return quantity;
    }

}
