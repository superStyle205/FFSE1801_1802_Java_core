package Lab2;

import java.util.Scanner;

public class Lab2Bai5 {
	public static void main(String[] args) {
		
		
		for (int i = 1 ; i < 10; i++) {
			System.out.println("Bảng cửu chương " + i);
			for (int j = 1 ; j <= 10 ; j++ ) {
				System.out.printf("%d x %d = %d \n",i,j,i*j);
			}
		}
	}
}
