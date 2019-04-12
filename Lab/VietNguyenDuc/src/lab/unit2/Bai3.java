import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số điện sử dụng:");
		int soDien = scanner.nextInt();
		int tien;
		if(soDien <= 50) {
			tien = soDien * 1000;
		}else {
			tien = 50 * 1000 + (soDien - 50)*1200;
		}
		System.out.println("Số tiền điện dùng tháng này là: "+tien+"đ");
	}
}
