package Lab4_Bai2;

public class SinhVienBiz extends SinhVienFpt{
	private double diemSales;
	private double diemMarketing;

	public SinhVienBiz(String hoTen, String nganh, double diemSales, double diemMarketing) {
		super(hoTen, nganh);
		this.diemSales = diemSales;
		this.diemMarketing = diemMarketing;
	}
	
	@Override
	public double getDiem() {
		return (2 * diemMarketing + diemSales) / 3;
	}
	
	@Override
	public void xuat() {
		// TODO Auto-generated method stub
		super.xuat();
		System.err.println("Điểm Marketing: " + diemMarketing);
		System.err.println("Điểm Sales: " + diemSales);
		super.show();
	}
}
