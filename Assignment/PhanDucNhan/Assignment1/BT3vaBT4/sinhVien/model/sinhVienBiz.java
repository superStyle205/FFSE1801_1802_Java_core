package sinhVien.model;

public class sinhVienBiz extends sinhVienFpt {

	private double marketing;
	private double sales;
	
	public sinhVienBiz() {
		super();
	}

	public sinhVienBiz(String hoTen, String nganh,double marketing, double sales) {
		super(hoTen,nganh);
		this.marketing = marketing;
		this.sales = sales;
	}

	public double getMarketing() {
		return marketing;
	}

	public void setMarketing(double marketing) {
		this.marketing = marketing;
	}

	public double getSales() {
		return sales;
	}

	public void setSales(double sales) {
		this.sales = sales;
	}

	@Override
	public double getDiemTB() {
		return (2 * this.marketing + this.sales) / 3;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
