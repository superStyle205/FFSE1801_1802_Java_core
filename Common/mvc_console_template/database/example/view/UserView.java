package database.example.view;

import java.util.List;
import java.util.Scanner;

import database.example.model.bean.User;

public class UserView {
	public static final int MENU_VIEW_ALL_USER = 1;
	public static final int MENU_VIEW_USER = 2;
	public static final int MENU_ADD_USER = 3;
	public static final int MENU_EDIT_USER = 4;
	public static final int MENU_DELETE_USER = 5;
	public static final int MENU_EXIT = 0;

	private Scanner scanner = new Scanner(System.in);

	public void displayAllUser(List<User> listUser) {
		if (listUser.isEmpty()) {
			System.out.println("~~ danh sach user trong ~~");
		} else {
			for (User user : listUser) {
				System.out.printf("%-3d %-7s %-10s %-30s%n", user.getId(), user.getUsername(), user.getPassword(),
						user.getEmail());
			}
		}
	}

	public void displayUser(User user) {
		if (user != null) {
			System.out.printf("%-3d %-7s %-10s %-30s%n", user.getId(), user.getUsername(), user.getPassword(),
					user.getEmail());
		} else {
			System.out.println("~~ user dang null ~~");
		}
	}

	public User displayAddUser() {
		User user = new User();
		System.out.print("Nhap username");
		user.setUsername(scanner.nextLine());

		System.out.print("Nhap password");
		user.setPassword(scanner.nextLine());

		System.out.print("Nhap email");
		user.setEmail(scanner.nextLine());

		return user;
	}

	public String viewInputUsername() {
		System.out.println("Nhap username : ");
		return scanner.nextLine();
	}
	public int displayMenu() {
		System.out.println(MENU_VIEW_ALL_USER + ". hien thi tat ca user");
		System.out.println(MENU_VIEW_USER + ". hien thi user voi id tuong ung");
		System.out.println(MENU_ADD_USER + ". them moi 1 user");
		System.out.println("....");
		System.out.println("....");
		System.out.print("moi chon menu : ");
		return Integer.parseInt(scanner.nextLine());
	}
}
