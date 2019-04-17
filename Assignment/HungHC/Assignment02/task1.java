package assignment02;

import java.util.Scanner;

public class task1 {
	private int a;
	private int b;
	private int c;
	private int d;
	private int n;
	private Scanner sc;

	public void docSo() {
		System.out.println("Nhập 1 số nhỏ hơn 9999 muốn đọc thành chữ");
		sc = new Scanner(System.in);
		n = sc.nextInt();
		if (n > 9999) {
			System.out.println("K đúng yêu cầu, vui lòng nhập lại");
			n = sc.nextInt();
		}
		System.out.println("số vừa nhập là " + n);
		a = (n / 1000) % 10;
		b = (n / 100) % 10;
		c = (n / 10) % 10;
		d = n % 10;
		System.out.println("Đọc :");

		switch (a) {
		case 1:
			System.out.print("Một nghìn ");
			break;

		case 2:
			System.out.print("Hai nghìn ");
			break;

		case 3:
			System.out.print("Ba nghìn ");
			break;

		case 4:
			System.out.print("Bốn nghìn ");
			break;

		case 5:
			System.out.print("Năm nghìn ");
			break;

		case 6:
			System.out.print("Sáu nghìn ");
			break;

		case 7:
			System.out.print("Bảy nghìn ");
			break;

		case 8:
			System.out.print("Tám nghìn ");
			break;

		case 9:
			System.out.print("Chín nghìn ");
			break;

		case 0:
			System.out.print("");
			break;
		}

		if (b == 0 && c == 0 && d == 0) {
			//
		} else {
			switch (b) {
			case 1:
				System.out.print("một trăm ");
				break;
			case 2:
				System.out.print("hai trăm ");
				break;
			case 3:
				System.out.print("ba trăm ");
				break;
			case 4:
				System.out.print("bốn trăm ");
				break;
			case 5:
				System.out.print("năm trăm ");
				break;
			case 6:
				System.out.print("sáu trăm ");
				break;
			case 7:
				System.out.print("bảy trăm ");
				break;
			case 8:
				System.out.print("tám trăm ");
				break;
			case 9:
				System.out.print("chín trăm ");
				break;
			case 0:
				if (a == 0) {
					System.out.print("");
				} else {
					System.out.print("không trăm ");
				}
				break;
			}
		}

		if (c == 0 && d == 0) {
			//
		} else {
			switch (c) {
			case 1:
				System.out.print("mười ");
				break;
			case 2:
				System.out.print("hai mươi ");
				break;
			case 3:
				System.out.print("ba mươi ");
				break;
			case 4:
				System.out.print("bốn mươi ");
				break;
			case 5:
				System.out.print("năm mươi ");
				break;
			case 6:
				System.out.print("sáu mươi ");
				break;
			case 7:
				System.out.print("bảy mươi ");
				break;
			case 8:
				System.out.print("tám mươi ");
				break;
			case 9:
				System.out.print("chín mươi ");
				break;
			case 0:
				if (a == 0 && b == 0) {
					System.out.print("");
				} else {
					System.out.print("lẻ ");
				}
				break;
			}
		}

		switch (d) {
		case 1:
			System.out.print("mốt");
			break;
		case 2:
			System.out.print("hai");
			break;
		case 3:
			System.out.print("ba");
			break;
		case 4:
			if (c == 1 || c == 0) {
				System.out.print("bốn");
			} else {
				System.out.print("tư");
			}
			break;
		case 5:
			if (c == 0) {
				System.out.print("năm");
			} else {
				System.out.print("lăm");
			}
			break;
		case 6:
			System.out.print("sáu");
			break;
		case 7:
			System.out.print("bảy");
			break;
		case 8:
			System.out.print("tám");
			break;
		case 9:
			System.out.print("chín");
			break;
		case 0:
			if (a == 0 && b == 0 && c == 0) {
				System.out.print("Không");
			} else {
				System.out.print(" ");
			}
			break;
		}
	}

	public static void main(String[] args) {
		task1 tk = new task1();
		tk.docSo();

	}

}
