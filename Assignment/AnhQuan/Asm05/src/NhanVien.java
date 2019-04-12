
public class NhanVien {
String hoTen;
String phongBan;
String chucVu;

int soNgayCong;
double heSoLuong;
int phuCap;
public NhanVien() {
	
}
public NhanVien(String hoTen, String phongBan, String chucVu, int soNgayCong, double heSoLuong, int phuCap) {
	
	this.hoTen = hoTen;
	this.phongBan = phongBan;
	this.chucVu = chucVu;
	this.soNgayCong = soNgayCong;
	this.heSoLuong = heSoLuong;
	this.phuCap = phuCap;
}
public String getHoTen() {
	return hoTen;
}
public void setHoTen(String hoTen) {
	this.hoTen = hoTen;
}
public String getPhongBan() {
	return phongBan;
}
public void setPhongBan(String phongBan) {
	this.phongBan = phongBan;
}
public String getChucVu() {
	return chucVu;
}
public void setChucVu(String chucVu) {
	this.chucVu = chucVu;
}
public int getSoNgayCong() {
	return soNgayCong;
}
public void setSoNgayCong(int soNgayCong) {
	this.soNgayCong = soNgayCong;
}
public double getHeSoLuong() {
	return heSoLuong;
}
public void setHeSoLuong(double heSoLuong) {
	this.heSoLuong = heSoLuong;
}
public int getPhuCap() {
	return phuCap;
}
public void setPhuCap(int phuCap) {
	this.phuCap = phuCap;
}
}
