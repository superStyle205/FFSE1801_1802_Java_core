package Lap1;
import java.util.Scanner;

public class phuongTrinhBac2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("a");
		int a = scan.nextInt();
		System.out.println("b");
		int b = scan.nextInt();
		System.out.println("c");
		int c = scan.nextInt();
		double delta = Math.pow(b, 2) - 4 * a * c;
		System.out.println("delta la:" + delta);
		double canDelta = Math.sqrt(delta);
		System.out.println("can delta la:" + canDelta);
	}
}
