package Lab4bt;

public class Vuong extends Hinh{
	private double canh;
	public Vuong() {
		setTenHinh("Hình vuông");
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
		System.out.println("Cạnh    \t\t: " + getCanh());
		super.show();
	}
	
}
