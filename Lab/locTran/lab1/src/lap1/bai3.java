package lap1;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		Scanner so = new Scanner(System.in);
		Scanner chu = new Scanner(System.in);
		
		System.out.println("Nhập cạnh của khối lập phương");
		int canh = so.nextInt();
		
		System.out.println("Thể thích khối lập phương là : " + Math.pow(canh,3));
	}
}
