package example.controller;

import java.util.List;

import example.model.bean.User;
import example.model.bo.UserBo;
import example.model.dao.UserDao;
import example.view.UserView;

public class ControllerUser {
	private UserView userView = new UserView();
	private UserDao userDao = new UserDao(); 
	private UserBo userBo = new UserBo();
	
	public void loadProgram() {
		User user;
		while (true) {
			user = userView.viewLogin();
			if (userBo.isExistUser(user.getUsername(), user.getPassword())) {
				break;
			} else {
				System.out.println("Dang nhap that bai! Moi dang nhap lai");
			}
		}
		
		int chooseMenu;
		int id;
		while (true) {
			chooseMenu = userView.menu();
			switch (chooseMenu) {
			case UserView.MENU_VIEW_ALL_USER:
				List<User> users = userDao.getAllUser();
				userView.displayAllUser(users);
				break;
			case UserView.MENU_VIEW_USER:
				id = userView.inputId();
				user = userDao.getUserById(id);
				userView.displayUser(user);
				break;
			case UserView.MENU_VIEW_ADD_USER:
				User inputUser = userView.addUser();
				userDao.addUser(inputUser);
				break;
			case UserView.MENU_VIEW_EDIT_USER:
				id = userView.inputId();
				User editUser = userView.addUser();
				editUser.setId(id);
				userDao.editUser(editUser);
				break;
			case UserView.MENU_VIEW_DELETE_USER:
				id = userView.inputId();
				userDao.deleteUser(id);
				break;
			case UserView.MENU_EXIT:
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}
}