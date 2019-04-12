package lab1;

import java.util.Scanner;

public class bai3 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Nhập cạnh ");
		double canh = scanner.nextDouble();
		double theTich = Math.pow(canh,3);
		System.out.printf("Thể tích lập phương là: %.0f ",theTich);
}
	
}
