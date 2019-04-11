package lab1;

import java.util.Scanner;

public class bai4 {
	static Scanner scanner = new Scanner(System.in);
public static void main(String[] args) {
		System.out.print("Nhập a ");
		double a = scanner.nextInt();
		System.out.print("Nhập b ");
		double b = scanner.nextInt();
		System.out.print("Nhập c ");
		double c = scanner.nextInt();
		double delta = Math.pow(b,2)-4*a*c;
		double canDelta = Math.sqrt(delta);
		System.out.println("Delta " +delta);
		System.out.println("Căn Delta " +canDelta);
}
}
