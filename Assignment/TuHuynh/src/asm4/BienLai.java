package asm4;

import java.util.ArrayList;

public class BienLai {
	ArrayList<KhachHang> khachHang = new ArrayList<KhachHang>();

	public ArrayList<KhachHang> getKhachHang() {
		return khachHang;
	}

	public void addKhachHang(KhachHang khachHang) {
		this.khachHang.add(khachHang);
	}
	public int money(KhachHang kh, int newCode) {
		return (newCode - kh.getCode())*750;
	}
}
