package Lab2;

import java.util.Scanner;

public class Lab2Bai2 {
	public static void main(String[] args) {
		Scanner heSo = new Scanner(System.in);
		System.out.println("Nhap he so a");
		double heSoA = heSo.nextDouble();
		System.out.println("Nhap he so b");
		double heSoB = heSo.nextDouble();
		System.out.println("Nhap he so c");
		double heSoC = heSo.nextDouble();
		
		if (heSoA == 0) {
			if (heSoB  == 0) {
				if (heSoC == 0) {
					System.out.println("phương trình có vô sô nghiệm");
				} else {
					System.out.println("phương trình vô nghiệm");
				}
			} else {
				double x = (- heSoC) / heSoB;
				System.out.print("Phương trình có nghiệm là : x = " + x);
				
			}
		} else {
			double Delta = (Math.pow(heSoB,2)) - 4 * heSoA * heSoC;
			if (Delta < 0) {
				System.out.println("pt vô nghiệm");
			} else if (Delta == 0) {
				System.out.println("pt có nghiệm kép : " + (-heSoB) / (2 * heSoA));
			} else {
				System.out.println("pt có 2 nghiệm phân biệt : ");
				System.out.println("nghiệm x1 = " + (-heSoB + Math.sqrt(Delta) / (2 * heSoA)));
				System.out.println("nghiệm x2 = " + (-heSoB - Math.sqrt(Delta) / (2 * heSoA)));
			}
		}
	}
}
