package model.bean;
import java.util.ArrayList;

public class ConNguoi{
	private String name;
	private int age;
	private String sex;
	private int cmnd;

	public ConNguoi() {
		
	}

	public ConNguoi(String name, int age, String sex, int cmnd) {
		this.name = name;
		this.age  = age;
		this.sex = sex;
		this.cmnd = cmnd;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getCmnd() {
		return cmnd;
	}
	public void setCmnd(int cmnd) {
		this.cmnd = cmnd;
	}

	public void xuat() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Sex : " + sex);
		System.out.println("CMND : " + cmnd);
	}

}
