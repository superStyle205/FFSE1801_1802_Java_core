package lab2;

import java.util.Scanner;

public class bai4 {
	static Scanner scanner = new Scanner(System.in);

	public static void menu() {
		System.out.println("+--------------------------------------+");
		System.out.println("1.Giải phương trình bậc nhất");
		System.out.println("2.Giải phương trình bậc hai");
		System.out.println("3.Tính tiền điện");
		System.out.println("4.Kết thúc");
		System.out.println("+--------------------------------------+");
		System.out.println("Chọn chức năng ");
	}

	public static void giaiPTBacNhat() {
		int a, b;
		System.out.println("nhập a ");
		a = scanner.nextInt();
		System.out.println("nhập b ");
		b = scanner.nextInt();
		if (a == 0) {
			if (b == 0) {
				System.out.println("phương trình có vsn");
			} else {
				System.out.println("phương trình vô nghiệm");
			}
		} else {
			float x = (float) -b / a;
			System.out.println("phương trình có nghiệm " + x);
		}
	}

	public static void giaiPTBacHai() {
		int a, b, c;
		System.out.println("nhập a ");
		a = scanner.nextInt();
		System.out.println("nhập b ");
		b = scanner.nextInt();
		System.out.println("nhập c ");
		c = scanner.nextInt();
		if (a == 0) {
			if (b == 0) {
				System.out.println("Phương trình vô nghiệm!");
			} else {
				System.out.println("Phương trình có một nghiệm: " + "x = " + (-c / b));
			}
			return;
		}
		// tính delta
		float delta = b * b - 4 * a * c;
		System.out.println("delta = " + delta);
		float x1;
		float x2;
		// tính nghiệm
		if (delta > 0) {
			x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
			x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
			System.out.println("Phương trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 = " + x2);
		} else if (delta == 0) {
			x1 = (-b / (2 * a));
			System.out.println("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
		} else {
			System.out.println("Phương trình vô nghiệm");
		}
	}

	public static void tinhTienDien() {
		double soDien;
		System.out.println("Nhập số điện = ");
		soDien = scanner.nextDouble();
		if (soDien <= 50) {
			System.out.printf("Số tiền = %.0f ", +(soDien * 1000));
		} else {
			System.out.printf("Số tiền = %.0f ", +(soDien * 1200));
		}
	}

	public static void main(String[] args) {
		menu();
		int chonNumber;
	
		while (true) {
			chonNumber = scanner.nextInt();
			switch (chonNumber) {
			case 1:
				giaiPTBacNhat();
				break;
			case 2:
				giaiPTBacHai();
				break;
			case 3:
				tinhTienDien();
				break;
			case 4:
				System.out.println("Bạn chọn kết thúc ! Goodbye");
				System.exit(0);
			default:
				System.out.println("Vui lòng nhập đúng id");
			}
		}
	}
}
