package Lab2;

import java.util.ArrayList;
import java.util.Scanner;

/*Viết chương trình nhập 2 mảng họ tên và điểm của sinh viên,
  và in ra có thêm trường học lực xét theo tiêu chí.*/

public class Bai6 {
	private String hoTen;
	private double diem;
	private ArrayList<Bai6> quanLySinhVien;
	
	public Bai6(String hoTen, double diem) {
		super();
		this.hoTen = hoTen;
		this.diem = diem;
	}

	private Scanner scan;
	
	public Bai6() {
		quanLySinhVien = new ArrayList<>();
		scan = new Scanner(System.in);
	}
	
	public double getDiem() {
		return diem;
	}
	
	public String setHocLuc() {
		if (getDiem() < 5.0) {
			return "Yếu";
		} else if(getDiem() < 6.5) {
			return "Trung bình";
		} else if(getDiem() < 7.5) {
			return "Khá";
		} else if(getDiem() < 9) {
			return "Giỏi";
		} else {
			return "Xuất sắc";
		}
	}
	
	public void nhap() {
		System.err.print("Nhập họ tên: ");
		String hoTen = scan.nextLine();
		System.err.print("Nhập điểm: ");
		double diem = scan.nextDouble();
	}
	
	public void xuat() {
		System.err.println("Họ và tên: " +hoTen);
		System.err.println("Điểm trung bình: " +diem);
		System.err.println("Học lực: " +setHocLuc());
	}
	
	public static void main(String[] args) {
		Bai6 bai6 = new Bai6("Sang", 9);
		Bai6 bai66 = new Bai6("Long", 5);
		/*bai6.nhap();*/
		bai6.xuat();
		bai66.xuat();
	}
}
