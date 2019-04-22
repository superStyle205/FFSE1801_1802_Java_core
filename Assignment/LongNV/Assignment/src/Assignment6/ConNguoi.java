package Assignment6;

public class ConNguoi {
	private int ma;
	private String ten;
	private double heSoLuong;
	public double getPhuCap() {
		return 0;
	}
	public double getLuong() {
		return 0;
	}
	
	
	public ConNguoi() {
		super();
	}
	
	public ConNguoi(int ma,String ten, double heSoLuong) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.heSoLuong = heSoLuong;
	}
	
	
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}


	public double getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public void xuat() {
		System.out.println("Mã \t\t: " + getMa());
		System.out.println("Tên \t\t: " + getTen());
		System.out.println("Hệ số lương \t: " + getHeSoLuong());
		System.out.println("Phụ cấp \t: " + getPhuCap());
	}
	
	
}
