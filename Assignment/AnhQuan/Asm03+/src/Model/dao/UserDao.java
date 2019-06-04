package Model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
public void themSV(int id,String code,String first_name,String sex, String email) {
	String sql = "INSERT INTO lms_students(id, code , first_name, sex, email) VALUE (?,?,?,?,? )";
	ConnectUtil te1= new ConnectUtil();
	Connection con = te1.connect();
	PreparedStatement state;
	
	try {

		state = con.prepareStatement(sql);
		state.setInt(1, id);
		state.setString(2, code);
		state.setString(3, first_name);
		state.setString(4, sex);
		state.setString(5, email);
		
	int s = state.executeUpdate();
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		te1.disconect(con);
	}
}
public void updateSV(String code,String first_name,String sex, String email) {
	String sql = "UPDATE lms_students  SET first_name = ? , email = ? , sex = ? WHERE code = ?;";
	ConnectUtil te1= new ConnectUtil();
	Connection con = te1.connect();
	PreparedStatement state;
	
	try {

		state = con.prepareStatement(sql);
		state.setString(1, first_name);
		state.setString(2, email);
		state.setString(3, sex);
		state.setString(4, code);
		
	int s = state.executeUpdate();
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		te1.disconect(con);
	}
}
public void deleteSV(String code) {
	String sql = "DELETE FROM lms_students WHERE code =?";
	ConnectUtil te1= new ConnectUtil();
	Connection con = te1.connect();
	PreparedStatement state;
	
	try {

		state = con.prepareStatement(sql);
		state.setString(1, code);
	
		
	int s = state.executeUpdate();
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		te1.disconect(con);
	}
}
public void sortSV() {
	
}
public void showSV() {
	String sql = "SELECT id, code, first_name, sex, email FROM lms_students";
	ConnectUtil te1= new ConnectUtil();
	Connection con = te1.connect();
	PreparedStatement state;
	
	try {

		state = con.prepareStatement(sql);
	
		ResultSet rs= state.executeQuery();
		while(rs.next()) {
			
			System.out.println(rs.getInt(1)+"  "+ rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getInt(6));
			}
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		te1.disconect(con);
	}
}

}
