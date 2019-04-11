package Lap2;
import java.util.Scanner;

public class PtBac2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap so a:");
		int a = scan.nextInt();
		System.out.println("Nhap so b:");
		int b = scan.nextInt();
		System.out.println("Nhap so c:");
		int c = scan.nextInt();
		if (a == 0) {
			System.out.println("Phuong trinh co nghiem la:" + (-b / a));
		}
		else if (a != 0) {
			double x1;
			double x2;
			double delta = Math.pow(b, 2)- 4 * a * c;
			if (delta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			}
			else if (delta > 0) {
				x1 = (-b + Math.sqrt(delta))/(2*a);
				x2 = (-b - Math.sqrt(delta))/(2*a);
				System.out.println("Phuong trinh co nghiem x1 la:" + x1);
				System.out.println("Phuong trinh co nghiem x2 la:" + x2);
			}
			else {
				System.out.println("Phuong trinh co nghiem kep la:" + (-b/(2*a)));
			}
		}
	}
}
