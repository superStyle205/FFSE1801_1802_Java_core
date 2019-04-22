package Lab2;

import java.util.Scanner;

/*Viết chương trình cho phép giải phương trình bậc hai
  trong đó các hệ số a, b và c nhập từ bàn phím .*/

public class Bai2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.err.print("Nhập hệ số a: ");
		double a = scan.nextDouble();
		System.err.print("Nhập hệ số b: ");
		double b = scan.nextDouble();
		System.err.print("Nhập hệ số c: ");
		double c = scan.nextDouble();
		double delta = b*b -a*4*c;
		double canDelta = Math.sqrt(delta);
		double x1 = (-b + canDelta) / 2*a;
		double x2 = (-b - canDelta) / 2*a;
		double x = -b / 2*a;
		
		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.err.println("Pt có vô số nghiệm!");
				} else {
					System.err.println("Pt vô nghiệm!");
				}
			} else {
				System.err.println("Phương trình có nghiệm: " + (-c / b));
			}
		} else {
			if (delta > 0) {
				System.err.println("Phương trình có hai nghiệm:\n"
						+ " x1 = " + x1 + "\n"
								+ " x2 = " + x2);
			} else if(delta == 0) {
				System.err.println("Phương trình có nghiệm kép x = " + x);
			} else {
				System.err.println("Pt vô nghiệm!");
			}
		}
	}
}
