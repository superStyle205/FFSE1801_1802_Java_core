package Lab2;
import java.util.Scanner;
public class bai3 {
	public static void main(String[] args) {
		Scanner so = new Scanner(System.in);
		System.out.println("Nhập số điện sử dụng của tháng " );
		double soDien = so.nextDouble();
		
		if (soDien >= 0) {
			if (soDien <= 50) {
				double soTien = soDien * 1000;
				System.err.printf("Số ti�?n với mức sử dụng %.1f chữ là : %.3f đ" , soDien , soTien);
			}else {
				double soTien = (soDien - 50)*1200 + soDien * 50;
				System.err.printf("Số ti�?n với mức sử dụng %.1f chữ là : %.3f đ" , soDien , soTien);
			}
		}else {
			System.err.println("Vui lòng nhập lại!");
		}
	}
}
