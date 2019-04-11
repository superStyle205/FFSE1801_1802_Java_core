package Assignment3;

import java.util.Scanner;

public class QuanLySinhVien {

	public int size = 0;
	public SinhVien a[] = new SinhVien[100];
	public Scanner scan = new Scanner(System.in);

	public void menu() {
		while (true) {
			System.out.println("" + "/****************************************/ \r\n"
					+ "1. Thêm sinh viên. 	                * . \r\n" + "2. Cập nhật thông tin sinh viên theo ID * . \r\n"
					+ "3. Xóa sinh viên theo ID 		* . \r\n" + "4. Sắp sếp sinh viên theo tên		* . \r\n"
					+ "5. Hiển thị danh sách sinh viên 	* . \r\n" + "0. Kết thúc chương trình                * . \r\n"
					+ "/****************************************/");
			int n = Integer.parseInt(scan.nextLine());
			switch (n) {
				case 1:
					themSinhVien();
					break;
				case 2:
					capNhat();
					break;
				case 3:
					xoaSinhVien();
					break;
				case 4:
					sapXepSV();
					break;
				case 5:
					hienThiSinhVien();
					break;
				case 0:
					System.err.println("THANKS");
					System.exit(0);
					break;
		
				default:
					break;
			}
		}
	}

	public void themSinhVien() {

		System.out.println("Nhap id");
		int id = Integer.parseInt(scan.nextLine());
		
		System.out.println("Nhap name");
		String name = scan.nextLine();
		
		System.out.println("Nhap tuoi");
		int age = Integer.parseInt(scan.nextLine());
		
		System.out.println("Nhap adress");
		String adress = scan.nextLine();
		
		System.out.println("Nhap gpa");
		double gpa = Double.parseDouble(scan.nextLine());
		
		a[size] = new SinhVien(id, name, age, adress, gpa);
		size++;

	}

	public void hienThiSinhVien() {
		for (int j = 0; j < size; j++) {
			System.out.println(a[j].toString());
		}
	}

	public void capNhat() {
		System.out.println("moi nhap id sinh vien");
		int idCheck = Integer.parseInt(scan.nextLine());
		int status = 0;
		for (int i = 0; i < size; i++) {
			if (a[i].getId() == idCheck) {
				System.out.println("Nhap ten moi");
				String ten = scan.nextLine();
				a[i].setName(ten);
				status = 0;
			} else {
				status = -1;
			}
		}
		if (status == -1) {
			System.out.println("khong co sinh vien");
		}
	}

	public void xoaSinhVien() {
		System.out.println("moi nhap id sinh vien");
		int idCheck = Integer.parseInt(scan.nextLine());
		int c = 0, i;
		for (i = 0; i < size; i++) {
			if (a[i].getId() != idCheck) {
				a[i] = a[i];
				c++;
			}
		}
		size = c;
	}

	public void sapXepSV() {
		SinhVien temp;
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {
				if (a[i].getTen().compareTo(a[j].getTen()) > 0) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		for (int i = 0; i < size; i++) {
			System.out.println(a[i].toString());
		}
	}

	public static void main(String[] args) {
		QuanLySinhVien quanLySinhVien = new QuanLySinhVien();
		quanLySinhVien.menu();
	}
}