package hocOOP_lab2.model;

public class cuaHang {
	private String ten;
	private double gia;
	private double giamGia;
	
	public cuaHang() {
		
	}
	public cuaHang(String ten, double gia, double giamGia) {
		this.ten = ten;
		this.gia = gia;
		this.giamGia = giamGia;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}

	public String getTen() {
		return this.ten;
	}
	public double getGia() {
		return this.gia;
	}
	public double getGiamGia() {
		return this.giamGia;
	}
	public double thueNhapKhau() {
		double thue = this.gia + (this.gia * 0.1);
		return thue;
	}

	public static void cre(cuaHang ...arr) {
		for(cuaHang ch : arr) {
			System.out.println("===============");
			System.out.println("Tên sản phẩm: " + ch.ten);
			System.out.println("Giá sản phẩm: " + ch.gia);
			System.out.println("Giảm giá sản phẩm: " + ch.giamGia);
			System.out.println("Thuế nhập khẩu " + ch.thueNhapKhau());
			System.out.println("===============");
		}
	}
}
