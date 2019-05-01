package model.bean;

import java.util.ArrayList;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	private String adress;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public Person(String firstName, String lastName, int age, String adress) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.adress = adress;
	}

	public Person() {
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public void xuat() {
		System.out.println("List Person : ");
		System.out.println(" + First Name : " + getFirstName());
		System.out.println(" + Last Name : " + getLastName());
		System.out.println(" + Age : " + getAge());
		System.out.println(" + Address : " + getAdress());

	}
}
