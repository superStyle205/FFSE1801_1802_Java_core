package Lab6.model.bean;

public class Student {
    private String id;
    private String name;
    private int age;
    private String address;
    private double gpa;

    public Student(String id, String name, int age, String address, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }
    public String getName(){
        return this.name;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }
    public double getGpa() {
        return gpa;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setGpa (double gpa) {
        this.gpa=gpa;
    }


}
