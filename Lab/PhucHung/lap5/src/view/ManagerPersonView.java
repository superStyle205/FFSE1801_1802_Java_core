package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import model.bean.Person;

public class ManagerPersonView {
	private Scanner sc;

	public ManagerPersonView() {
		sc = new Scanner(System.in);
	}

	public Person inputPerson() {
		Person person = new Person();
		System.out.print("Input FirstName : ");
		person.setFirstName(sc.nextLine());

		System.out.print("Input LastName : ");
		person.setLastName(sc.nextLine());

		System.out.print("Input age : ");
		person.setAge(Integer.parseInt(sc.nextLine()));

		System.out.print("Input address : ");
		person.setAdress(sc.nextLine());

		return person;
	}
	public String inputLastName() {
		System.out.print("Input lastName : ");
		return sc.nextLine();
	}

	public int menuView() {
		System.out.println("************** menu **************");
		System.out.println("1. Add person");
		System.out.println("2. View all person");
		System.out.println("3. View all random person");
		System.out.println("4. Sort person list");
		System.out.println("5. Find anh delete person");
		System.out.println("0. Exit");
		System.out.println("**********************************");
		System.out.print("Choose menu : ");
		return Integer.parseInt(sc.nextLine());
	}
}
