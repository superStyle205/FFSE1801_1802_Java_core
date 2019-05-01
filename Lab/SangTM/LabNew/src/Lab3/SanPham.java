package Lab3;

import java.util.Scanner;

public class SanPham {
	private String sanPham;
	private double donGia;
	private double giamGia;
	
	public SanPham(String sanPham, double donGia, double giamGia) {
		super();
		this.sanPham = sanPham;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
	
	public SanPham(String sanPham, double donGia) {
		this(sanPham, donGia, 0);
	}
	
	public String getSanPham() {
		return sanPham;
	}
	public void setSanPham(String sanPham) {
		this.sanPham = sanPham;
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
	
	public double getThueNhapKhau() {
		return (10*donGia)/100;
	}
	
	public double getSumMoney() {
		return (donGia - donGia * (giamGia / 100));
	}
	
	public void xuat() {
		System.err.println("Sản phẩm: " + sanPham);
		System.err.println("Đơn giá: " + donGia);
		System.err.println("Giảm giá: " + giamGia +"%");
		System.err.println("Thuế nhập khẩu: " + getThueNhapKhau());
		System.err.println("Tổng tiền thanh toán: " + getSumMoney());
	}
	
	public void nhap() {
		Scanner scan = new Scanner(System.in);
		System.err.print("Nhập tên SP: ");
		sanPham = scan.nextLine();
		System.err.print("Nhập đơn giá: ");
		donGia = scan.nextDouble();
		System.err.print("Nhập giảm giá: ");
		giamGia = scan.nextDouble();
	}
}
