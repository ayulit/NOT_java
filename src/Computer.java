public abstract class Computer implements Commodity{
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
