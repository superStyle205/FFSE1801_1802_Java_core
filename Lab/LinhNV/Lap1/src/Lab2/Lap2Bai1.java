package Lab2;
import java.util.Scanner;
public class Lap2Bai1 {
	public static void main(String[] args) {
		Scanner heSo = new Scanner(System.in);
		System.out.println("Nhap he so a");
		double heSoA = heSo.nextDouble();
		System.out.println("Nhap he so b");
		double heSoB = heSo.nextDouble();
		if (heSoA  == 0) {
			if (heSoB == 0) {
				System.out.println("phương trình có vô sô nghiệm");
			} else {
				System.out.println("phương trình vô nghiệm");
			}
		} else {
			double x = (- heSoB) / heSoA;
			System.out.print("Phương trình có nghiệm là : x = " + x);
			
		}
	}
}
