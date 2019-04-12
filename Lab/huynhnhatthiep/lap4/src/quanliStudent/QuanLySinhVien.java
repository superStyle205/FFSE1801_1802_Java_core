package quanliStudent;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySinhVien {
	
	private ArrayList<SinhVienFpt>  danhSachSinhVien; 
	private Scanner sc;

	public QuanLySinhVien() {
		danhSachSinhVien = new ArrayList<SinhVienFpt>();
		sc = new Scanner(System.in);
	}

	public void addSinhVien(SinhVienFpt sinhVienFpt) {
		
		danhSachSinhVien.add(sinhVienFpt);
	}

	public void hienThiDanhSachSinhVien() {
		for (int i = 0; i < danhSachSinhVien.size(); i++) {
			danhSachSinhVien.get(i).xuat();
		}
	}

	public void xuatMayDuaGioi() {
//		for (int i = 0; i < danhSachSinhVien.size(); i++) {
//			if (danhSachSinhVien.get(i).getHocLuc().equals("gioi")) {
//				danhSachSinhVien.get(i).xuat();
//			}
//		}
//		cách 2 
		for (SinhVienFpt sinhVienFpt : danhSachSinhVien) {			
			if (sinhVienFpt.getHocLuc().equals("gioi")) {
				sinhVienFpt.xuat();
			}
		}
	}

	public void sortByGpa() {
		SinhVienFpt sinhVienFpt;
//		for (int i = 0; i < danhSachSinhVien.size() - 1; i++) {
//			for (int j = 0; j < danhSachSinhVien.size() - 1 - i; j++) {
//				if (danhSachSinhVien.get(j).getDiem() > danhSachSinhVien .get(j + 1).getDiem()) {
//					sinhVienFpt = danhSachSinhVien.get(j);
//					danhSachSinhVien.set(j ,danhSachSinhVien.get(j + 1));
//					danhSachSinhVien.set((j + 1) ,sinhVienFpt);
//					
//				}
//			}
//		}
		
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
			System.out.println("1. nhập danh sách sinh viên");
			System.out.println("2. hiển thị danh sách sinh viên");
			System.out.println("3. Xuất danh sách sinh viên có học lực giỏi");
			System.out.println("4.sắp xếp sinh viên");
			System.out.println("5. thoát");
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
