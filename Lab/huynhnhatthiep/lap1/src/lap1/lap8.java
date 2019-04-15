package lap1;
import java.util.Scanner;
public class lap8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap a");
		int a = sc.nextInt();
		
		System.out.println("Nhap b");
		int b = sc.nextInt();
		thucDon(a,b);
	}
	public static void thucDon(int a, int b) {
		System.out.println("Chon thuc don");
		System.out.println("1. phep cong");
		System.out.println("2. phep tru");
		System.out.println("3. thoat ra");
		
		Scanner ch = new Scanner(System.in);
		int pt = ch.nextInt();
		if(pt == 1) {
			System.out.println(a+b);
		}else if(pt == 2) {
			System.out.println(a-b);
		}else {
			System.exit(0);
		}		
	}
}
