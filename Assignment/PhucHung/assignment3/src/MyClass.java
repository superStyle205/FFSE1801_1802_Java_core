

import java.util.Scanner;
import javax.xml.crypto.Data;
import java.util.ArrayList;

public class MyClass {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		StudentManager manager = new StudentManager();
		String repeat;
		int option;
		do {
			System.out.println("1.ADD SV");
			System.out.println("2.UPDATE SV");
			System.out.println("3.DELETE SV");
			System.out.println("4.ARANGE SV");
			System.out.println("5.SHOW LIST SV:");
			System.out.println("0. EXIT");
			option = Integer.parseInt(sc.nextLine());
			switch (option) {
			case 1:
				manager.add();
				break;
			case 2:	
				manager.update();
				break;
			case 3:
				manager.removeNumber();
				break;
			case 4:
				manager.sort();
			case 5:
				manager.showList();
				break;

			default:
				System.out.println("Lua chon cua ban ko dung");
				break;
			}
			System.out.println("Co muon tiep tuc hay ko ?? YES / NO");
			repeat = sc.nextLine();
		} while (repeat.equals("yes") == true);
	}
}