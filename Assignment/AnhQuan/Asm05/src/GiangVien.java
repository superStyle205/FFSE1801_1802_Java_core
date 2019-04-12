
public class GiangVien {
String hoTen;
String khoa;
String trinhDo;
int phuCap;
int soTietDay;
double heSoLuong;
public GiangVien() {
	
}
public GiangVien(String hoTen, String khoa, String trinhDo, int phuCap, int soTietDay, double heSoLuong) {
	
	this.hoTen = hoTen;
	this.khoa = khoa;
	this.trinhDo = trinhDo;
	this.phuCap = phuCap;
	this.soTietDay = soTietDay;
	this.heSoLuong = heSoLuong;
}
public String getHoTen() {
	return hoTen;
}
public void setHoTen(String hoTen) {
	this.hoTen = hoTen;
}
public String getKhoa() {
	return khoa;
}
public void setKhoa(String khoa) {
	this.khoa = khoa;
}
public String getTrinhDo() {
	return trinhDo;
}
public void setTrinhDo(String trinhDo) {
	this.trinhDo = trinhDo;
}
public int getPhuCap() {
	return phuCap;
}
public void setPhuCap(int phuCap) {
	this.phuCap = phuCap;
}
public int getSoTietDay() {
	return soTietDay;
}
public void setSoTietDay(int soTietDay) {
	this.soTietDay = soTietDay;
}
public double getHeSoLuong() {
	return heSoLuong;
}
public void setHeSoLuong(double heSoLuong) {
	this.heSoLuong = heSoLuong;
}

}
