public class Saw extends PowerTool implements Returnable {
    double rad;

    public Saw() {
    }

    public Saw(double rad, int powerConsumption) {
        super.powerConsumption = powerConsumption;
        this.rad = rad;
    }

    public boolean getDocs() {
        if (order && passport) return true;
        else return false;
    }

    public int getDay2Return() {

        return days2Return * 2;
    }
}
