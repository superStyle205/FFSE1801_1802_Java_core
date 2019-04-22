package ASM06;

import java.util.Arrays;

public class GiangVien extends NhanVien {
    private String department;
    private String level;
    private int classes;

    private String[] levels={"1", "2", "3"};

    public String getDepartment() {
        return department;
    }

    public String getLevel() {
        return level;
    }

    public int getClasses() {
        return classes;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean setLevel(String level) {
        if (Arrays.asList(levels).contains(level)) {
            this.level = level;
            return true;
        } else {
            return false;
        }
    }

    public void setClasses(int classes) {
        this.classes = classes;
    }

    public GiangVien(String id, String name, double salaryRate, String department, String level, int classes) {
        super.setId(id);
        super.setName(name);
        super.setSalaryRate(salaryRate);
        this.department = department;
        this.level = level;
        if (level.equals("1")){
            super.setBonus(300);
        } else if (level.equals("2")){
            super.setBonus(500);
        } else if (level.equals("3")){
            super.setBonus(1000);
        }
        this.classes = classes;
        super.setSalary(this.getSalaryRate()*730 + this.getBonus() + classes*45);
    }
}
