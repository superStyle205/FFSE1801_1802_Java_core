package lab3;

import java.util.Scanner;

public class SanPham {
	private String tenSp;
	private double donGia;
	private double giamGia;
	
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên sản phẩm: ");
		tenSp = scanner.nextLine();
		System.out.println("Nhập đơn giá: ");
		donGia = scanner.nextDouble();
		System.out.println("Nhập giảm giá(%): ");
		giamGia = scanner.nextDouble();
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
		SanPham sp1 = new SanPham();
		sp1.nhap();
		sp1.xuat();

		SanPham sp2 = new SanPham();
		sp2.nhap();
		sp2.xuat();

	}

}
