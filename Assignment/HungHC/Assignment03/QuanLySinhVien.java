package assignment03;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.SortingFocusTraversalPolicy;

public class QuanLySinhVien {
	ArrayList<SinhVien> listSinhVien;
	private Scanner sc;

	public QuanLySinhVien() {
		listSinhVien = new ArrayList<>();
		sc = new Scanner(System.in);
	}

	public void menu() {
		String chooseMenu;
		while (true) {
			System.out.println("/*****************************************/");
			System.out.println("   1.Thêm sinh viên                        ");
			System.out.println("   2.Cập nhật thông tin sinh viên theo ID  ");
			System.out.println("   3.Xóa sinh viên theo ID                 ");
			System.out.println("   4.Sắp xếp sinh viên theo tên            ");
			System.out.println("   5.Hiển thị danh sách sinh viên          ");
			System.out.println("   6.Kết thúc chương trình                 ");
			System.out.println("/*****************************************/");

			chooseMenu = sc.nextLine();

			switch (chooseMenu) {
			case "1":
				themSinhVien();
				break;

			case "2":
				capNhatSinhVien();
				break;

			case "3":
				xoaSinhVien();
				break;

			case "4":
				sapXepSinhVien();
				break;

			case "5":
				hienThiSinhVien();
				break;

			case "6":
				System.exit(0);

			default:
				System.out.println("Vui lòng nhập đúng ");
			}
		}
	}

	/**
	 * thêm sinh viên
	 */
	public void themSinhVien() {
		System.out.print("nhập số lượng sinh viên cần thêm: ");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			SinhVien sinhVien = new SinhVien();
			System.out.println("Nhập id");
			sinhVien.setId(Integer.parseInt(sc.nextLine()));
			System.out.println("Nhập name");
			sinhVien.setName(sc.nextLine());
			System.out.println("Nhập age");
			sinhVien.setAge(Integer.parseInt(sc.nextLine()));
			System.out.println("Nhập address");
			sinhVien.setAddress(sc.nextLine());
			System.out.println("Nhập gpa");
			sinhVien.setGpa(Double.parseDouble(sc.nextLine()));

			listSinhVien.add(sinhVien);
			System.out.println();
		}
	}

	/**
	 * cập nhật thông tin sinh viên
	 */
	public void capNhatSinhVien() {
		System.out.println("Nhập id");
		int idSV = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < listSinhVien.size(); i++) {
			if (idSV == listSinhVien.get(i).getId()) {
				System.out.println("Nhập name");
				listSinhVien.get(i).setName(sc.nextLine());
				System.out.println("Nhập age");
				listSinhVien.get(i).setAge(Integer.parseInt(sc.nextLine()));
				System.out.println("Nhập address");
				listSinhVien.get(i).setAddress(sc.nextLine());
				System.out.println("Nhập gpa");
				listSinhVien.get(i).setGpa(Double.parseDouble(sc.nextLine()));
			}
		}
		hienThiSinhVien();
	}

	/**
	 * 
	 */
	public void xoaSinhVien() {
		System.out.print("Nhập id sinh viên cần xóa");
		int idSV = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < listSinhVien.size(); i++) {
			if (idSV == listSinhVien.get(i).getId()) {
				listSinhVien.remove(listSinhVien.get(i));
				System.out.println("Đã xóa");
			}
		}

	}

	/**
	 * 
	 */
	public void sapXepSinhVien() {
		SinhVien temp;
		for (int i = 0; i < listSinhVien.size() - 1; i++) {
			for (int j = 0; j < listSinhVien.size() - 1 - i; j++) {
				if (listSinhVien.get(j).getName().compareTo(listSinhVien.get(j + 1).getName()) > 0) {
					temp = listSinhVien.get(j);
					listSinhVien.set(j, listSinhVien.get(j + 1));
					listSinhVien.set(j + 1, temp);
				}
			}
		}
		hienThiSinhVien();
	}

	/**
	 * hiển thị danh sách sinh viên
	 */
	public void hienThiSinhVien() {
		for (int i = 0; i < listSinhVien.size(); i++) {
			System.out.println("Sinh viên thứ " + (i + 1));
			System.out.println("ID: " + listSinhVien.get(i).getId());
			System.out.println("Tên sinh viên là: " + listSinhVien.get(i).getName());
			System.out.println("Tuổi: " + listSinhVien.get(i).getAge());
			System.out.println("Địa chỉ: " + listSinhVien.get(i).getAddress());
			System.out.println("Điểm trung bình: " + listSinhVien.get(i).getGpa());
			System.out.println();
		}
	}
}
