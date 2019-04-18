package Bai3;

import java.util.Scanner;

public class MyClass {
	public static int size = 0;
	public static SinhVienFpt a[] = new SinhVienFpt[100];

	public static void main(String[] args) {

		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		x("/****************************************/");
		x("1. Add Student.");
		x("2. Show infomation Students");
		x("3. Show infomation Good Students");
		
		x("0. End.");
		x("/****************************************/");
	
		do {
			x("Lá»±a chá»�n cá»§a báº¡n[0-5]");
			int choise = sc.nextInt();

			switch (choise) {
			case 1:
				addStudent();
				break;
			case 2:
				infoStudent();
				break;
			case 3:
				infoStudentGood();
				break;
					
			case 0:
			default:
				flag = false;
				break;
			}
		} while (flag == true);
	}

	public static void addStudent() {
		Scanner chu = new Scanner(System.in);
		Scanner so = new Scanner(System.in);

		x("Chá»�n ngĂ nh (1 : IT -- 2 : Biz)");
		int choseNganh = so.nextInt();

		if (choseNganh == 1) {
			x("Name : ");
			String name = chu.nextLine();

			x("Java : ");
			double java = so.nextInt();

			x("Css : ");
			double css = so.nextInt();

			x("Html : ");
			double html = so.nextInt();

			a[size] = new SinhVienIT(name, java, css, html);
			size++;
		} else if (choseNganh == 2) {
			x("Name : ");
			String name = chu.nextLine();

			x("Mamarketting : ");
			double mamarketting = so.nextInt();

			x("Sales : ");
			double sales = so.nextInt();
			a[size] = new SinhVienBiz(name, mamarketting, sales);
			size++;
		} else {
			x("Vui lĂ²ng chá»�n 1 hoáº·c 2!");
		}

	}

	public static void infoStudent() {
		if (size != 0) {
			for (int j = 0; j < size; j++) {
				a[j].show();
			}
		} else {
			x("Danh sĂ¡ch trá»‘ng");
		}

	}

	public static void infoStudentGood() {
		if (size != 0) {
			for (int j = 0; j < size; j++) {
				if (a[j].getHocLuc().equals("Giá»�i")) {
					a[j].show();
				}
			}
		} else {
			x("Danh sĂ¡ch trá»‘ng");
		}
	}


	public static void x(String chim) {
		System.out.println(chim);
	}
}
