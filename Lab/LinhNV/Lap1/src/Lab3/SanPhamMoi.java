package Lab3;

import java.util.Scanner;

public class SanPhamMoi {
	String tenSp;
	double donGia;
	double giamGia;
	
	public String getTenSp() {
		return tenSp;
	}
	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public double getGiamGia() {
		return giamGia;
	}
	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}
	public double getThue() {
		return thue;
	}
	public void setThue(double thue) {
		this.thue = thue;
	}
	double thue;
	private void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ten SP : ");
		tenSp = scanner.nextLine();
		System.out.println("Nhap don gia : ");
		donGia = scanner.nextDouble();
		System.out.println("Giam gia : ");
		giamGia = scanner.nextDouble();
	}
	private void xuat() {
		System.out.println("Ten SP " + tenSp); 						
		System.out.println("Don gia " + donGia);
		System.out.println("Giam gia " + giamGia + "%");
		System.out.println("Thue " + getThueNhapKhau());
		System.out.println("Thanh tien " + (donGia - (donGia * giamGia / 100) + thue));	
	}
	private double getThueNhapKhau() {
		return thue = donGia * 10 / 100;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SanPhamMoi sp1 = new SanPhamMoi();
		System.out.println("Nhập tên sản phẩm");
		sp1.setTenSp(scanner.nextLine());
		System.out.println("Nhập giá sản phẩm");
		sp1.setDonGia(scanner.nextDouble());
		System.out.println("Nhập giảm giá");
		sp1.setGiamGia(scanner.nextDouble());
		System.out.println("Tên SP : " + sp1.getTenSp());
		System.out.println("Giá SP : " + sp1.getDonGia());
		System.out.println("Giảm giá : " + sp1.getGiamGia());
	}
}
