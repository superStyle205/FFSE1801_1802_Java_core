package lab3;

public class SanPham2 {
	private String tenSp;
	private double donGia;
	private double giamGia;
	
	public SanPham2(String tenSp, double donGia, double giamGia) {
		this.tenSp = tenSp;
		this.donGia = donGia;
		this.giamGia = giamGia;
		
	}
	
	public SanPham2(String tenSp, double donGia) {
		this.tenSp = tenSp;
		this.donGia = donGia;
	}
	
	private double getThueNhapKhau() {
		return donGia * 10 / 100;
	}
	
	public void xuat() {
		System.out.println("Tên sản phẩm: " + tenSp);
		System.out.println("Đơn giá: " + donGia);
		System.out.println("Giảm giá: " + giamGia + "%");
		System.out.println("Thuế nhập khẩu là: " + getThueNhapKhau());

	}
	
	public static void main(String[] args) {
		SanPham2 sanPham1 = new SanPham2("Nuoc hoa", 15000 , 5);
		sanPham1.xuat();
		
		SanPham2 sanPham2 = new SanPham2("Dau goi", 200000);
		sanPham2.xuat();
	}
}
