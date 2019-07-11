package model.bean.bo;

import java.sql.SQLException;

import model.bean.User;

public interface UserBo {
	public void addNewAminAccount() throws SQLException;
	public boolean isExisUser(String UserName) throws SQLException; 
	public boolean isExisUser(String UserName , String Password) throws SQLException; 
	public boolean EditPassword(String UserName, String PassWord) throws SQLException;
}
