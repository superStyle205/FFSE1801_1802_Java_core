package Lab2;

import java.util.Scanner;

/*Viết chương trình tổ chức 1 menu gồm 3 chức năng để gọi 3 bài trên và một chức
  năng để thoát khỏi ứng dụng.*/


public class Bai4 {
	public void menu() {		
		while(true) {
			System.err.println("Chọn chức năng [1_3]");
			System.err.println("1. Giải pt bậc nhất");
			System.err.println("2. Giải pt bậc hai");
			System.err.println("3. Tính tiền điện");
			Scanner so = new Scanner(System.in);
			System.err.print("Chọn chức năng: ");
			int choose = so.nextInt();
			switch (choose) {
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
				System.err.println("Tạm biệt!");
				System.exit(0);
				
			default:
				System.err.print("Mời nhập lại: ");
				break;
			}
		}
	}
	
	public void giaiPTBacNhat() {
		Scanner scan = new Scanner(System.in);
		System.err.print("Nhập hệ số a: ");
		double a = scan.nextDouble();
		System.err.print("Nhập hệ số b: ");
		double b = scan.nextDouble();
		
		if (a == 0) {
			if (b == 0) {
				System.err.println("-->Pt có vô số nghiệm!");
			} else {
				System.err.println("-->Pt vô nghiệm!");
			}
		} else {
			System.err.println("-->Phương trình có nghiệm: " + (-b / a));
		}
	}
	
	public void giaiPTBacHai() {
		Scanner scan1 = new Scanner(System.in);
		System.err.print("Nhập hệ số a: ");
		double a = scan1.nextDouble();
		System.err.print("Nhập hệ số b: ");
		double b = scan1.nextDouble();
		System.err.print("Nhập hệ số c: ");
		double c = scan1.nextDouble();
		double delta = b*b -a*4*c;
		double canDelta = Math.sqrt(delta);
		double x1 = (-b + canDelta) / 2*a;
		double x2 = (-b - canDelta) / 2*a;
		double x = -b / 2*a;
		
		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.err.println("-->Pt có vô số nghiệm!");
				} else {
					System.err.println("-->Pt vô nghiệm!");
				}
			} else {
				System.err.println("-->Phương trình có nghiệm: " + (-c / b));
			}
		} else {
			if (delta > 0) {
				System.err.println("-->Phương trình có hai nghiệm:\n"
						+ " x1 = " + x1 + "\n"
								+ " x2 = " + x2);
			} else if(delta == 0) {
				System.err.println("-->Phương trình có nghiệm kép x = " + x);
			} else {
				System.err.println("-->Pt vô nghiệm!");
			}
		}
	}
	
	public void tinhTienDien() {
		Scanner scan2 = new Scanner(System.in);
			System.err.print("-->Nhập số điện sử dụng: ");
			int nhap = scan2.nextInt();
					
			if (0 <= nhap && nhap <= 50) {
				System.err.println("-->Giá tiền điện là: " + nhap*1000);
			} else {
				System.err.println("-->Giá tiền điện là: " + ((50 * 1000) + (nhap - 50) * 1200));
			}
		}
	
	public static void main(String[] args) {
		Bai4 bai4 = new Bai4();
		bai4.menu();
	}
}
