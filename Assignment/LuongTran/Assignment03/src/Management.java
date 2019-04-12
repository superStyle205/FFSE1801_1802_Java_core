package StudentManagement;
import java.util.Scanner;
public class Management {
//	public void menu() {

//	}
	
	private Student[] studentArray;
	private static final int MAX_LENGTH = 100;
	private int size;
	private Scanner scanner;
	
	public Management() {
		studentArray = new Student[MAX_LENGTH];
		scanner = new Scanner(System.in);
	}
	
	public void addStudent() {
		if(size == MAX_LENGTH) {
			System.out.println("xin lỗi bạn đã nhập quá số lượng sinh viên qui định!");
			return;
		}
		Student student = new Student();
		System.out.println("Nhập Id: ");
		student.setId(Integer.parseInt(scanner.nextLine()));
		System.out.println("nhập tên: ");
		student.setName(scanner.nextLine());
		System.out.println("nhập tuổi: ");
		student.setAge(Integer.parseInt(scanner.nextLine()));
		System.out.println("nhập điểm trung bình: ");
		student.setGpa(Double.parseDouble(scanner.nextLine()));
		studentArray[size] = student;
		size++;
	}
	
	public void updateStudent(int id) {
		Student student = findStudentByid(id);
		if(student != null) {
			System.out.println("Nhập Id: ");
			student.setId(Integer.parseInt(scanner.nextLine()));
			System.out.println("nhập tên: ");
			student.setName(scanner.nextLine());
			System.out.println("nhập tuổi: ");
			student.setAge(Integer.parseInt(scanner.nextLine()));
			System.out.println("nhập điểm trung bình: ");
			student.setGpa(Double.parseDouble(scanner.nextLine()));
		} else {
			System.out.println("~~ it not found!");
		}
	}
	
	public void deleteStudent(int id) {
		if(findStudentByid(id) != null) {
			if(studentArray[size - 1].getId() == id) {
				studentArray[size - 1] = null;
				size--;
			} else {
				for(int i = 0; i < size -1; i++) {
					if(studentArray[i].getId() == id) {
						for(int j = i; j < size - 1; j++) {
							studentArray[j] = studentArray[j+1];
						}
						studentArray[size-1] = null;
						size--;
					}
				}
			}
			
		} else {
			System.out.println("it not found!");
		}
	}
	
	public void sortingIncrease() {
		Student studentTmp;
		for(int i = 0; i < size -1; i++) {
			for(int j = i+1; j < size - 1; j++) {
				if(studentArray[i].getName().compareTo(studentArray[j].getName()) < 0) {
					studentTmp = studentArray[i];
					studentArray[i] = studentArray[j];
					studentArray[j] = studentTmp;
				}
			}
		}
	}
	
	public void sortingDecrease() {
		Student studentTmp;
		for(int i = 0; i < size -1; i++) {
			for(int j = i+1; j < size - 1; j++) {
				if(studentArray[i].getName().compareTo(studentArray[j].getName()) > 0) {
					studentTmp = studentArray[i];
					studentArray[i] = studentArray[j];
					studentArray[j] = studentTmp;
				}
			}
		}
	}
	
	public void showAllOfStudent() {
		if(size == 0) {
			System.out.println("list empty");

		} else {
			System.out.println("Id  Tên  Tuổi  ĐiểmTB");
			for(int i = 0; i < size; i++) {
				System.out.println(studentArray[i].getId() 
						+ "  "+studentArray[i].getName() 
						+ "  " + studentArray[i].getAge() 
						+ "  " + studentArray[i].getGpa());
			}
		}
	}
	
	public void showStudentById(int id) {
		Student student = findStudentByid(id);
		if(student != null) {
			System.out.println("Id  Tên  Tuổi  ĐiểmTB");
			System.out.println(student.getId() 
					+ "  "+student.getName() 
					+ "  " + student.getAge() 
					+ "  " + student.getGpa());
		} else {
			System.out.println("id not found!");
		}
	}
	
	public Student findStudentByid(int id) {
		for(int i = 0; i < size; i++) {
			if(studentArray[i].getId() == id) {
				return studentArray[i];
			}
		}
		return null;
	}
	
	public void menu() {
		String option;
		while(true) {
			System.out.println("===========================================");
			System.out.println(" 1. Thêm sinh viên");
			System.out.println(" 2. Cập nhật thông tin sinh viên theo ID");
			System.out.println(" 3. Xóa sinh viên theo ID");
			System.out.println(" 4. Sắp sếp sinh viên theo tên");
			System.out.println(" 5. Hiển thị danh sách sinh viên");
			System.out.println(" 0. Kết thúc chương trình");
			System.out.println("============================================");
			
			option = scanner.nextLine();
			
			switch(option) {
			case "1":
				addStudent();
				break;
			case "2":
				System.out.println("vui lòng nhập id sinh viên cần cập nhập: ");
				updateStudent(Integer.parseInt(scanner.nextLine()));
				break;
			case "3":
				System.out.println("vui lòng nhập id sinh viên cần xóa: ");
				deleteStudent(Integer.parseInt(scanner.nextLine()));
				break;
			case "4":
				System.out.println("vui lòng chọn 1 để sắp xếp theo Alpha Beta, chọn 2 để sắp ngược lại: ");
				if(scanner.nextLine() == "1") {
					sortingIncrease();
					break;
				} else {
					if(scanner.nextLine() == "2") {
						sortingDecrease();
						break;
					} else {
						System.out.println("chỉ được chọn 1 hoặc 2");
						break;
					}
				}
			case "5":
				showAllOfStudent();
				break;
			case "0":
				scanner.close();
				System.exit(0);
				break;
			default:
				System.out.println("không tồn tại menu!");
			}
		}
	}
}
