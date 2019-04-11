package lab1;

import java.util.Scanner;

public class batTap3 {
	public static void main(String[] areg) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("a"); 
		int a = scanner.nextInt(); 
		
		System.out.println("THE TICH: "+(a*a*a));
		System.out.println("DIEN TICH: "+Math.pow(a,3));
	}
}
