public abstract class PowerTool implements Commodity{
    int powerConsumption;
    static int count;

    public PowerTool() {
    }

    public PowerTool(int powerConsumption) {
        this.powerConsumption = powerConsumption;
        count++;
    }
    public static int getCount(){
        return count;
    }
}
