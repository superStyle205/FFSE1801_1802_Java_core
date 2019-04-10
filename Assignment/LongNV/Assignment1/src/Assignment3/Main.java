package Assignment3;
import java.util.Scanner;

public class Main {
	public static int size = 0;
	public static Student a[] = new Student[100];
	public static void main(String[] args) {
		
			boolean flag = true;
			Scanner sc = new Scanner(System.in);
			x("/****************************************/");
			x("1. Add Student.");
			x("2. Update Student");
			x("3. Delete Student ");
			x("4. Sort Students");
			x("5. Show infomation Student");
			x("0. End.");
			x("/****************************************/");

			do{
				x("Lựa chọn của bạn[0-5]");
				int choise = sc.nextInt();

				switch (choise) {
				case 1:addStudent();
				break;
				case 2:editStudent();
				break;
				case 3:deleteStudent();
				break;
//				case 4:sortStudent();
//				break;
				case 5:infoStudent();
				break;
				case 0:
				default:
					flag = false;
					break;
				}
			}while(flag == true);
		}
	

	//1. Thêm sinh viên
	public static void addStudent() {
		Scanner chu = new Scanner(System.in);
		Scanner so = new Scanner(System.in);
		boolean test = true;
		

		x("ID : ");
		int ID = so.nextInt();

		for (int i = 0; i < size; i++) {
			if(a[i].getID() == ID ) {
				test = false;
			}
		}
		
		if (test) {
			x("Name : ");
			String name = chu.nextLine();
			x("Age : ");
			int age = so.nextInt();
			x("Address : ");
			String address = chu.nextLine();
			x("Gpa : ");
			double gpa = so.nextDouble();


			a[size] = new Student(ID , name, age, address, gpa);
			size++;
		} else {
			System.out.println("ID trùng");
		}
		
	}

	///2. Sửa sinh viên
	public static void editStudent() {
		if (size != 0) {

			System.out.println("Nhập id cần cập nhật");
			int idCheck = new Scanner(System.in).nextInt();
			boolean status = true;


			for (int i = 0; i < size; i++) {
				if(a[i].getID() == idCheck) {
					System.out.println("Nhập tên mới");
					String ten = new Scanner(System.in).nextLine();
					a[i].setName(ten);
					
					System.out.println("Nhập tuổi mới");
					int tuoi = new Scanner(System.in).nextInt();
					a[i].setAge(tuoi);
					
					System.out.println("Nhập địa chỉ mới");
					String diaChi = new Scanner(System.in).nextLine();
					a[i].setAddress(diaChi);
					
					System.out.println("Nhập điểm trung bình mới");
					double gpa = new Scanner(System.in).nextDouble();
					a[i].setGpa(gpa);
					
					status = false;
				}
			}
			if(status) {
				System.out.println("Không tìm thấy sinh viên");
			}

		}else {
			System.out.println("Danh sách trống");
		}
	}

	//3. Xóa sinh viên
	public static void deleteStudent() {
		System.out.println("Nhập ID sinh viên cần xóa");
		int idCheck = new Scanner(System.in).nextInt();
		int sizee = 0;
		for (int i = 0; i < size; i++) {
			if(a[i].getID() != idCheck) {
				a[i] = a[i];
				sizee++;
			}
		}
		size = sizee;
	}

	//4. Sắp xếp sinh viên theo ID
	
	//5. Xuất thông tin sinh viên
	public static void infoStudent() {	
		if (size != 0) {
			for (int j = 0; j < size; j++) {
				System.out.println(a[j].showInfo());
			}
		}else {
			x("Danh sách trống");
		}

	}
	
	
	public static void x(String chim) {
		System.out.println(chim);
	}
}
