package Lab4BaiTap;

public class HinhVuong extends HinhChuNhat {
	private double canh;
	
	public double getCanh() {
		return canh;
	}
	public HinhVuong(double canh) {
		this.canh = canh;
	}
	public void setCanh(double canh) {
		this.canh = canh;
	}
	public double getChuVi() {
		return canh * 4;
	}
	public double getDienTich() {
		return canh * canh;
	}
	public void xuat() {
		super.xuat();
	}
}
