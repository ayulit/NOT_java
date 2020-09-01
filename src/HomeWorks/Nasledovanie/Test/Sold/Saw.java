package HomeWorks.Nasledovanie.Test.Sold;

public class Saw extends PowerTool implements Returnable {
    double rad;
    static int count;
    int quantity;
    String name;

    public Saw() {
        count++;
    }

    public Saw(String name, double rad, int powerConsumption) {
        super.powerConsumption = powerConsumption;
        this.rad = rad;
        this.name = name;
        count++;

    }

    public boolean hasNeededDocs() {
        if (order && passport) return true;
        else return false;
    }

    public int getDay2Return() {

        return days2Return * 2;
    }
    public static int getCount(){
        return count;
    }
//    public void showInfo(){
//        System.out.println(name,count,quantity,rad,powerConsumption);
//    }
}
