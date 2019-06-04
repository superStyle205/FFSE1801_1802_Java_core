package Model.Bean;

public class SinhVien {
int id;
String first_name;
String code;
String sex;
String email;
public int getId() {
	return id;
}
public SinhVien() {
	// TODO Auto-generated constructor stub
}
public SinhVien(int id, String first_name, String code, String sex, String email) {
	super();
	this.id = id;
	this.first_name = first_name;
	this.code = code;
	this.sex = sex;
	this.email = email;
}
public void setId(int id) {
	this.id = id;
}
public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
