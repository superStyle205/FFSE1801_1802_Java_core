package Lap2;
import java.util.Scanner;

public class PhuongTrinhBac1 {
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Nhap a:");
//		int heSoA = scan.nextInt();
//		System.out.println("Nhap b:");
//		int heSoB = scan.nextInt();
//		if (heSoA == 0) {
//			
//				System.out.println("Phuong trinh vo so nghiem");
//		}
//				else if (heSoB == 0) {
//					System.out.println("Phuong trinh vo nghiem");
//				}
//				else {
//					System.out.println("Phuong trinh co nghiem x la:" + (- heSoB / heSoA));
//				}
//			}
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Nhap a:");
			double a = scan.nextInt();
			System.out.println("Nhap b:");
			double b = scan.nextInt();
			nhapDL(a,b);
		}
		public static void nhapDL(double a, double b) {
			if (a == 0) {
				
					System.out.println("Phuong trinh vo so nghiem");
			}
					else if (b == 0) {
						System.out.println("Phuong trinh vo nghiem");
					}
					else {
						System.out.println("Phuong trinh co nghiem x la:" + (- b / a));
					}
		}
	}

