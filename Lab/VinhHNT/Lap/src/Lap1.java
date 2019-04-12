import java.util.Scanner;

public class Lap1 {
	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		System.out.print("Họ Và tên:");
		String hoTen = scaner.nextLine();
		System.out.print("Điểm TB:");
		int diemTB = scaner.nextInt();
		System.out.printf("%s %d điểm", hoTen, diemTB);
	}
}
