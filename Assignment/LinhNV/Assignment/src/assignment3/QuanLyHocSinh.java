package assignment3;

import java.util.Scanner;

public class QuanLyHocSinh{

	public static int size = 0;
	public static HocSinh a[] = new HocSinh[100];
	
	public static void main(String[] args) {
		while(true) {
			menu();
		}
	}
	
	public static void menu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(""
				+ "/****************************************/ \r\n" + 
				"1. Thêm học sinh. (+2 điểm) \r\n" + 
				"2. Cập nhật thông tin học sinh theo ID ( + 2 điểm) . \r\n" + 
				"3. Xóa học sinh theo ID ( + 2 điểm ). \r\n" + 
				"4. Sắp sếp học sinh theo tên ( + 2 điểm ). \r\n" + 
				"5. Hiển thị danh sách học sinh ( +2 điểm ). \r\n" + 
				"0. Kết thúc chương trình. \r\n" + 
				"/****************************************/");
		int n = scanner.nextInt();
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
			
			System.out.println("Nhập id");
			int id = new Scanner(System.in).nextInt();
			System.out.println("Nhập name");
			String name = new Scanner(System.in).nextLine();
			System.out.println("Nhập age");
			int age = new Scanner(System.in).nextInt();
			System.out.println("Nhập address");
			String address = new Scanner(System.in).nextLine();
			System.out.println("Nhập gpa");
			double gpa = new Scanner(System.in).nextDouble();
			a[size] = new HocSinh(id, name, age, address, gpa);
			size++;
	
	}
	public static void hienThiSinhVien() {
		for (int j = 0; j < size; j++) {
//			System.out.println(a[j].toString());
			a[j].xuat();
		}
	}
	public static void capNhat() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập id học sinh cần cập nhật");
		int nhapId = scanner.nextInt();
		for (int i = 0; i < size; i++) {
			if(a[i].getId() == nhapId) {
				System.out.println("Nhập tên mới");
				String ten = scanner.nextLine();
				a[i].setName(ten);
				System.out.println("Nhập age mới");
				int age = scanner.nextInt();
				a[i].setAge(age);
				System.out.println("Nhập address mới");
				String address = scanner.nextLine();
				a[i].setAddress(address);
				System.out.println("Nhập gpa mới");
				double gpa = scanner.nextDouble();
				a[i].setGpa(gpa);
			}else {
				System.out.println("Không có id học sinh cần tìm");
			}
		}
	}
	public static void xoaSinhVien() {
		System.out.println("nhập id học sinh");
		int nhapId = new Scanner(System.in).nextInt();
		int c = 0, i;
		for (i = 0; i < size; i++) {
			if(a[i].getId() != nhapId) {
				a[i] = a[i];
				c++;
			}
		}
		size = c;
	}

}
