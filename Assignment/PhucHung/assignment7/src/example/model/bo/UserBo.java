package example.model.bo;

import example.model.bean.User;
import example.model.dao.UserDao;

public class UserBo {
	public boolean isExistUser(String username, String password) {
		UserDao userDao = new UserDao();
		User user = userDao.getUserByUsernamePassword(username, password);
		return user != null ? true : false;
	}
}
