package Lab4BaiTap;

import java.util.Scanner;

public class QuanLySinhVien {
	public static final int MAX_LENGTH = 100;

	private SinhVienFpt[] listSinhVien;
	private int size;

	private Scanner sc;

	public QuanLySinhVien() {
		listSinhVien = new SinhVienFpt[MAX_LENGTH];
		sc = new Scanner(System.in);
	}

	public void addSinhVien(SinhVienFpt sinhVienFpt) {
		listSinhVien[size++] = sinhVienFpt;
	}

	public void hienThiListSinhVien() {
		for (int i = 0; i < size; i++) {
			listSinhVien[i].xuat();
		}
	}

	public void xuatSinhVienGioi() {
		for (int i = 0; i < size; i++) {
			if (listSinhVien[i].getHocLuc().equals("gioi")) {
				listSinhVien[i].xuat();
			}
		}
	}

	public void sapXepSinhVienTheoDiem() {
		SinhVienFpt sinhVienFpt;
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - 1 - i; j++) {
				if (listSinhVien[j].getDiem() > listSinhVien[j + 1].getDiem()) {
					sinhVienFpt = listSinhVien[j];
					listSinhVien[j] = listSinhVien[j + 1];
					listSinhVien[j + 1] = sinhVienFpt;
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
			System.out.print("Nhập tên sinh viên : ");
			hoTen = sc.nextLine();
			System.out.print("Nhập ngành : ");
			nganh = sc.nextLine();
			System.out.print("Nhập điểm Java : ");
			double diemJava = Double.parseDouble(sc.nextLine());
			System.out.print("Nhập điểm Css : ");
			double diemCss = Double.parseDouble(sc.nextLine());
			System.out.print("Nhập điểm HTML : ");
			double diemHTMl = Double.parseDouble(sc.nextLine());
			sinhVienFpt = new SinhVienIT(hoTen, nganh, diemJava, diemCss, diemHTMl);
			break;
		case 2:
			System.out.print("Nhập tên sinh viên : ");
			hoTen = sc.nextLine();
			System.out.print("Nhập ngành : ");
			nganh = sc.nextLine();
			System.out.print("Nhập điểm Marketing : ");
			double diemMarketing = Double.parseDouble(sc.nextLine());
			System.out.print("Nhập điểm Sales : ");
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
			System.out.println("Mời lựa chọn");
			chooseMenu = Integer.parseInt(sc.nextLine());
			switch (chooseMenu) {
				case 1:
					SinhVienFpt sinhVienFpt = nhapSinhVien();
					addSinhVien(sinhVienFpt);
					break;
				case 2:
					hienThiListSinhVien();
					break;
				case 3:
					xuatSinhVienGioi();
					break;
				case 4:
					sapXepSinhVienTheoDiem();
					hienThiListSinhVien();
					break;
				case 5:
					System.out.println("Kết thúc");
					System.exit(0);
					break;
				default:
					System.out.println("Không tồn tại trong Menu");
					break;
			}
		}
	}

	public static void main(String[] args) {
		QuanLySinhVien quanLySinhVien = new QuanLySinhVien();
		quanLySinhVien.menu();
	}
}
