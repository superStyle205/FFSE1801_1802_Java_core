package lab.unit2;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập hệ số a:");
		double heSoA = scanner.nextDouble();
		System.out.println("Nhập hệ số b:");
		double heSoB = scanner.nextDouble();
		System.out.println("Nhập hệ số c:");
		double heSoC = scanner.nextDouble();
		if(heSoA == 0) {
			if(heSoA == 0) {
				if(heSoB == 0) {
					System.out.println("Phương trình vô số nghiệm!");
				}else {
					System.out.println("Phương trình vô nghiệm!");
				}
			}else {
				double nghiem = (-heSoC)/heSoB;
				System.out.printf("Phương trình có nghiệm x = %.2f",nghiem);
			}
		}else {
			double delta = Math.pow(heSoB,2)-4*heSoA*heSoC;
			if(delta < 0) {
				System.out.println("Phương trình vô nghiệm!");
			}else if(delta == 0) {
				double nghiem = (-heSoB)/(2*heSoA);
				System.out.printf("Phương trình có 1 nghiệm kép x = %.2f",nghiem);
			}else {
				double nghiem1 = (-heSoB + Math.sqrt(delta))/(2*heSoA);
				double nghiem2 = (-heSoB - Math.sqrt(delta))/(2*heSoA);
				System.out.printf("Phương trình có 2 nghiệm phân biệt%nNghiệm x1 = %.2f%nNghiệm x2 = %.2f%n",nghiem1,nghiem2);
			}
		}
	}
}
