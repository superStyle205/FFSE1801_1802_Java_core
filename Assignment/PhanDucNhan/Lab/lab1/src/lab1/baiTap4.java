package lab1;

import java.util.Scanner;

public class baiTap4 {
	public static void main(String[] areg) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("a"); 
		double a = scanner.nextInt(); 
		System.out.print("b"); 
		double b = scanner.nextInt(); 
		System.out.print("c"); 
		double c = scanner.nextInt(); 
		double Delta = (Math.pow(b, 2) - 4 * a * c);
		System.out.println("THE TICH: "+Math.sqrt(Delta));
	}
}
