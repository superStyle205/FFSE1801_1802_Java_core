package Lab3;

import java.util.Scanner;

public class SinhVien {
	String hoTen;
	double diemTB;
	String xepLoai() {
		if (diemTB <= 10 && diemTB >= 0) {
			if (diemTB < 3.5) {
				return "Yếu";
			} else if (5 > diemTB) {
				return "Trung Bình";
			} else if (6.5 > diemTB) {
				return "Khá";
			} else if (8 > diemTB) {
				return "Giỏi";
			} else {
				return "Xuất sắc";
			}
		} else {
			return "Điểm TB sai";
		}
	}
	void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên SV : ");
		hoTen = scanner.nextLine();
		System.out.println("Nhập điểm TB : ");
		diemTB = scanner.nextDouble();
	}
	void xuat() {
		System.out.println("Họ tên SV " + hoTen + " xếp loại " + xepLoai());
	}
	 void SinhVien(String hoTen, double diemTB) {
		this.hoTen = hoTen;
		this.diemTB = diemTB;
	}
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien();
		sv1.nhap();
		sv1.xuat();
		SinhVien sv2 = new SinhVien();
		sv2.SinhVien("Nguyễn Văn 4",1);
		System.out.println("Họ tên SV " + sv2.hoTen + " xếp loại " + sv2.xepLoai());
	}
}
