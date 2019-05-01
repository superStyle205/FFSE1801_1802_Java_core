package Lap6;

public class HocSinh {
	private int id;
	private String name;
	private int age;
	private String address;
	private double gpa;
	
	
	public HocSinh() {
	}
	
	public HocSinh(int id, String name, int age, String address, double gpa) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.gpa = gpa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public void xuat() {
		System.out.println("Tên : " + getName());
		System.out.println("Tuổi : " + getAge());
		System.out.println("Địa chỉ : " + getAddress());
		System.out.println("Điểm TB : " + getGpa());
	}	
}
