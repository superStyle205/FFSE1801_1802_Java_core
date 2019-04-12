package baiTapFF2;

import java.util.Scanner;

public class baiTap3 {

	public static void main(String[] args) {
		System.out.println("Nhap chu dien");
		int sc = new Scanner(System.in).nextInt();
		
		if(sc < 50 && sc >= 0) {
			System.out.println("kq: "+ sc * 1000);
		}else {
			System.out.println("kq: " + 50 * 1000 + (sc - 50) * 1200);
		}
		
	}

}
