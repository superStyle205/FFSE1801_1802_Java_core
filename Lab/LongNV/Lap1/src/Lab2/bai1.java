package Lab2;
import java.util.Scanner;
public class bai1 {
	public static void main(String[] arge) {
		Scanner so = new Scanner(System.in);
		System.out.println("Phương trình bậc nhất có dạng : ax + b = 0");
		System.out.println("Nhập số a");
		int a = so.nextInt();
		
		System.out.println("Nhập số b");
		int b = so.nextInt();
		
		if (a == 0) {
			if (b == 0) {
				System.err.println("Phương trình vô số nghiệm");
			}else {
				System.err.println("Phương trình vô nghiệm");
			}
		}else {
			System.err.println("Phương trình có nghiệm là : " + -b/a);
		}
	}

}
