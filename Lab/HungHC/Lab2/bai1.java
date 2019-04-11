package lab2;

import java.util.Scanner;

public class bai1 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
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
			System.out.println("phương trình có nghiệm "+ x);
		}
	}
}
