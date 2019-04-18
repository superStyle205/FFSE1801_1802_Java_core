package lab.unit4;

public abstract class StudentFPT {
    private String name;
    private String major;
    public abstract double getDiem();

    public StudentFPT() {
    }

    public StudentFPT(String name, String major) {
        this.name = name;
        this.major = major;
    }

    public String getHocLuc(){
        if (getDiem()>=9){
            return "Xuat sac";
        } else if (getDiem()>=7.5){
            return "Gioi";
        } else if (getDiem()>=6.5){
            return "Kha";
        } else if (getDiem()>=5){
            return "Trung binh";
        } else {
            return "Yeu";
        }
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }
}
