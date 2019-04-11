package Lab2;

import java.util.Scanner;

public class Lab2Bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập giá điện đã sử tháng qua : ");
		int soDien =  scanner.nextInt();
		
		if (soDien < 50) {
			System.out.println("Số tiền điện phải trả tháng qua là : " + (soDien * 1000));
		} else {
			System.out.println("Số tiền điện phải trả tháng qua là : " + ((50 * 1000) + (soDien -50) * 1000));
		}
	}
}
