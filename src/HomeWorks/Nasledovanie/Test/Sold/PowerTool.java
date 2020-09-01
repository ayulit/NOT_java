package HomeWorks.Nasledovanie.Test.Sold;

public abstract class PowerTool implements Goods {
    int powerConsumption;
    static int count;

    public PowerTool() {
    }

    public PowerTool(int powerConsumption) {
        this.powerConsumption = powerConsumption;
        count++;
        System.out.println("Электроинструменты (товарная позиция): " + getCount());
    }

    public static int getCount(){
        return count;
    }
    public void getGoodsInfo(){
        System.out.println("Наименование: " + name + " количество : " + quantity + " ");
    }

    public String getName(){
        return name;
    }
}
