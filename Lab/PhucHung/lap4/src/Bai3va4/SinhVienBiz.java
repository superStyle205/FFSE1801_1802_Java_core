package Bai3va4;
 
public class SinhVienBiz extends SinhVienFpt{
	private double diemMarketing;
	private double diemSales;

	public double getDiem() {
		return(2 * diemMarketing + diemSales ) / 3;
	}
	public SinhVienBiz(String hoTen, String nganh, double diemMarketing, double diemSales) {
		super(hoTen, nganh);
		this.diemMarketing = diemMarketing;
		this.diemSales = diemSales;
	}
}
