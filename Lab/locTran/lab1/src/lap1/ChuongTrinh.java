package lap1;

import java.util.Scanner;

public class ChuongTrinh {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập số đầu");
		int a = sc.nextInt();
		
		System.out.println("Nhập số sau");
		int b = sc.nextInt();
		
		thucDon(a,b);
		
		
	}
	public static void thucDon(int a, int b) {
		System.out.println("Chon phép tính");
		System.out.println("1. Phép cộng");
		System.out.println("2. Phép trừ");
		System.out.println("3. Thoát");
		
		Scanner ch = new Scanner(System.in);
		int pt = ch.nextInt();
		if(pt == 1) {
			System.out.println(a+b);
		}else if(pt == 2) {
			System.out.println(a-b);
		}else {
			System.exit(0);
		}
		
	}
}

