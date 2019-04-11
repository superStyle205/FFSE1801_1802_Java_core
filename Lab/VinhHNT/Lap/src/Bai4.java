import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		double a, b, c, delta, canDelta;
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhap he so a: ");
		a = scanner.nextDouble();
		System.out.print("nhap he so b :");
		b = scanner.nextDouble();
		System.out.print("nhap he so c:");
		c = scanner.nextDouble();
		delta = Math.pow(b, 2) - (4 * a * c);
		canDelta = Math.sqrt(delta);
		System.out.printf(" Can Delta la :" + canDelta);
	}
}
