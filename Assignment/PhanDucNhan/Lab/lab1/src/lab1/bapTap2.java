package lab1;

import java.util.Scanner;

public class bapTap2 {
	public static void main(String[] areg) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("a"); 
		int a = scanner.nextInt(); 
		System.out.print("b");
		int b = scanner.nextInt();
		
		System.out.println("CHU VI: "+((a+b)/2));
		System.out.println("DIEN TICH: "+(a*b));
		System.out.println("CANH NHO NHAT: "+Math.min(a, b));
	}
}
