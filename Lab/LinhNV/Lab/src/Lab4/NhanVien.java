package Lab4;

public class NhanVien {
	private String hoTen;
	private double luong;
	
	public NhanVien(String hoTen, double luong) {
		this.hoTen = hoTen;
		this.luong = luong;
	}
	public void xuat() {
		System.out.printf("Tên %s lương %.1f \n", hoTen , luong);
		System.out.println("Thu nhập " + getThuNhap());
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public double getLuong() {
		return luong;
	}
	public void setLuong(double luong) {
		this.luong = luong;
	}
	public double getThuNhap() {
		return luong * 12;
	}
}
