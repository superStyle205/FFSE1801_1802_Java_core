
import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên học sinh:");
		String name = scanner.nextLine();
		System.out.println("Nhập điểm trung bình:");
		double diemTB = scanner.nextDouble();
		System.out.printf("Bạn %s có điểm trung bình là %.2f điểm", name, diemTB);
	}
}
