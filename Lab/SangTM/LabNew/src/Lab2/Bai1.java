package Lab2;

import java.util.Scanner;

/*Viết chương trình cho phép giải phương trình bậc nhất
  trong đó các hệ số a và b nhập từ bàn phím*/

public class Bai1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.err.print("Nhập hệ số a: ");
		double a = scan.nextDouble();
		System.err.print("Nhập hệ số b: ");
		double b = scan.nextDouble();
		
		if (a == 0) {
			if (b == 0) {
				System.err.println("Pt có vô số nghiệm!");
			} else {
				System.err.println("Pt vô nghiệm!");
			}
		} else {
			System.err.println("Phương trình có nghiệm: " + (-b / a));
		}
	}
}
