package HomeWorks.Nasledovanie.Test.Sold;

public class Drill extends PowerTool implements Returnable{
    double maxD;

    public Drill() {
    }

    public Drill(double maxD) {
        super.powerConsumption = powerConsumption;
        this.maxD = maxD;
    }
    public boolean hasNeededDocs(){
        if (order) return true;
        else return false;
    }
    public int getDay2Return(){
        return days2Return;
    }
}
