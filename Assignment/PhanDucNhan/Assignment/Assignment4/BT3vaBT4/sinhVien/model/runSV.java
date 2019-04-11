package sinhVien.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class runSV {
	private ArrayList<sinhVienFpt> sv = new ArrayList<>();

	public void menu() {
		while(true) {
			System.out.println("1. Nhập danh sách sinh viên\r\n" + 
					"\r\n" + 
					"2. Xuất thông tin danh sách sinh viên\r\n" + 
					"\r\n" + 
					"3. Xuất danh sách sinh viên có học lực giỏi\r\n" + 
					"\r\n" + 
					"4. Sắp xếp danh sách sinh viên theo điểm\r\n" + 
					"\r\n" + 
					"5. Kết ");
			int checkk = new Scanner(System.in).nextInt();
			switch (checkk) {
			case 1:
				nhap();
				break;
			case 2:
				xuat();
				break;
			case 3:
				xuatHocSinhGioi();
				break;
			case 4:
				Collections.sort(sv);
				break;
			case 5:
				System.err.println("Thanks cerr**");
				System.exit(0);
				break;

			default:
				break;
			}
		}
	}



	public  void xuat() {
		for(sinhVienFpt result : sv) {
			System.out.println(result + "\tDTB: " + result.getDiemTB());
		}
	}

	public  void xuatHocSinhGioi() {
		for(sinhVienFpt result : sv) {
			if(result.getDiemTB() >= 5) {
				System.out.println(result + "\tDTB: " + result.getDiemTB());
			}

		}
	}

	public  void nhap() {
		while(true) {
			System.out.println("Nhập tên");
			String ten = new Scanner(System.in).nextLine();
			System.out.println("Nhập ngành - Gõ 'it' hoặc 'biz' ");
			String nganh = new Scanner(System.in).nextLine();
			if(nganh.equalsIgnoreCase("it")) {
				System.out.println("Nhập điểm JAVA - CSS - HTML	");
				double JAVA = new Scanner(System.in).nextDouble();
				double CSS = new Scanner(System.in).nextDouble();
				double HTML = new Scanner(System.in).nextDouble();
				sinhVienIT svv = new sinhVienIT(ten, nganh, JAVA, CSS, HTML);
				sv.add(svv);
			}else{
				System.out.println("Nhập điểm Marketing - Sales	");
				double Marketing = new Scanner(System.in).nextDouble();
				double Sales = new Scanner(System.in).nextDouble();
				sinhVienBiz svv = new sinhVienBiz(ten, nganh, Marketing, Sales);
				sv.add(svv);
			}
			System.out.println("Tiếp không thím: (c/k)");
			String check = new Scanner(System.in).nextLine();
			if(check.equalsIgnoreCase("k")) {
				break;
			}
		}
	}

}
