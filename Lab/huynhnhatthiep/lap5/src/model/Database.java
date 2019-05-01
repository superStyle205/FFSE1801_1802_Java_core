package model;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import model.bean.Person;

public class Database {
	private ArrayList<Person> persons;
	
	public Database() {
		persons = new ArrayList<Person>();
	}
	
	public void add(Person person) {
		persons.add(person);
	}
	
	public void disPlayPerson() {
		for (Person person : persons) {	
			person.xuat();
		}
	}
	
	public void displayRandom() {
		Collections.shuffle(persons);
		disPlayPerson();
	}
	
	public void SortByLastNameDecrease() {
		Collections.sort(persons, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getFirstName().compareTo(o2.getLastName());
			}
		});
	}
	
	public void deletePerson(String lastName) {
		int position = findName(lastName);
		if (position == -1) {
			System.out.println("LastName not found !!!");
		} else {
			persons.remove(position);
		}
	}
	
	public int findName(String lastName) {
		for (int i = 0; i < persons.size(); i++) {
			if (persons.get(i).getLastName().equals(lastName)) {
				System.out.println("tim thay ten : ");
				return i;
			}
		}
		return -1;
	}
}
