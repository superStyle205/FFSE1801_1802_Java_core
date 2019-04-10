package Lab4bt;

public class HinhTron extends Hinh{
private double banKinh;
	public HinhTron() {
		setTenHinh("Hình tròn");
	}

	public double getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}

	double getChuVi(){
		return getBanKinh() * 2 * Math.PI;
	}
	
	double getDienTich(){
		return getBanKinh() * getBanKinh() * Math.PI;
	}
	
	double getTheTich(){
		return (4 / 3) * Math.PI * Math.pow(getBanKinh(),3)  ;
	}
	
	public void show() {
		super.showName();
		System.out.println("Bán kình    \t\t: " + getBanKinh());
		super.show();
	}
}
