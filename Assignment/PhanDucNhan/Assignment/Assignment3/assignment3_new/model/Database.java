package model;

import model.bean.Student;

/**
 * Database contain object Student
 * 
 * @author Thang Tran
 */
public class Database {

	private static final int MAX_LENGTH = 100;

	private Student[] students;
	private int size;

	/**
	 * Constructor for objects of class Database
	 */
	public Database() {
		students = new Student[MAX_LENGTH];
	}

	public boolean add(Student student) {
		if (size == MAX_LENGTH) {
			return false;
		}

		students[size++] = student;
		return true;
	}

	public boolean update(Student student) {
		int position = getPosition(student.getId());

		if (position == -1) {
			return false;
		} else {
			students[position] = student;
			return true;
		}
	}

	public boolean delete(int id) {
		int position = getPosition(id);
		if (position == -1) {
			return false;
		} else if (position == (size - 1)) {
			students[--size] = null;
			return true;
		} else {
			for (int i = position; i < size - 1; i++) {
				students[i] = students[i + 1];
			}

			students[--size] = null;
			return true;
		}
	}

	public Student get(int id) {
		int position = getPosition(id);
		return position == -1 ? null : students[position];
	}

	public Student[] getAll() {
		Student[] studentArray = new Student[size];
		for (int i = 0; i < size; i++) {
			studentArray[i] = students[i];
		}
		return studentArray;
	}

	public void sortByName() {
		Student student = null;
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - 1 - i; j++) {
				if (students[j].getName().compareTo(students[j + 1].getName()) > 0) {
					student = students[j];
					students[j] = students[j + 1];
					students[j + 1] = student;
				}
			}
		}
	}

	private int getPosition(int id) {
		for (int i = 0; i < size; i++) {
			if (students[i].getId() == id) {
				return i;
			}
		}
		return -1;
	}

}
