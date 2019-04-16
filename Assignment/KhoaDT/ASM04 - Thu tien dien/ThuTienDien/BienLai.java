package ThuTienDien;

public class BienLai {
    private String counter;
    private double oldIndex;
    private double newIndex;

    public BienLai(String counter, double oldIndex, double newIndex) {
        this.counter = counter;
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
    }

    public double getCount(){
        double result=newIndex-oldIndex;
        return result;
    }
    public String getCounter(){
        return counter;
    }
    public double getCost(){
        double cost=getCount()*750;
        return cost;
    }
}
