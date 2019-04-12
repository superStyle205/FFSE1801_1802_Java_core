
import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập cạnh của hình vuông:");
		int canhHV = scanner.nextInt();
		double theTich = Math.pow(canhHV,3);
		System.out.printf("Thể tích hình vuông có cạnh %d là %.2f",canhHV,theTich);		
	}
}
