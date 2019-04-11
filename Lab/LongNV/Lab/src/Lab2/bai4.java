package Lab2;
import java.util.Scanner;
public class bai4 {
	public static void main(String[] args) {
		Scanner so = new Scanner(System.in);
		System.out.println("+---------------------------------------------------+");
		System.out.println("1.	Giải phương trình bậc nhất " );
		System.out.println("2.	Giải phương trình bậc 2");
		System.out.println("3.	Tính tiền điện");
		System.out.println("4.	Kết thúc");
		System.out.println("+---------------------------------------------------+");
		
		System.err.println("Chọn");
		int chon = so.nextInt();
		switch (chon) {
		case 1:
			System.out.println("Phương trình bậc nhất có dạng : ax + b = 0");
			System.out.println("Nhập số a");
			int q = so.nextInt();
			
			System.out.println("Nhập số b");
			int w = so.nextInt();
			
			if (q == 0) {
				if (w == 0) {
					System.err.println("Phương trình vô số nghiệm");
				}else {
					System.err.println("Phương trình vô nghiệm");
				}
			}else {
				System.err.println("Phương trình có nghiệm là : " + -w/q);
			}
			break;
		case 2:
			System.out.println("Phương trình bậc hai có dạng : ax2 + bx + c = 0");
			System.out.println("Nhập số a");
			int a = so.nextInt();
			
			System.out.println("Nhập số b");
			int b = so.nextInt();
			
			System.out.println("Nhập số c");
			int c = so.nextInt();
			
			if (a == 0) {
				if (b == 0) {
					if (c == 0) {
						System.err.println("Phương trình vô số nghiệm");
					}else {
						System.err.println("Phương trình vô nghiệm");
					}
				}else {
					System.err.println("Phương trình có nghiệm là : " + -c/b);
				}
			}else {
				double delta = b*b - 4*a*c;
				System.out.println("Delta của phương trình là : " + delta);
				if (delta < 0) {
					System.err.println("Phương trình vô nghiệm");
				}else if(delta == 0 ) {
					System.out.println("Phương trình có nghiệm kép x1 = x2 = " + (-b/2*a));
				}else {
					System.out.println("Phương trình có hai nghiệm phân biệt");
					double x1 = ((-b-Math.sqrt(delta))/2*a);
					double x2 = ((-b+Math.sqrt(delta))/2*a);
					System.out.println("X1 = " + x1);
					System.out.println("X2 = " + x2);
				}
			}
			break;
		case 3:
		System.out.println("Nhập số điện sử dụng của tháng " );
		double soDien = so.nextDouble();
		
		if (soDien >= 0) {
			if (soDien <= 50) {
				double soTien = soDien * 1000;
				System.err.printf("Số tiền với mức sử dụng %.1f chữ là : %.3f đ" , soDien , soTien);
			}else {
				double soTien = (soDien - 50)*1200 + soDien * 50;
				System.err.printf("Số tiền với mức sử dụng %.1f chữ là : %.3f đ" , soDien , soTien);
			}
		}else {
			System.err.println("Vui lòng nhập lại!");
		}
		break;
		default:
			System.exit(0);
			break;
		}
	}
}
