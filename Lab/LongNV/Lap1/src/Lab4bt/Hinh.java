package Lab4bt;

abstract public class Hinh {
	private double dai;
	private double rong;
	private double cao;
	private String tenHinh;
	
	abstract double getChuVi();
	abstract double getDienTich();
	abstract double getTheTich();
	
	public Hinh() {
		this.dai = 0;
		this.rong = 0;
		this.cao = 0;
	}
	
	public String getTenHinh() {
		return tenHinh;
	}
	public void setTenHinh(String tenHinh) {
		this.tenHinh = tenHinh;
	}
	public double getCao() {
		return cao;
	}
	public void setCao(double cao) {
		this.cao = cao;
	}
	public double getDai() {
		return dai;
	}
	public void setDai(int dai) {
		this.dai = dai;
	}
	public double getRong() {
		return rong;
	}
	public void setRong(int rong) {
		this.rong = rong;
	}
	
	public void show() {
	
		System.out.println("Chu vi  \t\t: " + getChuVi());
		System.out.println("Diện tích  \t\t: " + getDienTich());
		System.out.println("Thể tích  \t\t: " + getTheTich());
		
	}
	public void showName() {
		System.out.println("-----------" + getTenHinh() + "-----------");
	}
}
