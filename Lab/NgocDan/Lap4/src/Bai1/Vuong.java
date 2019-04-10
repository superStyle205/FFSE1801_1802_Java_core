package Bai1;

public class Vuong extends ChuNhat {
	private double canh;
	public Vuong(){
		
	}public Vuong(double canh) {
		this.canh = canh;
	}
	public void setCanh(double canh) {
		this.canh = canh;
	}
	public double getCanh() {
		return canh;
	}
	public void nhap() {
		System.out.println("Nhập cạnh của hình vuông:");
		canh = sc.nextDouble();
		this.dai = canh;
		this.rong = canh;
	}
	public void xuat() {
		System.out.printf("Hình vuông cạnh %.1f%nCó chu vi là %.1f%nVà diện tích là %.1f%n", canh, getChuVi(), getDienTich());
	}
}
