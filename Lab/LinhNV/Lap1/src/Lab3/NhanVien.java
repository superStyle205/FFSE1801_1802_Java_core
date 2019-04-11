package Lab3;

import java.util.Scanner;

public class NhanVien {
	public String ten;
	public double luong;
	void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tên nhân viên : ");
		 ten = scanner.nextLine();
		System.out.println("Lương : ");
		 luong = scanner.nextDouble();
	}
	void output() {
		System.out.println("Ten : " + ten);
		System.out.println("Luong : " + luong);
	}
	void setInfo(String ten , double luong) {
		this.ten = ten;
		this.luong = luong;
	}
	double incomeTax() {
		if (luong <= 500000) {
			return 0; 
		} else {
			return (luong - 50000) * 10 /100;
		}
	}
	
	public static void main(String[] args) {
		NhanVien nhanVien1 = new NhanVien();
		nhanVien1.input();
		nhanVien1.output();
		nhanVien1.luong = 12;
		nhanVien1.output();
		nhanVien1.setInfo("nguyên van a", 5000);
		System.out.println(
				"thue cua nhan vien "
				+ nhanVien1.ten
				+ " co thue la ++"
				+ nhanVien1.incomeTax());
	}
}

