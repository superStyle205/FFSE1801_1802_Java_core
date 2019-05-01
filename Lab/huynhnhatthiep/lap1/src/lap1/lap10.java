package lap1;
import java.util.Scanner;
public class lap10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double soDien;
		System.out.print("so dien =");
		soDien = sc.nextDouble();
		if( soDien > 50) {
			System.out.println("so tien dien"+(soDien*1000));
		}else {
			System.out.println("so tien dien"+(50*1000+(soDien-50)*1200));
		}
		
	}
}
