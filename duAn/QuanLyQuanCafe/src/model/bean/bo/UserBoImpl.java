package model.bean.bo;

import java.sql.SQLException;

import model.bean.User;
import model.dao.UserDao;
import model.dao.UserDaoImpl;

public class UserBoImpl implements UserBo{
	private UserDao userDao = new UserDaoImpl();
	@Override
	public void addNewAminAccount() throws SQLException {
		User user = new User();
		user.setUserName("admin");
		user.setPassWord("");
		userDao.addUser(user);
	}

	@Override
	public boolean isExisUser(String UserName) throws SQLException {
	
		return userDao.getUserByUserName(UserName) != null;
	}

	@Override
	public boolean isExisUser(String UserName, String Password) throws SQLException {
		return userDao.getUserByUserNamePassword(UserName, Password) != null;
	}

	@Override
	public boolean EditPassword(String UserName, String PassWord) throws SQLException {
		return userDao.EditPassword(UserName, PassWord) != null;
	}
}
