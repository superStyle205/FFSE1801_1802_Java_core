package view;

import java.util.Scanner;

import model.bean.Student;

/**
 * Impplement UI console for manager student program.
 * 
 * @author Thang Tran
 */
public class ManagerStudentView {

	private Scanner scan;

	public ManagerStudentView() {
		scan = new Scanner(System.in);
	}

	public Student inputStudent() {
		System.out.print("Input id : ");
		int id = Integer.parseInt(scan.nextLine());

		System.out.print("Input name : ");
		String name = scan.nextLine();

		System.out.print("Input age : ");
		int age = Integer.parseInt(scan.nextLine());

		System.out.print("Input address : ");
		String address = scan.nextLine();

		System.out.print("Input gpa : ");
		double gpa = Double.parseDouble(scan.nextLine());

		return new Student(id, name, age, address, gpa);
	}

	public int inputStudentId() {
		System.out.print("Input id : ");
		return Integer.parseInt(scan.nextLine());
	}

	public void studentView(Student student) {
		if (student == null) {
			System.out.println("~~~ Student not found");
			return;
		}

		System.out.println("- Id : " + student.getId());
		System.out.println("- Name : " + student.getName());
		System.out.println("- Age : " + student.getAge());
		System.out.println("- Address : " + student.getAddress());
		System.out.println("- Gpa : " + student.getGpa());
	}

	public void studentsView(Student[] students) {
		if (students.length == 0) {
			System.out.println("~~~ List student is empty");
			return;
		}

		System.out.println("List student : ");
		for (int i = 0; i < students.length; i++) {
			System.out.println("- Student " + (i + 1));
			System.out.println(" + Id : " + students[i].getId());
			System.out.println(" + Name : " + students[i].getName());
			System.out.println(" + Age : " + students[i].getAge());
			System.out.println(" + Address : " + students[i].getAddress());
			System.out.println(" + Gpa : " + students[i].getGpa());
		}
	}

	public int menuView() {
		System.out.println("************** menu **************");
		System.out.println("1. View all student");
		System.out.println("2. Add student");
		System.out.println("3. Edit student");
		System.out.println("4. Delete student");
		System.out.println("5. View student");
		System.out.println("6. Sort student list");
		System.out.println("0. Exit");
		System.out.println("**********************************");
		System.out.print("Choose menu : ");
		return Integer.parseInt(scan.nextLine());
	}

	public void messenger(String mess) {
		System.out.println("~~~ " + mess);
	}
}
