package example.view;

import java.util.List;
import java.util.Scanner;

import example.model.bean.User;

public class UserView {
	public static final int MENU_VIEW_ALL_USER = 1;
	public static final int MENU_VIEW_USER = 2;
	public static final int MENU_VIEW_ADD_USER = 3;
	public static final int MENU_VIEW_EDIT_USER = 4;
	public static final int MENU_VIEW_DELETE_USER = 5;
	public static final int MENU_EXIT = 6;
	
	Scanner scanner = new Scanner(System.in);
	public void displayAllUser(List<User> users) {
		if (users.isEmpty()) {
			System.out.println("User Khong co trong danh sach !!!");
		} else {
			for (User user : users) {
				System.out.printf("%-3d %-7s %-10s %-30s%n",user.getId(),user.getUsername(),user.getPassword(),user.getEmail());
			}
		}
	}
	
	public void displayUser(User user) {
		if (user != null) {
			System.out.printf("%-3d %-7s %-10s %-30s%n",user.getId(),user.getUsername(),user.getPassword(),user.getEmail());
		} else {
			System.out.println("User null");
		}
	}
	
	public User addUser() {
		User user = new User();
		System.out.println("Input username : ");
		user.setUsername(scanner.nextLine());
		
		System.out.println("Input password :");
		user.setPassword(scanner.nextLine());
		
		System.out.println("Input email :");
		user.setEmail(scanner.nextLine());
		return user;
	}
	
	public int inputId() {
		System.out.println("Nhap id : ");
		return Integer.parseInt(scanner.nextLine());
	}

	public String inputUsername() {
		System.out.println("Nhap username : ");
		return scanner.nextLine();
	}
	
	public int menu() {
		System.out.println("~~~~~~~~~~~~~~~~ MENU ~~~~~~~~~~~~~~~");
		System.out.println(MENU_VIEW_ALL_USER + ". Hien thi tat ca User");
		System.out.println(MENU_VIEW_USER + ". Hien thi User theo id");
		System.out.println(MENU_VIEW_ADD_USER + ". Them User");
		System.out.println(MENU_VIEW_EDIT_USER + ". Sua User");
		System.out.println(MENU_VIEW_DELETE_USER + ". Xoa User");
		System.out.println(MENU_EXIT + ". Thoat chuong trinh");
		System.out.println("=======================================");
		return Integer.parseInt(scanner.nextLine());
	}
	
	public User viewLogin() {
		User user = new User();
		System.out.println("Nhap username : ");
		user.setUsername(scanner.nextLine());
		System.out.println("Nhap password : ");
		user.setPassword(scanner.nextLine());
		return user;
	}
}