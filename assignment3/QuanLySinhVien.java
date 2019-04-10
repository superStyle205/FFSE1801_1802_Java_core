package assignment3;

import java.util.Scanner;

public class QuanLySinhVien {

	private static final int MAX_LENGTH = 100;

	private SinhVien[] sinhVienArray;
	private int size;

	private Scanner sc;

	public QuanLySinhVien() {
		sinhVienArray = new SinhVien[MAX_LENGTH];
		sc = new Scanner(System.in);
	}
	
	public void doSomething() {}

	public void themSinhVien() {
		if (size == MAX_LENGTH) {
			System.out.println("Out off range");
			return;
		}

		SinhVien sinhVien = new SinhVien();
		System.out.print("Nhap id sinh vien : ");
		sinhVien.setId(Integer.parseInt(sc.nextLine()));

		System.out.print("Nhap name sinh vien : ");
		sinhVien.setName(sc.nextLine());

		System.out.print("Nhap age sinh vien : ");
		sinhVien.setAge(Integer.parseInt(sc.nextLine()));

		System.out.print("Nhap address sinh vien : ");
		sinhVien.setAddress(sc.nextLine());

		System.out.print("Nhap gpa sinh vien : ");
		sinhVien.setGpa(Double.parseDouble(sc.nextLine()));


		sinhVienArray[size++] = sinhVien;
	}

	public void capNhapSinhVienTheoId(int id) {
		SinhVien sinhVien = timSinhVienTheoId(id);
		if (sinhVien != null) {
			System.out.print("Nhap id moi : ");
			sinhVien.setId(Integer.parseInt(sc.nextLine()));
			System.out.print("Nhap name moi : ");
			sinhVien.setName(sc.nextLine());
			System.out.print("Nhap age moi : ");
			sinhVien.setAge(Integer.parseInt(sc.nextLine()));
			System.out.print("Nhap address moi : ");
			sinhVien.setAddress(sc.nextLine());
			System.out.print("Nhap gpa moi : ");
			sinhVien.setGpa(Float.parseFloat(sc.nextLine()));
		} else {
			System.out.println("~~~Khong ton tai sinh vien voi id la " + id + "~~~");
		}
	}

	public void xoaSinhVienTheoId(int id) {
		if (timSinhVienTheoId(id) != null) {
			// tinh huong sinh vien can xoa nam o cuoi mang
			if (sinhVienArray[size - 1].getId() == id) {
				sinhVienArray[--size] = null;
			} else {
				for (int i = 0; i < size - 1; i++) {
					if (sinhVienArray[i].getId() == id) {
						for (int j = i; j < size - 1; j++) {
							sinhVienArray[j] = sinhVienArray[j + 1];
						}
						sinhVienArray[--size] = null;
					}
				}
			}
		} else {
			System.out.println("~~~Khong ton tai sinh vien voi id la " + id + "~~~");
		}
	}

	public void sapXepDanhSachSinhVien() {
		SinhVien tmpSinhVien;
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - 1 - i; j++) {
				if (sinhVienArray[j].getName().compareTo(sinhVienArray[j + 1].getName()) > 0) {
					tmpSinhVien = sinhVienArray[j];
					sinhVienArray[j] = sinhVienArray[j + 1];
					sinhVienArray[j + 1] = tmpSinhVien;
				}
			}
		}
	}

	public SinhVien timSinhVienTheoId(int id) {
		for (int i = 0; i < size; i++) {
			if (sinhVienArray[i].getId() == id) {
				return sinhVienArray[i];
			}
		}

		return null;
	}
	
	public void hienThiSinhVien(SinhVien sinhVien) {
		System.out.println("id : " + sinhVien.getId() + " - name : " + sinhVien.getName() + " -  age : " + sinhVien.getAge()
				+ " - address : " + sinhVien.getAddress() + " - gpa : " + sinhVien.getGpa());
	}

	public void hienThiDanhSachSinhVien() {
		if (size != 0) {
			for (int i = 0; i < size; i++) {
				hienThiSinhVien(sinhVienArray[i]);
			}
		} else {
			System.out.println("~~~Danh sach sinh vien rong~~~");
		}
	}

	public void menu() {
		String chooseMenu;
		while(true) {
			System.out.println("------------------------------");
			System.out.println("1 - Them sinh vien");
			System.out.println("2 - Sua sinh vien theo id");
			System.out.println("3 - Xoa sinh vien theo id");
			System.out.println("4 - Sap xep sinh vien theo ten");
			System.out.println("5 - Hien thi danh sach sinh vien");
			System.out.println("0 - Thoat");
			System.out.println("------------------------------");

			chooseMenu = sc.nextLine();

			switch(chooseMenu) {
				case "1" :
					themSinhVien();
					break;
				case "2" :
					System.out.print("Nhap id sinh vien can sua : ");
					capNhapSinhVienTheoId(Integer.parseInt(sc.nextLine()));
					break;
				case "3" :
					System.out.print("Nhap id sinh vien can sua : ");
					xoaSinhVienTheoId(Integer.parseInt(sc.nextLine()));
					break;
				case "4" :
					sapXepDanhSachSinhVien();
					System.out.println("Danh sach sinh vien sau khi sap xep la :");
					hienThiDanhSachSinhVien();
					break;
				case "5" :
					hienThiDanhSachSinhVien();
					break;
				case "0" :
					System.out.println("$$$$ Bye bye $$$$");
					sc.close();
					System.exit(0);
					break;
				default :
					System.out.println("~~~menu khong ton tai~~~");
			}			
		}
	}

	/**
	 * Data dummy
	 */
	public void loadDataDumy() {
		SinhVien sv = new SinhVien(1, "Cong Manh", 20, "193 Nguyen Luong Bang", 8.5);
		sinhVienArray[size++] = sv;

		sv = new SinhVien(2, "Van Hoi", 19, "92 Le Loi", 7.6);
		sinhVienArray[size++] = sv;

		sv = new SinhVien(3, "Duy Luan", 21, "75 Ham Nghi", 9.5);
		sinhVienArray[size++] = sv;

		sv = new SinhVien(4, "Van Linh", 22, "76 Ho Nguyen Trung", 9.5);
		sinhVienArray[size++] = sv;

		sv = new SinhVien(5, "Ho Ngoc Ha", 35, "Sai Gon", 5.5);
		sinhVienArray[size++] = sv;
	}
}