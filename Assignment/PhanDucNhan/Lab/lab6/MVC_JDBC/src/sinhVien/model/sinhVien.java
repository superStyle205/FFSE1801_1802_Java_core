package sinhVien.model;

public class sinhVien {
	private int id;
	private String user;
	private String pass;
	private String name;
	private String email;
	private String adress;
	public sinhVien() {
		super();
	}
	public sinhVien(int id, String user, String pass, String name, String email, String adress) {
		super();
		this.id = id;
		this.user = user;
		this.pass = pass;
		this.name = name;
		this.email = email;
		this.adress = adress;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "sinhVien [id=" + id + ", user=" + user + ", pass=" + pass + ", name=" + name + ", email=" + email
				+ ", adress=" + adress + "]";
	}
}
