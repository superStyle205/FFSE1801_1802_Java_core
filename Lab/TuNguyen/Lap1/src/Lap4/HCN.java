package Lap4;

public class HCN extends RDC {

	public HCN() {
	
	}
	
	public HCN(double chieuDai, double chieuRong) {
		super(chieuDai, chieuRong);
	}
	
	public double getChuVi() {
		return (this.getChieuDai() + this.getChieuRong()) / 2;
	}
	
	public double getDienTich() {
		return (this.getChieuDai() * this.getChieuRong());
	}
	public void xuat() {
		System.out.println("Chieu dai: "+ getChieuDai()+" --- Chieu rong: " + getChieuRong() + " --- Chu vi: " + getChuVi() + " --- Dien tich: " + getDienTich());
	}
}
