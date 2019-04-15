package assignment5;

public class ConNguoi {
	private String hoTen;
	private double phuCap;
	private int heSoLuong;
	
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
	public int getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(int heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	
	public ConNguoi(String hoTen, double phuCap, int heSoLuong) {
		this.hoTen = hoTen;
		this.phuCap = phuCap;
		this.heSoLuong = heSoLuong;
	}
	public ConNguoi() {
		
	}
	
	public void xuat() {
		System.out.println("Họ tên : " + getHoTen());
		System.out.println("Phụ cấp : " + getPhuCap());
		System.out.println("Hệ số lương : " + getHeSoLuong());
	}
	public double getLuong() {
		return 0;
	}
	
	
}
