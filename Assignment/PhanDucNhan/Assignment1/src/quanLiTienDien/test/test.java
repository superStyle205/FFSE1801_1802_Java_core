package quanLiTienDien.test;

import java.util.Scanner;

import quanLiTienDien.model.bienLai;

public class test {
	
	public static int size = 0;
	public static int max_length = 100;
	public static bienLai[] KH = new bienLai[max_length];

	public static void main(String[] args) {
		nhap();
		xuat();
	}
	
	public static void nhap() {
		while(true) {
			System.out.println("Nhập tên");
			String hoTen = new Scanner(System.in).nextLine();
			System.out.println("Nhập địa chỉ");
			String diaChi = new Scanner(System.in).nextLine();
			System.out.println("Nhập mã công tơ");
			int maCongTo = new Scanner(System.in).nextInt();
			System.out.println("Nhập số điện cũ");
			int soDienCu = new Scanner(System.in).nextInt();
			System.out.println("Nhập số điện mới");
			int soDienMoi = new Scanner(System.in).nextInt();
			KH[size] = new bienLai(hoTen, diaChi, maCongTo, soDienCu, soDienMoi);
			size++;
			System.out.println("Tiếp không :)) (C/K)");
			String check = new Scanner(System.in).nextLine();
			if(check.equals("k")) {
				break;
			}
		}
	}
	public static void xuat() {
		for (int i = 0; i < size; i++) {
			KH[i].xuat();
		}
	}

}
