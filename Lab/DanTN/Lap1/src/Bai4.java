
import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập a:");
		int soA = scanner.nextInt();
		System.out.println("Nhập b:");
		int soB = scanner.nextInt();
		System.out.println("Nhập c:");
		int soC = scanner.nextInt();
		double delta = (Math.pow(soB,2))-4*soA*soC;
		double canDelta = 0;
		if(delta < 0) {
			canDelta = -Math.sqrt(-delta);
		}else {
			canDelta = Math.sqrt(delta);
		}
		System.out.printf("Ta có Delta bằng %.0f%nCăn Delta bằng %.2f",delta, canDelta);
	}
}
