package Lap2;
import java.util.Scanner;

public class TienDien {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap chu dien:");
		int soDien = scan.nextInt();
		double duoi50 = soDien * 1000;
		double tren50 = 50 * 1000 + (soDien - 50) * 1200;
		if (soDien < 50) {
			System.out.println("So tien dien la:" + duoi50);
		}
		else {
			System.out.println("So tien dien la:" + tren50);
		}
	}
}
