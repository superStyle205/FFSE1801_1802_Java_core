package Lap2;
import java.util.Scanner;

public class QuyUoc {
	public static void main(String[] args) {
		System.out.println("Chon thuc don");
		System.out.println("1. phuong trinh bac nhat");
		System.out.println("2. phuong trinh bac 2");
		System.out.println("3. tinh tien dien");
		System.out.println("4. Thoat");

		Scanner scan = new Scanner(System.in);
		int pt = scan.nextInt();
		
		if (pt == 1) {
			Scanner bai1 = new Scanner(System.in);
			System.out.println("Nhap a:");
			int heSoA = bai1.nextInt();
			System.out.println("Nhap b:");
			int heSoB = bai1.nextInt();
			if (heSoA == 0) {
				
					System.out.println("Phuong trinh vo so nghiem");
			}
					else if (heSoB == 0) {
						System.out.println("Phuong trinh vo nghiem");
					}
					else {
						System.out.println("Phuong trinh co nghiem x la:" + (- heSoB / heSoA));
					}
				}
		else if (pt == 2) {
			

			Scanner bai2 = new Scanner(System.in);
			System.out.println("Nhap so a:");
			int a = bai2.nextInt();
			System.out.println("Nhap so b:");
			int b = bai2.nextInt();
			System.out.println("Nhap so c:");
			int c = bai2.nextInt();
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
		else if (pt == 3) {

			Scanner bai3 = new Scanner(System.in);
			System.out.println("Nhap chu dien:");
			int soDien = bai3.nextInt();
			double duoi50 = soDien * 1000;
			double tren50 = 50 * 1000 + (soDien - 50) * 1200;
			if (soDien < 50) {
				System.out.println("So tien dien la:" + duoi50);
			}
			else {
				System.out.println("So tien dien la:" + tren50);
			}
			
		}

		else {
			System.exit(0);
		}
	}
}

