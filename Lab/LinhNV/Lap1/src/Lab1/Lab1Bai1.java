package Lab1;

import java.util.Scanner; 

public class Lab1Bai1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập tên của bạn : ");
		String ten = input.nextLine();
		
		System.out.println("Nhập Điểm trung bình : ");
		Double diemTB = input.nextDouble();
		
		System.out.printf("Sinh viên %s có điểm trung bình là : %f" , ten , diemTB );
	}
}
