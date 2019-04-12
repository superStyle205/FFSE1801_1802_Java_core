

import java.util.Scanner;
import java.awt.datatransfer.SystemFlavorMap;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentManager {
	private static int size = 0;
	private static Scanner sc = new Scanner(System.in);
	private static Student a[] = new Student[100];

	void add() {
		System.out.println("Moi ban id cho SV : ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("Moi ban nhap ten : ");
		String name = sc.nextLine();
		System.out.println("Moi ban nhap tuoi : ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println("Moi ban nhap dia chi : ");
		String adress = sc.nextLine();
		System.out.println("Moi ban nhap diem : ");
		double diemTB = Double.parseDouble(sc.nextLine());
		a[size++] = new Student(id, name, age, adress, diemTB);
	}

	void update() {
		System.out.println("Moi nhap id cho SV");
		int idCheck = sc.nextInt();
		int status = 0;
		for (int i = 0; i < size; i++) {
			if (a[i].getId() == idCheck) {
				System.out.println("Nhap ten moi");
				String name = sc.nextLine();
				System.out.println("Nhap tuoi moi");
				int age = sc.nextInt();
				System.out.println("Nhap dia chi moi");
				String adress = sc.nextLine();
				System.out.println("Nhap diem moi");
				double diemTB = sc.nextDouble();
				a[i].setName(name);
				status = 0;
			} else {
				status = -1;
			}
		}
		if (status == -1) {
			System.out.println("Ko co SV");
		}
	}

	void showList() {
		for (int i = 0; i < size; i++) {
			System.out.println(a[i].show());
		}
	}

	void sort() {
		Student tmp = a[0];
		Student tempNum;
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - 1 - i; j++) {
				if (a[j].getName().compareTo(a[j + 1].getName()) > 0) {
					tempNum = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tempNum;
				}
			}
		}
	}

	void removeNumber() {
		System.out.println("Moi nhap id cho SV");
		int idCheck = Integer.parseInt(sc.nextLine());
		int c = 0; 
		for (int i = 0; i < size; i++) {
			if (a[i].getId() != idCheck) {
				a[i]=a[i];
				c++;
			}
		}
		size = c;
	}
}
