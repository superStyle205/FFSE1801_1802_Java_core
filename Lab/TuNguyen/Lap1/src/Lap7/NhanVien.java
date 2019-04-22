package Lap7;

import java.util.Scanner;

public class NhanVien {


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.println("Nhập tên:");
			String ten = scan.nextLine();

			String tk = "[A-Z][a-z]*( [A-Z][a-z]*)+";

			if (ten.matches(tk)) {

				break;

			} else {

				System.out.println("Tên không đúng, xin mời nhập lại !!!");

			}



		}

		while (true) {

			System.out.println("Nhập Email:");
			String email = scan.nextLine();

			String em = "[\\w]{1,24}@[\\w]{1,10}\\.[\\w]{1,3}";

			if (email.matches(em)) {
				
				break;

			} else {

				System.out.println("Email không đúng, xin mời nhập lại !!!");

			}

			

		}
		
		while (true) {

			System.out.println("Nhập số điện thoại:");
			String Sdt = scan.nextLine();

			String sdt = "0[0-9]{9}";

			if (Sdt.matches(sdt)) {
				
				break;

			} else {

				System.out.println("Số điện thoại không đúng, xin mời nhập lại !!!");

			}

			

		}
		
		
		while (true) {

			System.out.println("Nhập Cmnd:");
			String Cmnd = scan.nextLine();

			String cmnd = "[0-9]{9}";

			if (Cmnd.matches(cmnd)) {
				
				break;

			} else {

				System.out.println("Email không đúng, xin mời nhập lại !!!");

			}

			

		}

	}


}
