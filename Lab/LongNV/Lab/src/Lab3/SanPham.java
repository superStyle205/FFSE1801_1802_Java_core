package Lab3;

import java.util.Scanner;

public class SanPham {
	private String TenSP;
	private double DonGia;
	private double GiamGia;
	
	public String getTenSP() {
		return this.TenSP;
	}

	public void setTenSP(String tenSP) {
		TenSP = tenSP;
	}

	public double getDonGia() {
		return this.DonGia;
	}

	public void setDonGia(double donGia) {
		DonGia = donGia;
	}

	public double getGiamGia() {
		return this.GiamGia;
	}

	public void setGiamGia(double giamGia) {
		GiamGia = giamGia;
	}

	public SanPham(String tenSP, double donGia, double giamGia) {
		TenSP = tenSP;
		DonGia = donGia;
		GiamGia = giamGia;
	}

	public SanPham(String tenSP, double donGia) {
		this(tenSP, donGia, 0);
	}
	
//	public void nhap() {
//		Scanner nhap = new Scanner(System.in);
//		System.out.println("Nhập tên sản phẩm");
//		TenSP = nhap.nextLine();
//
//		System.out.println("Nhập giá sản phẩm");
//		DonGia = nhap.nextDouble();
//
//		System.out.println("Giảm giá (%)");
//		GiamGia = nhap.nextDouble();
//
//		System.err.println("<------------------------------------------>");
//	}

	public void xuat() {
		System.err.println("<------------------------------------------>");
		System.out.println("Tên sản phẩm là " + TenSP);
		System.out.println("Giá là " + DonGia);
		System.out.println("Được giảm  " + GiamGia + "%");
		System.out.println("Thành tiền " + (DonGia - (DonGia * GiamGia / 100)));
		System.out.println("Thuế là " + thueNhapKhau() );
	
	}

	private double thueNhapKhau() {
		return DonGia * 10 / 100;
	}

	public static void main(String[] args) {
		SanPham sp1 = new SanPham("Thuốc lắc", 20000,10);
		SanPham sp2 = new SanPham("Thuốc lắc", 20000);
		
		
		
//		sp1.nhap();
//		sp2.nhap();

		sp1.xuat();
		sp2.xuat();
		
	}
}
