package lap1;
import java.util.Scanner;
public class lap1 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("h�? tên:");
		String hoTen = scanner.nextLine();
		System.out.print("�?iểm TB: ");
		int diemTB = scanner.nextInt();
		System.out.printf("%s %d điểm", hoTen, diemTB);
	}
}
