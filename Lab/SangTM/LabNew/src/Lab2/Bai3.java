package Lab2;

import java.util.Scanner;

/*Viết chương trình nhập vào số điện sử dụng của tháng và tính tiền điện
  theo phương pháp lũy tiến:
   -->Nếu số điện sử dụng từ 0 đến 50 thì giá mỗi số điện là 1000
   -->Nếu số điện sử dụng trên 50 thì giá mỗi số điện vượt hạn mức là 1200*/


public class Bai3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.err.print("Nhập số điện sử dụng: ");
			int nhap = scan.nextInt();
					
			if (0 <= nhap && nhap <= 50) {
				System.err.println("Giá tiền điện là: " + nhap*1000);
			} else {
				System.err.println("Giá tiền điện là: " + ((50 * 1000) + (nhap - 50) * 1200));
			}
		}
	}
}
