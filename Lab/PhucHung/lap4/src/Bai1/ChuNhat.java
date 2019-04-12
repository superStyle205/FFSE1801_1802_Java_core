package Bai1;
public class ChuNhat {
	private double rong;
	private double dai;
	
	public ChuNhat(double rong, double dai) {
		super();
		this.rong = rong;
		this.dai = dai;
	}

	public double getChuVi() {
		return (dai + rong) * 2;
	}
	
	public double getDienTich() {
		return dai * rong;
	}
	
	public void xuat() {
		System.out.println("chu vi =" + getChuVi() + "dien tich =" + getDienTich());
	}
}
