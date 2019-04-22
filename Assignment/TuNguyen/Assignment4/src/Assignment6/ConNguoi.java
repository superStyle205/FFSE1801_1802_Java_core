package Assignment6;

public class ConNguoi {
	
	private String id;
	
	private String hoTen;
	
	private double heSoLuong;
	
	public double getLuong() {
		return 0;
	}
	
	public double getPhuCap() {
		return 0;
	}
	
	
	public ConNguoi() {
		
	}
	
	public ConNguoi(String id ,String hoTen, double heSoLuong) {
		this.id = id;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	public String toString() {
		return "ID: " + id + " Họ tên: " + hoTen + "\n Hệ số lương: " + heSoLuong ;
	}
}
