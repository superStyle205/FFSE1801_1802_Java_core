package sinhVien.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import sinhVien.view.sinhVienView;

public class dataBase {
	private Connection conn = null;
	
	public Connection connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaLogin", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(conn != null) {
			return conn;
		}
		
		return conn;
	}
	
	public void disconect(Connection conn) {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public String login(String user, String pass) {
		String sql = "SELECT * FROM `student` where user = ? and pass = ?";
		
		dataBase database = new dataBase();
		Connection conn = database.connect();
		
		try {
			PreparedStatement r = conn.prepareStatement(sql);
			r.setString(1, user);
			r.setString(2, pass);
			
			ResultSet result = r.executeQuery();
			
			if(result.next()) {
				sinhVienView svw = new sinhVienView();
				svw.USER = user;
				return "Đăng nhập thành công";
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			database.disconect(conn);
		}
		
		return "Đăng nhâp thất bại";
	}
	
	public ArrayList<sinhVien> SINH_VIEN_GET_ALL(){
		ArrayList<sinhVien> sv = new ArrayList<>();
		String sql = "SELECT * FROM `student`";
		dataBase database = new dataBase();
		Connection conn = database.connect();

		try {
			PreparedStatement s = conn.prepareStatement(sql);
			ResultSet r = s.executeQuery();
			while(r.next()) {
				sv.add(new sinhVien(r.getInt("id"), r.getString("user"), r.getString("pass"), r.getString("name"), r.getString("email"), r.getString("adress")));
			}
			return sv;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			database.disconect(conn);
		}

		return sv;
	}

	public ArrayList<sinhVien> SINH_VIEN_GET(String user){
		ArrayList<sinhVien> sv = new ArrayList<>();
		String sql = "SELECT * FROM `student` WHERE user = ?";
		dataBase database = new dataBase();
		Connection conn = database.connect();

		try {
			PreparedStatement s = conn.prepareStatement(sql);
			s.setString(1, user);
			ResultSet r = s.executeQuery();
			while(r.next()) {
				sv.add(new sinhVien(r.getInt("id"), r.getString("user"), r.getString("pass"), r.getString("name"), r.getString("email"), r.getString("adress")));
			}
			return sv;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			database.disconect(conn);
		}

		return sv;
	}

	public String SINH_VIEN_ADD(sinhVien sv) {
		if(SINH_VIEN_GET(sv.getUser()).isEmpty()){ // true là trống, false là có dữu liệu
			String sql = "INSERT INTO `student` (id, user, pass, name, email, adress) VALUES (NULL, ?, ?, ?, ?, ?)";
			dataBase database = new dataBase();
			Connection conn = database.connect();
			try {
				PreparedStatement s = conn.prepareStatement(sql);
				s.setString(1, sv.getUser());
				s.setString(2, sv.getPass());
				s.setString(3, sv.getName());
				s.setString(4, sv.getEmail());
				s.setString(5, sv.getAdress());

				int result = s.executeUpdate();
				if(result > 0) {
					return "Bạn thêm thành công";
				}
				
			} catch (Exception e) {
				e.printStackTrace();
				return "Lỗi database";
			} finally {
				database.disconect(conn);
			}
			return "Thêm thất bại";
		}else {
			return "User đã tồn tại";
		}
	}
	
	public String SINH_VIEN_UPDATE(String user, int colum, String value) {
		
		String co = "";
		if(colum == 1) {
			co = "pass";
		}else if (colum == 2) {
			co = "name";
		}else if (colum == 3) {
			co = "email";
		}else if (colum == 4) {
			co = "adress";
		}else {
			return "Dữ liêu cần sữa không tồn tại";
		}
		
		if(SINH_VIEN_GET(user).isEmpty()) {
			return "User không tồn tại";
		}else{
			String sql = "UPDATE `student` SET `" + co + "` = ? WHERE `user` = ?";
			dataBase database = new dataBase();
			Connection conn = database.connect();
			
			try {
				PreparedStatement r = conn.prepareStatement(sql);
				r.setString(1, value);
				r.setString(2, user);
				
				int check = r.executeUpdate();
				if(check > 0) {
					return "Cập nhật thành công";
				}
				
			} catch (Exception e) {
				e.printStackTrace();
				return "Lỗi sql";
			} finally {
				database.disconect(conn);
			}
			return "Thêm thất bại";
		}
	}

	public String SINH_VIEN_DELETE(String user) {
		if(SINH_VIEN_GET(user).isEmpty()) {
			return "User không tồn tại";
		}else{
			String sql = "DELETE FROM `student` WHERE user = ?";
			dataBase database = new dataBase();
			Connection conn = database.connect();
			
			try {
				PreparedStatement r = conn.prepareStatement(sql);
				r.setString(1, user);
				
				int check = r.executeUpdate();
				if(check > 0) {
					return "Xóa thành công";
				}
				
			} catch (Exception e) {
				e.printStackTrace();
				return "Lỗi sql";
			} finally {
				database.disconect(conn);
			}
			return "Xóa thất bại";
		}
	}
	
}
