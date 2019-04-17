package Assingment3;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySinhVien {
	private String id;
	private String name;
	private int age;
	private String address;
	private double gpa;
	private ArrayList<QuanLySinhVien> quanLySinhVienAll;
	private Scanner scan;
	
	public QuanLySinhVien() {
		quanLySinhVienAll = new ArrayList<>();
		scan = new Scanner(System.in);
	}
	
	public QuanLySinhVien(String id, String name, int age, String address, double gpa) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.gpa = gpa;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	//1. Thêm sinh viên
	public void addSinhVien() {
		QuanLySinhVien ql = new QuanLySinhVien();
		System.err.print("Nhập ID: ");
		ql.setId(scan.nextLine());
		System.err.print("Nhập tên: ");
		ql.setName(scan.nextLine());
		System.err.print("Nhập tuổi: ");
		ql.setAge(Integer.parseInt(scan.nextLine()));
		System.err.print("Nhập địa chỉ: ");
		ql.setAddress(scan.nextLine());
		System.err.print("Nhập điểm trung bình: ");
		ql.setGpa(Double.parseDouble(scan.nextLine()));
		quanLySinhVienAll.add(ql);
	}
	
	//2. Cập nhật thông tin sinh viên theo ID
	public void capNhatSinhVien() {
		System.err.print("Nhập ID cần sửa: ");
		String choose = scan.nextLine();
		for (QuanLySinhVien quanLySinhVien : quanLySinhVienAll) {
			if (choose.equals(quanLySinhVien.id)) {
				quanLySinhVien.xuat();
				System.err.print("Nhập tên mới: ");
				quanLySinhVien.setName(scan.nextLine());
				System.err.print("Nhập tuổi mới: ");
				quanLySinhVien.setAge(Integer.parseInt(scan.nextLine()));
				System.err.print("Nhập địa chỉ mới: ");
				quanLySinhVien.setAddress(scan.nextLine());
				System.err.print("Nhập điểm trung bình mới: ");
				quanLySinhVien.setGpa(Double.parseDouble(scan.nextLine()));
			}
		}
	}
	
	//3. Xóa sinh viên theo ID
	public void xoaSinhVien() {
		System.err.print("Nhập ID cần xóa: ");
		String timID = scan.nextLine();
		for (int i = 0; i < quanLySinhVienAll.size(); i++) {
			if (timID.equals(quanLySinhVienAll.get(i).id)) {
				quanLySinhVienAll.remove(i);
				System.err.println("--->Đã xóa sinh viên có ID: " +timID);
			}
		}
	}
	
	//4. Sắp sếp sinh viên theo tên
	public void sortSinhVienTheoTen() {
		QuanLySinhVien quanLySinhVien;
		for (int i = 0; i < quanLySinhVienAll.size() -1; i++) {
			for (int j = 0; j < quanLySinhVienAll.size() - 1 - i; j++) {
				if (quanLySinhVienAll.get(j).getName().compareTo(quanLySinhVienAll.get(j + 1).getName()) > 0) {
					quanLySinhVien = quanLySinhVienAll.get(j);
					quanLySinhVienAll.set(j, quanLySinhVienAll.get(j + 1));
					quanLySinhVienAll.set((j+ 1), quanLySinhVien);
				}
			}
		}
	}
	
	public String getName() {
		return name;
	}

	//5. Hiển thị danh sách sinh viên
	public void hienThiDanhSachsSinhVien() {
		for (QuanLySinhVien quanLySinhVien : quanLySinhVienAll) {
			quanLySinhVien.xuat();
		}
	}
	
	public void xuat() {
		System.err.println("ID: " +id);
		System.err.println("Họ và tên: " +name);
		System.err.println("Tuổi: " +age);
		System.err.println("Địa chỉ: " +address);
		System.err.println("Điểm trung bình: " +gpa);
	}
	public void menu() {
		while(true) {
			System.err.println("--->Chọn chức năng [1_6]");
			System.err.println("1. Thêm sinh viên");
			System.err.println("2. Cập nhật thông tin sinh viên theo ID");
			System.err.println("3. Xóa sinh viên theo ID");
			System.err.println("4. Sắp sếp sinh viên theo tên");
			System.err.println("5. Hiển thị danh sách sinh viên");
			System.err.println("6. Kết thúc chương trình");
			System.err.print("--->Mời chọn chức năng: ");
			int chooseMenu = Integer.parseInt(scan.nextLine());
			switch (chooseMenu) {
			case 1:
				addSinhVien();
				break;
				
			case 2:
				capNhatSinhVien();
				break;
				
			case 3:
				xoaSinhVien();
				break;
	
			case 4:
				sortSinhVienTheoTen();
				hienThiDanhSachsSinhVien();
				break;
	
			case 5:
				hienThiDanhSachsSinhVien();
				break;
	
			case 6:
				System.err.println("--->Tạm biệt!!!");
				System.exit(0);
				break;

			default:
				System.err.println("--->Nhập lại!!!");
				break;
			}
		}
	}

	public static void main(String[] args) {
		QuanLySinhVien quanLySinhVien = new QuanLySinhVien();
		quanLySinhVien.menu();
	}
}
