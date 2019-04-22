package Bai2;

public class HinhVuong extends Hinh{
	private double canh;
	public HinhVuong() {
		setTenHinh("Hình Vuông");
	}
	
	public double getCanh() {
		return canh;
	}

	public void setCanh(double canh) {
		this.canh = canh;
	}

	double getChuVi(){
		return getCanh()*4;
	}
	
	double getDienTich(){
		return getCanh() * getCanh();
	}
	
	double getTheTich(){
		return getCanh() * getCanh() * getCanh();
	}
	
	public void show() {
		super.showName();
		System.out.println("Cáº¡nh    \t\t: " + getCanh());
		super.show();
	}
	
}
