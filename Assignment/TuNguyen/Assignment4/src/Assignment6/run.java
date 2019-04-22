package Assignment6;

import java.util.Scanner;

public class run extends QuanLyConNguoi{
	
	Scanner scan = new Scanner(System.in);
	
	public void menu() throws Exception{
		while (true) {
			System.out.println(""
					+ "1. Nhập thông tin cán bộ \n"
					+ "2. Xuất danh sách giảng viên và nhân viên \n"
					+ "3. Tổng số lương phải trả \n"
					+ "4. Sắp xếp danh sách."
					+ "5. Thoát");
			int n = Integer.parseInt(scan.nextLine());
			switch(n) {
			case 1:
				nhapThongTin();
				break;
			case 2:
				xuat();
				break;
			case 3:
				tongLuong();
				break;
			case 4:
				sapXep();
				break;
			case 5:
				System.err.println("THANKS");
				System.exit(0);
				break;
				
				default:
				break;
				
			}
		}
	}
}
