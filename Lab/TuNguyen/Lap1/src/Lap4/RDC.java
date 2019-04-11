package Lap4;

public class RDC {
	private double chieuDai;
	private double chieuRong;
//	private double canh;
//	private double canh;
//	public double getChuVi() {
//		return 0;
//	}
//	public double getDienTich() {
//		return 0;
//	}
//	public double getSHV() {
//		return 0;
//	}
	
	public RDC() {
		
	}
	
	public RDC(double chieuDai, double chieuRong) {
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
//	public double getCanh() {
//		return canh;
//	}
//	public void setCanh(double canh) {
//		this.canh = canh;
//	}
	
}
