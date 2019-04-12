package lab1;

import java.util.Scanner;

public class bai1 {
	
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Họ và tên: ");
		String hoTen = scanner.nextLine();
		System.out.print("Điểm TB: ");
		double diemTb = scanner.nextDouble(); 
		System.out.printf("Tên của bạn là %s Điểm TB của bạn là %.0f" ,hoTen,diemTb);
			
}
}
