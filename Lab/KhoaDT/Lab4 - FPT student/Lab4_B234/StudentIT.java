package Lab4;

public class StudentIT extends StudentFPT {
    private double diemJava;
    private double diemHTML;
    private double diemCSS;

    public StudentIT() {
    }

    public StudentIT(String name, String major, double diemJava, double diemHTML, double diemCSS) {
        super(name,major);
        this.diemJava = diemJava;
        this.diemHTML = diemHTML;
        this.diemCSS = diemCSS;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public double getDiemHTML() {
        return diemHTML;
    }

    public double getDiemCSS() {
        return diemCSS;
    }

    public double getDiem (){
        return (2*diemJava+diemCSS+diemHTML)/4;
    }
}
