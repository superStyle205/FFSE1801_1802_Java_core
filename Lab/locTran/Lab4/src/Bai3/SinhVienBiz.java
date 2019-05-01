package Bai3;

public class SinhVienBiz extends SinhVienFpt{
	private double mamarketting;
	private double sales;
	
	public SinhVienBiz() {
	}
	
	public SinhVienBiz(String name,double mamarketting, double sales) {
		super();
		setName(name);
		this.mamarketting = mamarketting;
		this.sales = sales;
		setJob("Biz");
	}
	public double getMamarketting() {
		return mamarketting;
	}
	public void setMamarketting(double mamarketting) {
		this.mamarketting = mamarketting;
	}
	public double getSales() {
		return sales;
	}
	public void setSales(double sales) {
		this.sales = sales;
	}
	
	public double getDiem() {
		return (getMamarketting()*2 + getSales())/3;
	}
	
	public String getHocLuc() {
		return super.xetHocLuc();
	}
}


