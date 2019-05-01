package Lab4_Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySinhVien {
	private ArrayList<SinhVienFpt> quanLySinhVien;
	private Scanner scan;
	
	public QuanLySinhVien() {
		quanLySinhVien = new ArrayList<>();
		scan = new Scanner(System.in);
	}
	
	//1. Nhập danh sách sinh viên
	public void addSinhVien(SinhVienFpt sinhVienFpt) {
		quanLySinhVien.add(sinhVienFpt);
	}
	
	
	//2. Xuất thông tin danh sách sinh viên
	public void hienThiDanhSachSinhVien() {
		for (SinhVienFpt sinhVienFpt : quanLySinhVien) {
			sinhVienFpt.xuat();
		}
	}
	
	
	//3. Xuất danh sách sinh viên có học lực giỏi
	public void xuatMayDuaGioi() {
		for (SinhVienFpt sinhVienFpt : quanLySinhVien) {
			if (sinhVienFpt.getHocLuc().equals("Giỏi")) {
				sinhVienFpt.xuat();
			}
		}
	}
		
	//4. Sắp xếp danh sách sinh viên theo điểm
	public void sortByGpa() {
		SinhVienFpt sinhVienFpt;
		for (int i = 0; i < quanLySinhVien.size() - 1; i++) {
			for (int j = 0; j < quanLySinhVien.size() -1 - i; j++) {
				if (quanLySinhVien.get(j).getDiem() > quanLySinhVien.get(j + 1).getDiem()) {
					sinhVienFpt = quanLySinhVien.get(j);
					quanLySinhVien.set(j, quanLySinhVien.get(j+1));
					quanLySinhVien.set((j+1), sinhVienFpt);
				}
			}
		}
	}
	
	public SinhVienFpt nhapSinhVien() {
		SinhVienFpt sinhVienFpt = null;
		String hoTen;
		String nganh;
		System.err.print("1. Thêm sinh viên IT\n"
				+ "2. Thêm sinh viên Biz\n"
				+ "Chọn thao tác: ");
		int chooseInput = Integer.parseInt(scan.nextLine());
		switch (chooseInput) {
		case 1:
			System.err.print("Nhập họ tên: ");
			hoTen = scan.nextLine();
			System.err.print("Nhập ngành: ");
			nganh = scan.nextLine();
			System.err.print("Nhập điểm java: ");
			double diemJava = Double.parseDouble(scan.nextLine());
			System.err.print("Nhập điểm css: ");
			double diemCss = Double.parseDouble(scan.nextLine());
			System.err.print("Nhập điểm html: ");
			double diemHtml = Double.parseDouble(scan.nextLine());
			sinhVienFpt = new SinhVienIT(hoTen, nganh, diemJava, diemCss, diemHtml);
			break;
			
		case 2:
			System.err.print("Nhập họ tên: ");
			hoTen = scan.nextLine();
			System.err.print("Nhập ngành: ");
			nganh = scan.nextLine();
			System.err.print("Nhập điểm marketing: ");
			double diemMarketing = Double.parseDouble(scan.nextLine());
			System.err.print("Nhập điểm sales: ");
			double diemSales = Double.parseDouble(scan.nextLine());
			sinhVienFpt = new SinhVienBiz(hoTen, nganh, diemSales, diemMarketing);
			break;
		default:
			break;
		}
		return sinhVienFpt;
	}
	
	public void menu() {
		while(true) {
			System.err.println("Mời chọn chức năng [1_5]");
			System.err.println("1. Nhập danh sách sinh viên");
			System.err.println("2. Xuất thông tin danh sách sinh viên");
			System.err.println("3. Xuất danh sách sinh viên có học lực giỏi");
			System.err.println("4. Sắp xếp danh sách sinh viên theo điểm");
			System.err.println("5. Kết thúc!");
			System.err.print("Mời chọn chức năng: ");
			int chooseMenu = Integer.parseInt(scan.nextLine());
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
				System.err.println("Tạm biệt!!!");
				System.exit(0);
				break;

			default:
				System.err.println("Mời nhập lại: ");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		QuanLySinhVien quanLySinhVien = new QuanLySinhVien();
		quanLySinhVien.menu();
	}
}
