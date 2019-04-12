package Lab4;

public class StudentBiz extends StudentFPT {
    private double diemMarketing;
    private double diemSales;

    public StudentBiz() {
    }

    public StudentBiz(String name, String major, double diemMarketing, double diemSales) {
        super(name,major);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    public double getDiemMarketing() {
        return diemMarketing;
    }

    public double getDiemSales() {
        return diemSales;
    }

    public double getDiem (){
        return (2*diemMarketing+diemSales)/3;
    }
}
