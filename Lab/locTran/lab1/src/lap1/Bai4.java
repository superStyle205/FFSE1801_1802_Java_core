package lap1;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner so = new Scanner(System.in);
		Scanner chu = new Scanner(System.in);
				
		System.out.println("Nhập số a");
		Double a = so.nextDouble();
		
		System.out.println("Nhập số b");
		Double b = so.nextDouble();
		
		System.out.println("Nhập số c");
		Double c = so.nextDouble();
		
		Double Delta = Math.pow(b,2) - 4*a*c;
		Double canDelta = Math.sqrt(Delta);
		
		System.out.println("Delta của phương trình trên là  " + Delta);
		System.out.println("Căn Delta của phương trình trên là  " + canDelta);
		
	}
}
