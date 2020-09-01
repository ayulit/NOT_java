public abstract class PowerTool implements Commodity{
    int powerConsumption;
    int count;

    public PowerTool() {
    }

    public PowerTool(int powerConsumption) {
        this.powerConsumption = powerConsumption;
        count++;
    }
}
