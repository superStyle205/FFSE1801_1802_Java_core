package Lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static ArrayList<Student> arr = new ArrayList<Student>();
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {

		x("/****************************************/");
		x("1. Add Student.");
		x("2. Update Student");
		x("3. Delete Student ");
		x("4. scrt Students");
		x("5. Show infomation Student");
		x("0. End.");
		x("/****************************************/");

		arr.add(new Student(1, "long", 18, "abc", 8));
		arr.add(new Student(4, "long", 18, "abc", 8));
		arr.add(new Student(5, "long", 18, "abc", 8));
		arr.add(new Student(6, "long", 18, "abc", 8));
		arr.add(new Student(2, "long", 18, "abc", 8));
		arr.add(new Student(3, "long", 18, "abc", 8));

		while (true) {
			x("Lựa chọn của bạn[0-5]");
			int choise = Integer.parseInt(sc.nextLine());

			switch (choise) {
			case 1:
				addStudent();
				break;
			case 2:
				editStudent();
				break;
			case 3:
				deleteStudent();
				break;
			case 4:
				scrtStudent();
				break;
			case 5:
				infoStudent();
				break;
			case 0:
			default:
				System.exit(0);
				break;
			}
		}

	}

	// 1. Thêm sinh viên
	public static void addStudent() throws Exception {
		Student sv = new Student();

		try {

			x("ID : ");
			int ID = Integer.parseInt(sc.nextLine());
			sv.setID(ID);
			kiemTraId(sv.getID());

			x("Name : ");
			sv.setName(sc.nextLine());

			kiemTra(sv);

			x("Age : ");
			sv.setAge(Integer.parseInt(sc.nextLine()));

			kiemTra(sv);

			x("Address : ");
			sv.setAddress(sc.nextLine());

			x("Gpa : ");
			sv.setGpa(Integer.parseInt(sc.nextLine()));
			kiemTra(sv);

			arr.add(sv);
		} catch (NumberFormatException e) {

			System.out.println("Id rỗng");

		} catch (Exception e) {
			System.out.println("Lỗi " + e);
		}

	}

	// Xử lý ngoại lệ nè nè nè nè nè nè nè nè nè nè nè!!!

	public static void kiemTraId(int id) throws Exception {
		// Xử lý id rỗng và trùng

		int xet = 0;

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getID() == id) {
				xet = 1;
			}
		}

		if (xet == 1) {

			throw new Exception("ID đã bị trùng");

		}

	}

	public static void kiemTra(Student sv) throws Exception {

		// Xử lý tên rỗng
		if (sv.getName().equals("")) {

			throw new NullPointerException("Tên không được phép rỗng");

		}

		// Xử lý tuổi
		if (sv.getAge() < 0 || sv.getAge() > 100) {

			throw new Exception("Tuổi chỉ được trong khoảng 0 - 100");

		}

		// Xử lý điểm
		if (sv.getGpa() < 0 || sv.getGpa() > 10) {
			throw new Exception("Điểm chỉ được trong khoảng 0 - 10");
		}
	}
	// Kết thúc xử lý nè nè nè nè nè nè nè nè nè nè nè!!!

	/// 2. Sửa sinh viên
	public static void editStudent() throws Exception {
		if (arr.size() != 0) {

			System.out.println("Nhập id cần cập nhật");
			int idCheck = Integer.parseInt(sc.nextLine());
			boolean status = true;

			for (int i = 0; i < arr.size(); i++) {
				if (arr.get(i).getID() == idCheck) {

					Student svcn = new Student();

					try {
						svcn.setID(idCheck);

						x("New name");
						svcn.setName(sc.nextLine());
						kiemTra(svcn);

						x("New Age : ");
						svcn.setAge(Integer.parseInt(sc.nextLine()));
						kiemTra(svcn);

						x("New Address : ");
						svcn.setAddress(sc.nextLine());

						x("New Gpa : ");
						svcn.setGpa(Integer.parseInt(sc.nextLine()));
						kiemTra(svcn);

					} catch (Exception e) {
						System.out.println("Lỗi " + e);
					}

					arr.set(i, svcn);

					status = false;
				}
			}
			if (status) {

				System.out.println("Không tìm thấy sinh viên");

			}

		} else {

			System.out.println("Danh sách trống");

		}
	}

	// 3. Xóa sinh viên
	public static void deleteStudent() {

		System.out.println("Nhập ID sinh viên cần xóa");

		int idCheck = sc.nextInt();

		boolean xet = false;

		for (int i = 0; i < arr.size(); i++) {

			if (arr.get(i).getID() == idCheck) {

				System.out.println(
						"Đã xóa sinh viên với id = " + arr.get(i).getID() + " với tên là " + arr.get(i).getName());

				arr.remove(i);
				xet = true;
				break;

			}
		}

		if (xet == false) {
			System.out.println("Không tìm thấy id cần xóa");
		}

	}

	// 4. Sắp xếp sinh viên theo ID

	public static void scrtStudent() {

		Collections.sort(arr, new Comparator<Student>() {

			public int compare(Student st1, Student st2) {

				if (st1.getID() < st2.getID()) {

					return -1;

				} else {

					if (st1.getID() == st2.getID()) {

						return 0;

					} else {

						return 1;

					}

				}

			}

		});
		System.out.println("Sắp xếp thành công!");

	}

	// 5. Xuất thông tin sinh viên

	public static void infoStudent() {

		if (arr.size() != 0) {

			for (int j = 0; j < arr.size(); j++) {
				System.out.println(arr.get(j).toString());
			}

		} else {

			x("Danh sách trống");

		}

	}

	public static void x(String chim) {
		System.out.println(chim);
	}
}
