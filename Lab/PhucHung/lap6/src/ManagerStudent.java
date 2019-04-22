import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ManagerStudent {
	private ArrayList<Student> students;
	private Scanner sc;

	public ManagerStudent() {
		students = new ArrayList<Student>();
		sc = new Scanner(System.in);
	}

	public void add(Student student) throws Exception {
		students.add(student);
	}

	public void disPlay() {
		for (Student student : students) {
			System.out.println("List SV :");
			student.show();
		}
	}

	public void checkId(int id) throws Exception {
		int check = 0;
		for (Student student : students) {
			if (student.getId() == id) {
				check = 1;
			}
			else if (check == 1) {
				throw new Exception("Id bi trung , nhap lai de !!! ");
			}
		}

	}

	public void checkAll(Student student) throws Exception {
		if (student.getName().equals("")) {
			throw new Exception("Ten khong dc rong, nhập lại đê !!!");
		}
		if (student.getAge() < 0 || student.getAge() > 100) {
			throw new Exception("Tuổi chỉ lấy số nguyên từ 0 đên 100, nhập lại đê !!!");
		}
		if (student.getDiemTB() < 0.0 || student.getDiemTB() > 10.0) {
			throw new Exception("Diem trong khoan tu 0 den 10, nhập lại đê !!!");
		}
	}

	public void deleteStudent(int id) {
		int position = findId(id);
		if (position == -1) {
			System.out.println("LastName not found !!!");
		} else {
			students.remove(position);
		}
	}

	public void editStudent(int id) {
		int position = findId(id);
		if (position == -1) {
			System.out.println("Ma bac sy ko tim thay !!!");
		} else {
			for (Student student : students) {
				try {
					System.out.println("Moi ban id cho SV : ");
					student.setId(Integer.parseInt(sc.nextLine()));
					checkId(student.getId());
					System.out.println("Moi ban nhap ten : ");
					student.setName(sc.nextLine());
					checkAll(student);
					System.out.println("Moi ban nhap tuoi : ");
					student.setAge(Integer.parseInt(sc.nextLine()));
					checkAll(student);
					System.out.println("Moi ban nhap dia chi : ");
					student.setAdress(sc.nextLine());
					System.out.println("Moi ban nhap diem : ");
					student.setDiemTB(Double.parseDouble(sc.nextLine()));
					checkAll(student);
				} catch (Exception e) {
					System.out.println("Fault" + e);
				}
			}
		}
	}

	public int findId(int id) {
		for (Student student : students) {
			if (student.getId() == id) {
				System.out.println("tim thay id : ");
				return id;
			}
		}
		return -1;
	}

	public Student input() {
		Student student = new Student();
		try {
			System.out.println("Moi ban  nhap id cho SV : ");
			student.setId(Integer.parseInt(sc.nextLine()));
			checkId(student.getId());
			System.out.println("Moi ban nhap ten : ");
			student.setName(sc.nextLine());
			checkAll(student);
			System.out.println("Moi ban nhap tuoi : ");
			student.setAge(Integer.parseInt(sc.nextLine()));
			checkAll(student);
			System.out.println("Moi ban nhap dia chi : ");
			student.setAdress(sc.nextLine());
			System.out.println("Moi ban nhap diem : ");
			student.setDiemTB(Double.parseDouble(sc.nextLine()));
			checkAll(student);
		} catch (NumberFormatException e) {
			System.out.println("Nhap so ko dc nhap chu va khong duoc de trong, nhap lai de !!");
		} catch (Exception e) {
			System.out.println("Fault" + e);
		}
		return student;
	}

	public void sort() {
		Collections.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
	}

	public int inputId() {
		System.out.print("Input id : ");
		return Integer.parseInt(sc.nextLine());
	}

	public void menu() throws Exception {
		int chooseMenu;
		int id;
		while (true) {
			System.out.println("1.ADD SV");
			System.out.println("2.UPDATE SV");
			System.out.println("3.DELETE SV");
			System.out.println("4.ARANGE SV");
			System.out.println("5.SHOW LIST SV:");
			System.out.println("0. EXIT");
			chooseMenu = Integer.parseInt(sc.nextLine());
			switch (chooseMenu) {
			case 1:
				Student student = input();
				add(student);
				break;
			case 2:
				id = inputId();
				editStudent(id);
				break;
			case 3:
				id = inputId();
				deleteStudent(id);
				break;
			case 4:
				sort();
				break;
			case 5:
				disPlay();
				break;
			case 6:
				System.out.println("tam biet");
				System.exit(0);
				break;
			default:
				System.out.println("khong ton tai tinh nang nay");
				break;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		ManagerStudent managerStudent = new ManagerStudent();
		managerStudent.menu();
	}
}