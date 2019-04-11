package assignment42;

public class SinhVienBiz extends SinhVienFPT{
	private double diemSale;
	private double diemMaketing;
	public SinhVienBiz() {
		
	}
	public SinhVienBiz(double diemSale, double diemMaketing)
	{
		this.diemMaketing = diemMaketing;
		this.diemSale = diemSale;
	}
	public double getDiemSale() {
		return diemSale;
	}
	public void setDiemSale(double diemSale) {
		this.diemSale = diemSale;
	}
	public double getDiemMaketing() {
		return diemMaketing;
	}
	public void setDiemMaketing(double diemMaketing) {
		this.diemMaketing = diemMaketing;
	}
	@Override
	public double getDiem() {
		return (2*diemMaketing + diemSale) / 3;
	}

	@Override
	public void xuat() {
		super.xuat();
		System.out.println("Điểm Marketting: " +getDiemMaketing());
		System.out.println("Điểm Sales: " + getDiemSale());
		System.out.println("Xếp loại: " + getDiem());
	}
}
