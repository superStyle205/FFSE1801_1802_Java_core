package assignment6;

public class ConNguoi {
	private String maCanBo;
	private String hoTen;
	private double phuCap;
	private double heSoLuong;
	
	public String getMaCanBo() {
		return maCanBo;
	}
	public void setMaCanBo(String maCanBo) {
		this.maCanBo = maCanBo;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public double getPhuCap() {
		return phuCap;
	}
	public void setPhuCap(double phuCap) {
		this.phuCap = phuCap;
	}
	public double getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	
	public ConNguoi(String maCanBo, String hoTen, double phuCap, int heSoLuong) {
		this.maCanBo = maCanBo;
		this.hoTen = hoTen;
		this.phuCap = phuCap;
		this.heSoLuong = heSoLuong;
	}
	public ConNguoi() {
		
	}
	
	public void xuat() {
		System.out.println("Mã cán bộ : " + getMaCanBo());
		System.out.println("Họ tên : " + getHoTen());
		System.out.println("Phụ cấp : " + getPhuCap());
		System.out.println("Hệ số lương : " + getHeSoLuong());
	}
	public double getLuong() {
		return 0;
	}
	
	
}
