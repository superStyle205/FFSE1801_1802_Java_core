package Lab1;

import java.util.Scanner;

/*Viết chương trình cho phép nhập họ và tên sinh viên, điểm trung bình từ bàn
  phím sau đó xuất ra màn hình với định dạng: <<họ và tên>> <<điểm>> điểm.*/

public class Bai1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.err.print("Nhập họ & tên sinh viên: ");
		String nhap = scan.nextLine();
		System.err.print("Nhập điểm trung bình của sinh viên: ");
		double them = scan.nextDouble();
		System.err.printf("Họ và tên: %s, có điểm trung bình là %f", nhap, them);
	}
	
}
