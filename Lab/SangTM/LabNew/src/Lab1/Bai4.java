package Lab1;

import java.util.Scanner;

/*Viết chương trình nhập các hệ số của phương trình bậc 2.
  Tính delta và xuất căn delta ra màn hình.*/


public class Bai4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.err.print("Nhập hệ số a: ");
		double a = scan.nextDouble();
		System.err.print("Nhập hệ số b: ");
		double b = scan.nextDouble();
		System.err.print("Nhập hệ số c: ");
		double c = scan.nextDouble();
		double delta = b*b -a*4*c;
		System.err.println("Delta = " + delta);
		System.err.println("Căn delta = " + Math.sqrt(delta));
	}
}
