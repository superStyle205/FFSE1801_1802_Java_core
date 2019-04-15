package Assignment5;

public class ConNguoi {
	
	private String hoTen;
	
	private double heSoLuong;
	
	
	public ConNguoi() {
		
	}
	
	public ConNguoi(String hoTen, double heSoLuong) {
		this.hoTen = hoTen;
		this.heSoLuong = heSoLuong;
		
	}


	public String getHoTen() {
		return hoTen;
	}


	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}


	public double getHeSoLuong() {
		return heSoLuong;
	}


	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}


	
	
	public String toString() {
		return " Họ tên: " + hoTen + "\n Hệ số lương: " + heSoLuong ;
	}
}
