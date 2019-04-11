package baiTapFF2;

import java.util.Scanner;

public class baiTap2 {
	public static void main(String[] args) {
		System.out.println("Phương trình bậc hai có dạng : ax2 + bx + c = 0");
		System.out.println("Nhập số a");
		int a = new Scanner(System.in).nextInt();

		System.out.println("Nhập số b");
		int b = new Scanner(System.in).nextInt();

		System.out.println("Nhập số c");
		int c = new Scanner(System.in).nextInt();

		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.err.println("Phương trình vô số nghiệm");
				}else {
					System.err.println("Phương trình vô nghiệm");
				}
			}else {
				System.err.println("Phương trình có nghiệm là : " + -c/b);
			}
		}else {
			double delta = b*b - 4*a*c;
			System.out.println("Delta của phương trình là : " + delta);
			if (delta < 0) {
				System.err.println("Phương trình vô nghiệm");
			}else if(delta == 0 ) {
				System.out.println("Phương trình có nghiệm kép x1 = x2 = " + (-b/2*a));
			}else {
				System.out.println("Phương trình có hai nghiệm phân biệt");
				double x1 = ((-b-Math.sqrt(delta))/2*a);
				double x2 = ((-b+Math.sqrt(delta))/2*a);
				System.out.println("X1 = " + x1);
				System.out.println("X2 = " + x2);
			}
		}
	}
}	
