package lab4model;

public class ChuNhat {
	protected double chieuDai;
	protected double chieuRong;
	
	public ChuNhat() {
		
	}
	public ChuNhat(double chieuDai, double chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	public double getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(double chieuDai) {
		this.chieuDai = chieuDai;
	}
	public double getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}
	public double getChuVi() {
		return (chieuDai + chieuRong)*2;
	}
	public double getDienTich() {
		return chieuDai * chieuRong;
	}
	public void xuat() {
		System.out.println("Chiều rộng : " + getChieuRong());
		System.out.println("Chiều dài : " + getChieuDai());
		System.out.println("Diện tích Hình chữ nhật là: " + getDienTich());
		System.out.println("Chu vi hình chữ nhật là: " + getChuVi());
		System.out.println("<--------------------------------------------->");
	}
}
