package baiTap2.model;

public class khachSan {
	private int soNgay;
	private String loaiP;
	private double giaP;
	private Nguoi nguoi;
	
	public khachSan(int soNgay, String loaiP, double giaP, Nguoi nguoi) {
		super();
		this.soNgay = soNgay;
		this.loaiP = loaiP;
		this.giaP = giaP;
		this.nguoi = nguoi;
	}
	public khachSan() {
		super();
	}
	public int getSoNgay() {
		return soNgay;
	}
	public void setSoNgay(int soNgay) {
		this.soNgay = soNgay;
	}
	public String getLoaiP() {
		return loaiP;
	}
	public void setLoaiP(String loaiP) {
		this.loaiP = loaiP;
	}
	public double getGiaP() {
		return giaP;
	}
	public void setGiaP(double giaP) {
		this.giaP = giaP;
	}
	public Nguoi getNguoi() {
		return nguoi;
	}
	public void setNguoi(Nguoi nguoi) {
		this.nguoi = nguoi;
	}
	@Override
	public String toString() {
		return "khachSan [soNgay=" + soNgay + ", \tloaiP=" + loaiP + ", \tgiaP=" + giaP + ", \tnguoi=" + nguoi.toString() + "]";
	}
	
	
	
}
