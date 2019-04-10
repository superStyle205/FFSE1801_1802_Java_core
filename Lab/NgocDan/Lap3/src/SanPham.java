import java.util.Scanner;

//------------> Bài 1 + Bài 3 + Bài 4 <-------------
public class SanPham {
	public static Scanner sc = new Scanner(System.in);
	public static String tenSanPham;
	public static double donGia;
	public static double giamGia;

	double getThueNhapKhau() {
		return donGia * 10 / 100;
	}

	void nhap() {
		System.out.println("Nhập tên sản phẩm:");
		tenSanPham = sc.nextLine();
		System.out.println("Nhập đơn giá:");
		donGia = sc.nextDouble();
		System.out.println("Nhập giảm giá:");
		giamGia = sc.nextDouble();
	}

	void xuat() {
		System.out.print("Tên sản phẩm:	");
		System.out.println(tenSanPham);
		System.out.print("Đơn giá:	");
		System.out.println(donGia);
		System.out.print("Giảm giá:	");
		System.out.println(giamGia);
		System.out.print("Thuế nhập khẩu:	");
		System.out.println(getThueNhapKhau());
	}

	public static void main(String[] args) {
		SanPham sanpham = new SanPham();
		sanpham.nhap();
		sanpham.xuat();
	}
}
