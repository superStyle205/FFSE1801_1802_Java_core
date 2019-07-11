package model.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.bean.LoaiBangGiaCoffee;
import model.bean.User;

public interface UserDao {
	public User getUserByUserName(String UserName) throws SQLException;
	public boolean addUser(User user) throws SQLException; 
	public User getUserByUserNamePassword(String UserName, String Password) throws SQLException;
	public User EditPassword(String UserName, String PassWord) throws SQLException;
	public List<User> getStaff() throws SQLException;
}
