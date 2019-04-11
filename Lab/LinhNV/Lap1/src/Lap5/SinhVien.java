package Lap5;

public class SinhVien {
	private String lastName;
	private String firstName;
	public SinhVien(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public SinhVien() {
		// TODO Auto-generated constructor stub
	}
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
	
}
