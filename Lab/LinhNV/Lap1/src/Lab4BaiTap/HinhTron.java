package Lab4BaiTap;

public class HinhTron extends HinhChuNhat {
	private double banKinh;

	public double getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}
	public HinhTron(double banKinh) {
		this.banKinh = banKinh;
	}
	public double getChuVi() {
		return banKinh * 2 * 3.14;
	}
	public double getDienTich() {
		return banKinh * banKinh * 3.14;
	}
	public void xuat() {
		super.xuat();
	}
}
