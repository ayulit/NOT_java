package HomeWorks.Nasledovanie.Test.Sold;

public abstract class Computer implements Item {
    int memory;
    int hardSpace;
    int numberCores;
    int count;
    int quantity;

    public Computer() {
    }

    public Computer(int memory, int hardSpace, int numberCores) {
        count++;
    }
//    public abstract int getCount();
//    public abstract int getQuantity();
}
