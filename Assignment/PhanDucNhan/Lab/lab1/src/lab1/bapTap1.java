package lab1;

import java.util.Scanner;

public class bapTap1 {
	public static void main(String[] areg) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Họ và tên: "); 
		String hoTen = scanner.nextLine(); 
		System.out.print("Điểm TB: ");
		double diemTB = scanner.nextDouble();
		
		System.out.print(hoTen);
		System.out.print(diemTB);
	}
}
