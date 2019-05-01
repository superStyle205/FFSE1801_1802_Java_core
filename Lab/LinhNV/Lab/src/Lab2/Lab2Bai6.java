package Lab2;

import java.util.Scanner;

public class Lab2Bai6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] SV1 = new String[2] ;
		System.out.println("Nhập tên SV");
		SV1[0] = scanner.nextLine();
		System.out.println("Nhập điểm TB");
		SV1[1] = scanner.nextLine();
		double DTB = Double.valueOf(SV1[1]);
		if (0.0 < DTB && DTB <= 10.0) {
			if (DTB < 5) {
				System.out.printf("Học sinh " + SV1[0] + " có ĐTB = %.1f xếp loại Yếu",DTB);
			} else if(5 <= DTB && DTB < 6.5) {
				System.out.printf("Học sinh " + SV1[0] + " có ĐTB = %.1f xếp loại Trung Bình",DTB);
			} else if (6.5 <= DTB && DTB < 7.5) {
				System.out.printf("Học sinh " + SV1[0] + " có ĐTB = %.1f xếp loại Khá",DTB);
			} else if (7.5 <= DTB && DTB <= 9) {
				System.out.printf("Học sinh " + SV1[0] + " có ĐTB = %.1f xếp loại Giỏi",DTB);
			} else {
				System.out.printf("Học sinh " + SV1[0] + " có ĐTB = %.1f xếp loại Xuất sắc",DTB);
			}
		} else {
			System.out.println("Điểm bạn nhập không có");
		}
	}
}
