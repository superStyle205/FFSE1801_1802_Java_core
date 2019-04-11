package Bai2_3;

public class SinhVienBiz extends SinhVienFpt{
	private double diemMarketing;
	private double diemSales;
	public SinhVienBiz() {
		
	}
	public SinhVienBiz(String hoTen, String nganh, double diemMarketing, double diemSales) {
		super(hoTen,nganh);
		this.diemMarketing = diemMarketing;
		this.diemSales = diemSales;
	}
	public double getDiemMarketing() {
		return diemMarketing;
	}
	public void setDiemMarketing(double diemMarketing) {
		this.diemMarketing = diemMarketing;
	}
	public double getDiemSales() {
		return diemSales;
	}
	public void setDiemSales(double diemSales) {
		this.diemSales = diemSales;
	}
	public double getDiem() {
		return (2 * diemMarketing + diemSales) / 3;
	}
}
