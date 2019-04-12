package controller;

import model.Database;
import model.bean.Person;

import view.ManagerPersonView;


public class ManagerPersonController {

	private ManagerPersonView managerPersonView;
	private Database database;

	public ManagerPersonController() {
		managerPersonView = new ManagerPersonView();
		database = new Database();
	}

	public void loadProgram() {
		String lastName;
		int choose;
		Person person;
		while (true) {
			choose = managerPersonView.menuView();
			switch (choose) {
			case 1:
				person = managerPersonView.inputPerson();
				database.add(person);
				break;
			case 2:
				database.disPlayPerson();
				break;
			case 3:
				database.displayRandom();
				break;
			case 4:
				database.SortByLastNameDecrease();
				break;
			case 5:
				lastName = managerPersonView.inputLastName();
				database.deletePerson(lastName);
				break;
			case 0:
				System.exit(0);
				break;
			}
		}
	}
}

