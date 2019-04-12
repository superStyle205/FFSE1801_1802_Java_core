package Lab3;

import java.util.Scanner;

public class SanPham {
	String tenSp;
	double donGia;
	double giamGia;
	double thue;
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ten SP : ");
		tenSp = scanner.nextLine();
		System.out.println("Nhap don gia : ");
		donGia = scanner.nextDouble();
		System.out.println("Giam gia : ");
		giamGia = scanner.nextDouble();
	}
	public void xuat() {
		System.out.println("Ten SP : " + tenSp); 						
		System.out.println("Don gia : " + donGia);
		System.out.println("Giam gia : " + giamGia);
		System.out.println("Thue " + getThueNhapKhau());
	}
	private double getThueNhapKhau() {
		return thue = donGia * 10 / 100;
	}
	public SanPham(String tenSp, double donGia, double giamGia) {
		this.tenSp = tenSp;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
	public SanPham(String tenSp, double donGia) {
		this.tenSp = tenSp;
		this.donGia = donGia;
	}
	public static void main(String[] args) {
		SanPham sp1 = new SanPham("quan dui", 50000, 100);
		SanPham sp2 = new SanPham("ao ba lo", 40000);
		sp1.xuat();
		sp2.xuat();
	}
	
}
