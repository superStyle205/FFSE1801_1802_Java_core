package lab2;

import java.util.Scanner;

public class bai2 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
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
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
            return;
        }
		// tính delta
		float delta = b * b - 4 * a * c;
		System.out.println("delta = "+ delta);
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
}
