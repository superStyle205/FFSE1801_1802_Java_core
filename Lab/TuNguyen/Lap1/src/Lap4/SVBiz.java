package Lap4;

public class SVBiz extends SVFPT{
	
	private double marketting;
	private double sales;
	
	
	public SVBiz() {
		
	}


	public SVBiz(String hoTen, String nganh, double marketting, double sales) {
		super(hoTen, nganh);
		this.marketting = marketting;
		this.sales = sales;
	}


	public double getMarketting() {
		return marketting;
	}


	public void setMarketting(double marketting) {
		this.marketting = marketting;
	}


	public double getSales() {
		return sales;
	}


	public void setSales(double sales) {
		this.sales = sales;
	}
	
	
	public double getDiem() {
		return (2 * this.getMarketting() + this.getSales())/3;
	}
	
	@Override
	public void xuat1() {
		super.xuat1();
		System.out.println("Diem Maketting: " + getMarketting());
		System.out.println("Diem Sales: " + getSales());
		System.out.println("Diem trung binh: " + getDiem());
	}
}
