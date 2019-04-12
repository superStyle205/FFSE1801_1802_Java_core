package lab4.bai3;

import java.util.Scanner;

public class QuanLySinhVien {
	public static final int MAX_LENGTH = 100;

	private SinhVienFpt[] danhSachSinhVien;
	private int size;

	private Scanner sc;

	public QuanLySinhVien() {
		danhSachSinhVien = new SinhVienFpt[MAX_LENGTH];
		sc = new Scanner(System.in);
	}

	public void addSinhVien(SinhVienFpt sinhVienFpt) {
		danhSachSinhVien[size++] = sinhVienFpt;
	}

	public void hienThiDanhSachSinhVien() {
		for (int i = 0; i < size; i++) {
			danhSachSinhVien[i].xuat();
		}
	}

	public void xuatMayDuaGioi() {
		for (int i = 0; i < size; i++) {
			if (danhSachSinhVien[i].getHocLuc().equals("gioi")) {
				danhSachSinhVien[i].xuat();
			}
		}
	}

	public void sortByGpa() {
		SinhVienFpt sinhVienFpt;
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - 1 - i; j++) {
				if (danhSachSinhVien[j].getDiem() > danhSachSinhVien[j + 1].getDiem()) {
					sinhVienFpt = danhSachSinhVien[j];
					danhSachSinhVien[j] = danhSachSinhVien[j + 1];
					danhSachSinhVien[j + 1] = sinhVienFpt;
				}
			}
		}
	}

	public SinhVienFpt nhapSinhVien() {
		SinhVienFpt sinhVienFpt = null;
		String hoTen;
		String nganh;
		System.out.print("Chon 1 nhap sinh vien IT| 2 nhap sinh vien biz: ");
		int chooseInput = Integer.parseInt(sc.nextLine());
		switch (chooseInput) {
		case 1:
			System.out.print("nhap ten : ");
			hoTen = sc.nextLine();
			System.out.print("nhap nganh : ");
			nganh = sc.nextLine();
			System.out.print("nhap diem java : ");
			double diemJava = Double.parseDouble(sc.nextLine());
			System.out.print("nhap diem css : ");
			double diemCss = Double.parseDouble(sc.nextLine());
			System.out.print("nhap diem HTML : ");
			double diemHTMl = Double.parseDouble(sc.nextLine());
			sinhVienFpt = new SinhVienIT(hoTen, nganh, diemJava, diemCss, diemHTMl);
			break;
		case 2:
			System.out.print("nhap ten : ");
			hoTen = sc.nextLine();
			System.out.print("nhap nganh : ");
			nganh = sc.nextLine();
			System.out.print("nhap diem marketing : ");
			double diemMarketing = Double.parseDouble(sc.nextLine());
			System.out.print("nhap diem sales : ");
			double diemSales = Double.parseDouble(sc.nextLine());
			sinhVienFpt = new SinhVienBiz(hoTen, nganh, diemMarketing, diemSales);
			break;
		}

		return sinhVienFpt;
	}

	public void menu() {
		int chooseMenu;
		while (true) {
			System.out.println("1. Nhập danh sách sinh viên");
			System.out.println("2. Xuất thông tin danh sách sinh viên");
			System.out.println("3. Xuất danh sách sinh viên có học lực giỏi");
			System.out.println("4. Sắp xếp danh sách sinh viên theo điểm");
			System.out.println("5. Kết thúc");
			System.out.println("moi lua chon");
			chooseMenu = Integer.parseInt(sc.nextLine());
			switch (chooseMenu) {
				case 1:
					SinhVienFpt sinhVienFpt = nhapSinhVien();
					addSinhVien(sinhVienFpt);
					break;
				case 2:
					hienThiDanhSachSinhVien();
					break;
				case 3:
					xuatMayDuaGioi();
					break;
				case 4:
					sortByGpa();
					hienThiDanhSachSinhVien();
					break;
				case 5:
					System.out.println("tam biet");
					System.exit(0);
					break;
				default:
					System.out.println("khong ton tai tinh nang nay");
					break;
			}
		}
	}

	public static void main(String[] args) {
		QuanLySinhVien quanLySinhVien = new QuanLySinhVien();
		quanLySinhVien.menu();
	}
}
