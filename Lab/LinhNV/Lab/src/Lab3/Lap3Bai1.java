package Lab3;

import java.util.Scanner;

public class Lap3Bai1 {
	String tenSp;
	double donGia;
	double giamGia;
	double thue;
	void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ten SP : ");
		tenSp = scanner.nextLine();
		System.out.println("Nhap don gia : ");
		donGia = scanner.nextDouble();
		System.out.println("Giam gia : ");
		giamGia = scanner.nextDouble();
	}
	void xuat() {
		System.out.println("Ten SP " + tenSp); 						
		System.out.println("don gia " + donGia);
		System.out.println("giam gia " + giamGia + "%");
		System.out.println("thue " + getThueNhapKhau());
		System.out.println("thanh tien " + (donGia - (donGia * giamGia / 100) + thue));
	}
	double getThueNhapKhau() {
		return thue = donGia * 10 / 100;
	}
	public static void main(String[] args) {
		Lap3Bai1 sp1 = new Lap3Bai1();
		sp1.nhap();
		sp1.xuat();
		sp1.getThueNhapKhau();
	}
}
