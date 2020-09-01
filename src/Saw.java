public class Saw extends PowerTool implements Returnable {
    double rad;
    static int count;

    public Saw() {
        count++;
    }

    public Saw(double rad, int powerConsumption) {
        super.powerConsumption = powerConsumption;
        this.rad = rad;
        count++;
    }

    public boolean getDocs() {
        if (order && passport) return true;
        else return false;
    }

    public int getDay2Return() {

        return days2Return * 2;
    }
    public static int getCount(){
        return count;
    }
}
