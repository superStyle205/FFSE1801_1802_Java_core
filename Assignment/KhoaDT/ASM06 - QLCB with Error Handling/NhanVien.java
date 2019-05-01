package ASM06;

public class NhanVien {

    private String name;
    private String id;
    private double salary;
    private double salaryRate;
    private double bonus;

    public NhanVien() {
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public double getBonus() {
        return this.bonus;
    }

    public double getSalaryRate() {
        return this.salaryRate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setSalaryRate(double salaryRate) {
        this.salaryRate = salaryRate;
    }
//    public NhanVien(String name, double salary, double bonus) {
//        this.name = name;
//        this.salary = salary;
//        this.bonus = bonus;
//    }
}
