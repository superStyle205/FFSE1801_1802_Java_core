package Lab1;

import java.util.Scanner;

public class Lab1Bai3 {
	public static void main(String[] args) {
		Scanner doDai = new Scanner(System.in);
		System.out.println("Nhập chiều dài cạnh hình lập phương :");
		int canh = doDai.nextInt();
		
		System.out.println("Thể tích hình hình lập phương là : " + (canh * canh * canh));
		// cách 1
		System.out.println("Thể tích hình hình lập phương là : " + Math.pow(canh, 3));
		// cách 2
	}
	
}
