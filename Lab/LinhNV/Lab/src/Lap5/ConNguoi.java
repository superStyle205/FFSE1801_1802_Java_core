package Lap5;

import java.util.Scanner;

public class ConNguoi {
	private String hoTen;
	private String ngaySinh;
	private String soCMND;
	private Scanner sc = new Scanner(System.in);

	public ConNguoi() {

	}

	public ConNguoi(String hoTen, String ngaySinh, String soCMND) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.soCMND = soCMND;
	}

	public void nhapThongTin() {
		System.out.print("Nhập họ tên : ");
		setHoTen(sc.nextLine());
		System.out.print("Nhập ngày sinh : ");
		setNgaySinh(sc.nextLine());
		System.out.print("Nhập CMND : ");
		setSoCMND(sc.nextLine());
	}

	public void hienThiThongTin() {
		System.out.println("Họ và tên: " + getHoTen());
		System.out.println("Ngày sinh: " + getNgaySinh());
		System.out.println("Số CMND: " + getSoCMND());
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getSoCMND() {
		return soCMND;
	}

	public void setSoCMND(String soCMND) {
		this.soCMND = soCMND;
	}
}
