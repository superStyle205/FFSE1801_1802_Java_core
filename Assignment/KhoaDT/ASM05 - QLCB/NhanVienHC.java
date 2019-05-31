package ASM05;

import java.util.Arrays;

public class NhanVienHC extends NhanVien {
    private String department;
    private String pos;
    private int workDays;

    private String[] positions={"1", "2", "3"};

    public String getDepartment() {
        return department;
    }

    public String getPos() {
        return pos;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean setLevel(String pos) {
        if (Arrays.asList(positions).contains(pos)) {
            this.pos = pos;
            return true;
        } else {
            return false;
        }
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public NhanVienHC(String name, double salaryRate, String department, String pos, int workDays) {
        super.setName(name);
        super.setSalaryRate(salaryRate);
        this.pos = pos;
        if (pos.equals("1")){
            super.setBonus(2000);
        } else if (pos.equals("2")){
            super.setBonus(1000);
        } else if (pos.equals("3")){
            super.setBonus(500);
        }
		super.setDepartment(department);
        this.workDays = workDays;
        super.setSalary(this.getSalaryRate()*730 + this.getBonus() + workDays*30);
    }
}
