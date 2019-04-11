package Lap4;

public class HV extends RDC{
	private double canh;

	public HV() {

	}

	public HV(double canh) {
		super();
		this.canh = canh;
	}

	public double getCanh() {
		return canh;
	}
	public void setCanh(double canh) {
		this.canh = canh;
	}

	public double getSHV() {
		return this.getCanh() * 4;
	}
	public void xuat() {
		System.out.println("Chieu dai: "+ getCanh() + " --- Dien tich: " + getSHV());
	}
}
