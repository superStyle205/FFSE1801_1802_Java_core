import java.util.Scanner;

public class Bai2 {

	public static String tenSanPham;
	public static double donGia;

	void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên sản phẩm:");
		tenSanPham = sc.nextLine();
		System.out.println("Nhập đơn giá:");
		donGia = sc.nextDouble();
	}

	void xuat() {
		System.out.print("Tên sản phẩm: ");
		System.out.println(tenSanPham);
		System.out.print("Đơn giá: ");
		System.out.println(donGia);
	}

	public static void main(String[] args) {
		Bai2 sp1 = new Bai2();
		Bai2 sp2 = new Bai2();
		sp1.nhap();
		sp2.nhap();
		sp1.xuat();
		sp2.xuat();
	}
}
