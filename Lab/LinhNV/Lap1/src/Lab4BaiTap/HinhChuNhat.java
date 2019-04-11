package Lab4BaiTap;

public class HinhChuNhat {
	private double rong;
	private double dai;
	
	public double getRong() {
		return rong;
	}
	public void setRong(double rong) {
		this.rong = rong;
	}
	public double getDai() {
		return dai;
	}
	public void setDai(double dai) {
		this.dai = dai;
	}
	public HinhChuNhat() {
	}
	public double getChuVi() {
		return (rong + dai) * 2;
	}
	public double getDienTich() {
		return rong * dai;
	}
	public HinhChuNhat(double rong, double dai) {
		this.rong = rong;
		this.dai = dai;
	}
	public void xuat() {
		System.out.println("Chu vi : " + getChuVi());
		System.out.println("Diện tích : " + getDienTich());
	}
}
