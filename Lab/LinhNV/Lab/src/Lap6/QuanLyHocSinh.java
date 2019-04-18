package Lap6;

import java.util.Scanner;
import java.util.ArrayList;

public class QuanLyHocSinh {
	public static int size = 0;
	private static ArrayList<HocSinh> listHS = new ArrayList<HocSinh>();
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			menu();
		}
	}

	public static void menu() {
		System.out.println("/****************************************/ \r\n" 
				+ "1. Thêm học sinh. (+2 điểm) \r\n"
				+ "2. Cập nhật thông tin học sinh theo ID ( + 2 điểm) . \r\n"
				+ "3. Xóa học sinh theo ID ( + 2 điểm ). \r\n" + "4. Sắp sếp học sinh theo tên ( + 2 điểm ). \r\n"
				+ "5. Hiển thị danh sách học sinh ( +2 điểm ). \r\n" + "0. Kết thúc chương trình. \r\n"
				+ "/****************************************/");
		int n = Integer.parseInt(sc.nextLine());
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

			break;
		case 5:
			hienThiSinhVien();
			break;
		case 0:
			System.err.println("kết thúc");
			System.exit(0);
			break;

		default:
			break;
		}
	}

	public static void themSinhVien() {
		HocSinh hocSinh = new HocSinh();
		// System.out.print("Nhập id : ");
		// int id = Integer.parseInt(sc.nextLine());
		while (true) {
			try {
				System.out.print("Nhập id : ");
				hocSinh.setId(Integer.parseInt(sc.nextLine()));
				kiemTraMa(hocSinh.getId());
				break;
			} catch (NumberFormatException e) {
				System.out.println("id rỗng");
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
		while (true) {
			try {
				System.out.print("Nhập name : ");
				hocSinh.setName(sc.nextLine());
				kiemTraTen(hocSinh.getName());
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		while (true) {
			try {
				System.out.print("Nhập age : ");
				hocSinh.setAge(Integer.parseInt(sc.nextLine()));
				kiemTraTuoi(hocSinh.getAge());
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		while (true) {
			try {
				System.out.print("Nhập gpa : ");
				hocSinh.setGpa(Double.parseDouble(sc.nextLine()));
				kiemTraDiem(hocSinh.getGpa());
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.print("Nhập address : ");
		hocSinh.setAddress(sc.nextLine());
		listHS.add(hocSinh);
	}

	// kiểm tra id có bị trùng hay không
	public static void kiemTraMa(int id) throws Exception {
		for (int i = 0; i < listHS.size(); i++) {
			if (listHS.get(i).getId() == id) {
				throw new Exception("Id trùng...yêu cầu nhập lại");
			}
		}
	}

	// kiểm tra nhập tên có bị rỗng hay không
	public static void kiemTraTen(String name) throws Exception {
		for (int i = 0; i < name.length(); i++) {
			char kiTu = name.charAt(i);
			if (Character.isLetter(kiTu) || Character.isWhitespace(kiTu) || name.equals("")) {
				throw new Exception("Tên nhập lỗi...yêu cầu nhập lại");
			}
		}

	}

	// kiểm tra điểm
	public static void kiemTraDiem(double gpa) throws Exception{
		if (gpa > 10 || gpa < 0) {
			throw new Exception("Điểm nhập lỗi...yêu cầu nhập lại");
		}
	}

	// kiểm tra tuổi
	public static void kiemTraTuoi(int age) throws Exception{
		if (age > 100 || age < 0) {
			throw new Exception("Tuổi nhập lỗi...yêu cầu nhập lại");
		}
	}
	// hiển thị sinh viên
	public static void hienThiSinhVien() {
		for (int j = 0; j < listHS.size(); j++) {
			// System.out.println(a[j].toString());
			listHS.get(j).xuat();
		}
	}
	// cập nhật sinh viên
	public static void capNhat() {
		int xet = 0;
		System.out.println("Nhập id học sinh cần cập nhật");
		int nhapId = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < listHS.size(); i++) {

			if (listHS.get(i).getId() == nhapId) {

				HocSinh hocSinh = new HocSinh();
				hocSinh.setId(nhapId);
				while (true) {
					try {
						System.out.print("Nhập id : ");
						hocSinh.setId(Integer.parseInt(sc.nextLine()));
						kiemTraMa(hocSinh.getId());
						break;
					} catch (NumberFormatException e) {
						System.out.println("id rỗng");
					} catch (Exception ex) {
						System.out.println(ex.getMessage());
					}
				}
				while (true) {
					try {
						System.out.print("Nhập name : ");
						hocSinh.setName(sc.nextLine());
						kiemTraTen(hocSinh.getName());
						break;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
				while (true) {
					try {
						System.out.print("Nhập age : ");
						hocSinh.setAge(Integer.parseInt(sc.nextLine()));
						kiemTraTuoi(hocSinh.getAge());
						break;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
				while (true) {
					try {
						System.out.print("Nhập gpa : ");
						hocSinh.setGpa(Double.parseDouble(sc.nextLine()));
						kiemTraDiem(hocSinh.getGpa());
						break;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
				System.out.print("Nhập address : ");
				hocSinh.setAddress(sc.nextLine());
				listHS.set(i, hocSinh);
				xet = -1;
			}

		}
		if (xet == 0) {
			System.out.println("Không có id học sinh cần tìm");
		}
	}
	// xóa sinh viên theo id
	public static void xoaSinhVien() {
		System.out.println("nhập id học sinh");
		int nhapId = Integer.parseInt(sc.nextLine());
		int c = 0, i;
		for (i = 0; i < size; i++) {
			if (listHS.get(i).getId() != nhapId) {
				listHS.remove(i);
			}
		}
	}

}
