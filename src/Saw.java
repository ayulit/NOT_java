public class Saw extends PowerTool{
    double rad;

    public Saw() {
    }

    public Saw(double rad, int powerConsumption) {
        super.powerConsumption = powerConsumption;
        this.rad = rad;
    }
}
