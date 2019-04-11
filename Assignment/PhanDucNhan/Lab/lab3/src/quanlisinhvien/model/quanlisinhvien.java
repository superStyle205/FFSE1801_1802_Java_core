package quanlisinhvien.model;

public class quanlisinhvien {
	private int id;
	private String name;
	private int age;
	private String adress;
	private double gpa;
	
	public quanlisinhvien() {}
	
	public quanlisinhvien(int id, String name, int age, String adress, double gpa) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.adress = adress;
		this.gpa = gpa;
	}
	public String toString() {
		String sv = "ID: " + id + " - NAME: " + name + " - AGE: " + age + " - ADRESS: " + adress + " - GPA: " + gpa;
		return sv;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGPA(double GPA) {
		this.gpa = GPA;
	}
	
	public void setAdress(String adress) {
		this.adress = adress;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public int getId() {
		return this.id;
	}
	public String getTen() {
		return this.name;
	}
	public int getTuoi() {
		return this.age;
	}
	public String getDiaChi() {
		return this.adress;
	}
	public double getDTB() {
		return this.gpa;
	}

	
	
	
	
	
	
	
	
	
	
}
