package Bai1;
public class Vuong extends ChuNhat{
	private double canh;
	
	public double getChuVi() {
		return canh * 4;
	}
	
	public double getDienTich() {
		return canh * canh;
	}

	public Vuong(double canh) {
		super(canh , canh);
		this.canh = canh;
	}

	public void xuat() {
		System.out.println("chu vi =" + getChuVi() + "dien tich =" + getDienTich());
	}
}
