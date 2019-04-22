package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLySinhVien {
	private ArrayList<SinhVien> arrSinhVien ;
	private Scanner scanner;
	
	public QuanLySinhVien() {
		arrSinhVien = new ArrayList<>();
		scanner = new Scanner(System.in);
	}
	
	
	public SinhVien nhapThongTin() {
		SinhVien sinhVien = new SinhVien();
		System.out.println("nhập id :");
		sinhVien.setId(Integer.parseInt(scanner.nextLine()));
		
		System.out.println("nhập Tên :");
		sinhVien.setTen(scanner.nextLine());
		
		System.out.println("nhập Tuổi :");
		sinhVien.setTuoi(Integer.parseInt(scanner.nextLine()));
		
		System.out.println("nhập địa chỉ :");
		sinhVien.setDiaChi(scanner.nextLine());
		
		System.out.println("nhập Điểm :");
		sinhVien.setDiem(Double.parseDouble(scanner.nextLine()));
		
		arrSinhVien.add(sinhVien);
		
		return null;
	}
	public void add(SinhVien sinhVien) {
		arrSinhVien.add(sinhVien);
	}
	public void hienThiDanhSachSinhVien() {
		for( SinhVien sinhVien : arrSinhVien) {
		sinhVien.xuat();
		}
	}
	public void RanDomSinhVien() {
		Collections.shuffle(arrSinhVien);
		hienThiDanhSachSinhVien();
	}
	public void SapXepTheoTen() {
		Collections.sort(arrSinhVien, new Comparator<SinhVien>() {
			@Override
			public int compare(SinhVien sv1, SinhVien sv2) {
				return sv1.getTen().compareTo(sv2.getTen());
			}
		});
	}
	
	public SinhVien XoaSinhVien(String ten) {
		int ChucVu = TimTen(ten);
		if (ChucVu == -1) {
			System.out.println("không tìm thấy tên!!");
		} else {
			arrSinhVien.remove(ChucVu);
		}
		return null;
	}
	public int TimTen(String ten) {
		for (int i = 0; i < arrSinhVien.size(); i++) {
			if (arrSinhVien.get(i).getTen().equals(ten)) {
				System.out.println("tìm thấy Tên :");
				return i;
			}
		} return -1;
	}
	public String NhapTen() {
		System.out.println("nhập Tên:");
		return scanner.nextLine();
	}
	
	public void menu() {
		int chooseMenu;
		while (true) {
			System.out.println("---------------------------------------------------");
			System.out.println("1. nhập sinh viên ");
			System.out.println("2. xuất danh sách sinh viên đã nhập");
			System.out.println("3. xuất danh sách sinh viên ngẫu nhiên");
			System.out.println("4. sắp xếp danh sách sinh viên theo tên:");
			System.out.println("5. tìm và xóa sinh viên theo tên:");
			System.out.println("0. kết thúc chương trình :");
			System.out.println("---------------------------------------------------");
			chooseMenu = Integer.parseInt(scanner.nextLine());
			switch (chooseMenu) {
				case 1:
					SinhVien sinhVien =nhapThongTin();
					arrSinhVien.add(sinhVien);
					break;
				case 2:
					hienThiDanhSachSinhVien();
					break;
				case 3:
					RanDomSinhVien();
					break;
				case 4:
					SapXepTheoTen();
					break;
				case 5:
					NhapTen();
					break;
				case 6:
					System.out.println("Tạm biệt");
					System.exit(0);
					break;
				default:
					System.out.println("Không tồn tại tính năng này !!");
					break;
			}
		}
	}
	
	public static void main(String[] args) {
		QuanLySinhVien quanLySinhVien = new QuanLySinhVien();
		quanLySinhVien.menu();
	}
	
}
