package Lab1;

import java.util.Scanner;

/*Viết chương trình nhập từ bàn phím cạnh của một khối lập phương. 
  Tính và xuất thể tích của khối chữ nhật*/

public class Bai3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.err.print("Nhập cạnh lập phương: ");
		int canh = scan.nextInt();
		System.err.println("Thể tích khối lập phương = " + Math.pow(canh, 3));
	}
}
