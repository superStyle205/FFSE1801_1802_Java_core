package Assignment4;
import java.util.Scanner;

public class MainKH extends Run{

	public void menu() {
		while(true) {
			System.out.println("------------");
			System.out.println("1. Nhập thông tin khách hàng");
			System.out.println("2. Hiển thị biên lai");
			System.out.println("------------");
			int n = Integer.parseInt(scan.nextLine());
			switch(n) {
			case 1:
				NhapKH();
				break;
			case 2:
				in();
				break;
				default:
				break;
			}
		}
	}
}
	