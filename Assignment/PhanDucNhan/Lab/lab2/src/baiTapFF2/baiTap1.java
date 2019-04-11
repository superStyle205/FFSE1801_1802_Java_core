package baiTapFF2;

import java.util.Scanner;

public class baiTap1 {

	public static void main(String[] args) {
		System.out.println("Nhap a");
		int a = new Scanner(System.in).nextInt();
		System.out.println("Nhap b");
		int b = new Scanner(System.in).nextInt();
		
		if(a == 0) {
			if(b==0) {
				System.err.println("vo so nghiem");
			}else {
				System.err.println("vo nghiem");
			}
		}else {
			System.out.println(-b/a);
		}
	}

}
