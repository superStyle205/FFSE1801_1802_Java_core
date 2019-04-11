package controller;

import model.Database;
import model.bean.Student;
import view.ManagerStudentView;

public class ManagerStudentController {

	private ManagerStudentView managerStudentView;
	private Database database;

	public ManagerStudentController() {
		managerStudentView = new ManagerStudentView();
		database = new Database();
	}

	public void loadProgram() {
		int choose;
		Student student;
		Student[] students;
		int id;
		while (true) {
			choose = managerStudentView.menuView();
			switch (choose) {
				case 1:
					students = database.getAll();
					managerStudentView.studentsView(students);
					break;
				case 2:
					student = managerStudentView.inputStudent();
					database.add(student);
					break;
				case 3:
					student = managerStudentView.inputStudent();
					database.update(student);
					break;
				case 4:
					id = managerStudentView.inputStudentId();
					database.delete(id);
					break;
				case 5:
					id = managerStudentView.inputStudentId();
					student = database.get(id);
					managerStudentView.studentView(student);
					break;
				case 6:
					database.sortByName();
					students = database.getAll();
					managerStudentView.studentsView(students);
					break;
				case 0:
					System.exit(0);
					break;
			}
		}
	}
}
