package lab2;

import java.util.Scanner;

public class bai3 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		double soDien;
		System.out.println("Nhập số điện = ");
		soDien = scanner.nextDouble();
		if (soDien <= 50) {
			System.out.printf("Số tiền = %.0f ", +(soDien * 1000));
		} else {
			System.out.printf("Số tiền = %.0f ", +(soDien * 1200));
		}
	}
}
