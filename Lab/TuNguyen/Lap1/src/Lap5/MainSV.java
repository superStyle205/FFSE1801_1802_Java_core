package Lap5;
import java.util.Scanner;

public class MainSV extends QLSV{
	public int size = 0;
	public QLSV a[] = new QLSV[100];
	Scanner scan = new Scanner(System.in);
	public void menu() {
		while (true) {
			System.out.println(""
					+ "1. Nhap danh sach sinh vien \n"
					+ "2. Xuat thong tin danh sach sinh vien \n"
					+ "3. Xuat sinh vien co hoc luc gioi \n"
					+ "4. Sap xep danh sach sinh vien theo diem \n"
					+ "5. thoat");
			int n = Integer.parseInt(scan.nextLine());
			switch (n) {
				case 1:
					nhapSV();
					break;
				case 2:
					xuatSV();
					break;
				case 3:
					xuatSVG();
					break;
				case 4:
					sapXepSVV();
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
