package Assignment5;

import java.util.Scanner;

public class CanBo {
	private String ten;
	private double heSoLuong;

	public double getPhuCap() {
		return 0;
	}

	public double getLuong() {
		return 0;
	}

	public CanBo() {
		super();
	}

	public CanBo(String ten, double heSoLuong) {
		super();
		this.ten = ten;
		this.heSoLuong = heSoLuong;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public void xuat() {
		System.out.println("Tên \t: " + getTen());
		System.out.println("hệ số lương \t: " + getHeSoLuong());
		System.out.println("Phụ cấp \t: " + getPhuCap());
	}
}
