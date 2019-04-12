package ASM05;

public class NhanVien {

    private String name;
    private double salary;
    private double salaryRate;
    private double bonus;

    public NhanVien() {
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus;
    }

    public double getSalaryRate() {
        return salaryRate;
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
