
import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập hệ số a:");
		double heSoA = scanner.nextDouble();
		System.out.println("Nhập hệ số b:");
		double heSoB = scanner.nextDouble();
		System.out.printf("Ta có phương trình bậc nhất %.2fx + %.2f = 0 là:%n",heSoA,heSoB);
		if(heSoA == 0) {
			if(heSoB == 0) {
				System.out.println("Phương trình vô số nghiệm!");
			}else {
				System.out.println("Phương trình vô nghiệm!");
			}
		}else {
			double nghiem = (-heSoB)/heSoA;
			System.out.printf("Phương trình có nghiệm x = %.2f",nghiem);
		}
	}
}
