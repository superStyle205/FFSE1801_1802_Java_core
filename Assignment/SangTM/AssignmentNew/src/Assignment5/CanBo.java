package Assignment5;

import java.util.Scanner;

abstract public class CanBo {
	private String hoTen;
	private int phuCap;
	private double heSoLuong;
	Scanner scan = new Scanner(System.in);
	
	public CanBo() {
	}
	
	public CanBo(String hoTen, int phuCap, double heSoLuong) {
		super();
		this.hoTen = hoTen;
		this.phuCap = phuCap;
		this.heSoLuong = heSoLuong;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getPhuCap() {
		return phuCap;
	}

	public void setPhuCap(int phuCap) {
		this.phuCap = phuCap;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	
	public double getTinhLuong() {
		return 0;
	}
	
	public void nhap() {
		System.out.print("Nhập họ tên: ");
		hoTen = scan.nextLine();
		System.out.print("Nhập hệ số lương: ");
		heSoLuong = Double.parseDouble(scan.nextLine());
	}
	
	public void xuat() {
		System.err.println("Họ và tên\t\t: " + hoTen);
		System.err.println("Hệ số lương\t\t: " + heSoLuong);
	}
}
