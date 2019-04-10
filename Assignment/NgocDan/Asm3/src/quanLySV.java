import java.util.Scanner;

public class quanLySV {
	public static String id;
	public static String name;
	public static int age;
	public static String address;
	public static double gpa;
	public static String[] sinhVien = new String[100];
	public static void menu() {
		System.out.println(
				"/*******************************************/\r\n" + 
				"1. Thêm sinh viên.\r\n" + 
				"2. Cập nhật thông tin sinh viên theo ID.\r\n" + 
				"3. Xóa sinh viên theo ID.\r\n" + 
				"4. Sắp sếp sinh viên theo tên.\r\n" + 
				"5. Hiển thị danh sách sinh viên.\r\n" + 
				"0. Kết thúc chương trình.\r\n" + 
				"/*******************************************/");
	}
	void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập ID:");
		id = sc.nextLine();
		System.out.println("Nhập tên sinh viên:");
		name = sc.nextLine();
		System.out.println("Nhập tuổi sinh viên:");
		age = sc.nextInt();
		System.out.println("Nhập địa chỉ sinh viên:");
		address = sc.nextLine();
		System.out.println("Nhập điểm trung bình:");
		gpa = sc.nextDouble();
	}
	public static void main(String[] args) {
		menu();
	}
}
