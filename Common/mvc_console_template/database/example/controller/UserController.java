package database.example.controller;

import java.util.List;

import database.example.model.bean.User;
import database.example.model.dao.UserDao;
import database.example.view.UserView;

public class UserController {
	private UserView userView = new UserView();
	private UserDao userDao = new UserDao();

	public void loadProgram() {
		int menuChoose;
		while (true) {
			menuChoose = userView.displayMenu();
			switch (menuChoose) {
			case UserView.MENU_VIEW_ALL_USER:
				List<User> listUser = userDao.getAllUser();
				userView.displayAllUser(listUser);
				break;
			case UserView.MENU_VIEW_USER:
				String username = userView.viewInputUsername();
				User user = userDao.getUserByUsername(username);
				userView.displayUser(user);
				break;
			case UserView.MENU_EXIT:
				System.exit(0);
			default:
				break;
			}
		}
	}
}
