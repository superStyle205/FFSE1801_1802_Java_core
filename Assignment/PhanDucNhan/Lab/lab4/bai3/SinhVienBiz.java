package lab4.bai3;

public class SinhVienBiz extends SinhVienFpt {
	private double diemMarketing;
	private double diemSales;

	public SinhVienBiz(String hoTen, String nganh, double diemMarketing, double diemSales) {
		super(hoTen, nganh);
		this.diemMarketing = diemMarketing;
		this.diemSales = diemSales;
	}

	@Override
	public double getDiem() {
		return (diemMarketing * 2 + diemSales) / 3;
	}

	@Override
	public void xuat() {
		super.xuat();
		System.out.println("diem marketing : " + diemMarketing);
		System.out.println("diem sales : " + diemSales);
	}

}
