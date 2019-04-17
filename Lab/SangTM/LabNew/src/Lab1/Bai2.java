package Lab1;

import java.util.Scanner;

/*Viết chương trình nhập từ bàn phím 2 cạnh của hình chữ nhật.
  Tính và xuất chu vi, diện tích và cạnh nhỏ của hình chữ nhật.*/

public class Bai2 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.err.print("Nhập chiều dài: ");
		int chieuDai = scan.nextInt();
		System.err.print("Nhập chiều rộng: ");
		int chieuRong = scan.nextInt();
		
		System.err.println("Chu vi hình chữ nhật là: " + (chieuDai + chieuRong) * 2);
		System.err.println("Diện tích hình chữ nhật là: " + (chieuDai * chieuRong));
		System.err.println("Cạnh nhỏ nhất là: " +Math.min(chieuDai, chieuRong));
	}	
}
