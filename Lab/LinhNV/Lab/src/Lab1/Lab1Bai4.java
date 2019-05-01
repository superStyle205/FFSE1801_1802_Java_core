package Lab1;

import java.util.Scanner;

public class Lab1Bai4 {
	public static void main(String[] args) {
		Scanner heSo = new Scanner(System.in);
		
		System.out.print("Nhập hệ số a : " );
		Double a = heSo.nextDouble();
		
		System.out.print("Nhập hệ số b : ");
		Double b = heSo.nextDouble();
		
		System.out.print("Nhập hệ số c : ");
		Double c = heSo.nextDouble();
		
		Double Delta = (Math.pow(b,2)) - 4 * a * c;
		System.out.println("Delta của phương trình bằng : " + Delta);
		
		System.out.println("Căn bậc 2 Delta bằng : " + Math.sqrt(Delta));
	}
}
