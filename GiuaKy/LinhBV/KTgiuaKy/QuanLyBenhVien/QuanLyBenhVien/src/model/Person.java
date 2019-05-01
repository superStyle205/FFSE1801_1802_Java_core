package model;

public class Person {
	protected String ten;
	protected byte age;
	protected String sex;
	protected String cmnd;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	public Person(String ten, byte age, String sex, String cmnd) {
		
		this.ten = ten;
		this.age = age;
		this.sex = sex;
		this.cmnd = cmnd;
	}
	
	
}
