package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.bean.DonViTinhTable;
import model.bean.LoaiBangGiaCoffee;
import model.bean.User;

public class UserDaoImpl implements UserDao {
	private User user;
	private LoaiBangGiaCoffee LoaiBangGiaCoffee;

	@Override
	public User getUserByUserName(String UserName) throws SQLException {
		String sql = "select * from nhanvien where taiKhoan = ?";
		user = null;
		ConnectUtil connectUtil = new ConnectUtil();
		Connection connection = connectUtil.connect();
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, UserName);
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				user = new User();
				user.setUserName(resultSet.getString("taiKhoan"));
				user.setPassWord(resultSet.getString("matKhau"));
				user.setHoVaTen(resultSet.getString("hoVaTen"));
				user.setDiaChi(resultSet.getString("diaChi"));
				user.setDienThoai(resultSet.getString("dienThoai"));
				user.setMaBP(resultSet.getString("maBP"));
				user.setMaSoThue(resultSet.getString("maSoThue"));
				user.setMaNV(resultSet.getString("maNV"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public boolean addUser(User user) throws SQLException {
		String sql = "INSERT INTO nhanvien(`MaNV`, `MaBP`, `HovaTen`, `DiaChi`, `DienThoai`, `UserName`,"
				+ " `PassWord`, `MaSoThue`) VALUE ('nv_1', ?, ?, ?, ?, ?, ?, ?) ";
		ConnectUtil connectUtil = new ConnectUtil();
		Connection connection = connectUtil.connect();
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, user.getMaBP());
			statement.setString(2, user.getHoVaTen());
			statement.setString(3, user.getDiaChi());
			statement.setString(4, user.getDienThoai());
			statement.setString(5, user.getUserName());
			statement.setString(6, user.getPassWord());
			statement.setString(7, user.getMaSoThue());
			statement.executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public User getUserByUserNamePassword(String UserName, String Password) throws SQLException {
		String sql = "select * from nhanvien where taiKhoan = ? and matKhau =?";
		User user = null;
		ConnectUtil connectUtil = new ConnectUtil();
		Connection connection = connectUtil.connect();
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, UserName);
			statement.setString(2, Password);
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				user = new User();
				user.setUserName(resultSet.getString("taiKhoan"));
				user.setPassWord(resultSet.getString("matKhau"));
				user.setHoVaTen(resultSet.getString("hoVaTen"));
				user.setDiaChi(resultSet.getString("diaChi"));
				user.setDienThoai(resultSet.getString("dienThoai"));
				user.setMaBP(resultSet.getString("maBP"));
				user.setMaSoThue(resultSet.getString("maSoThue"));
				user.setMaNV(resultSet.getString("maNV"));
				return user;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public User EditPassword(String UserName, String PassWord) throws SQLException {

		String sql = " UPDATE nhanvien SET PassWord = ? WHERE UserName = ? ";
		User user = null;
		ConnectUtil connectUtil = new ConnectUtil();
		Connection connection = connectUtil.connect();
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, PassWord);
			statement.setString(2, UserName);

			statement.executeUpdate();
			return user;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			connectUtil.disConnect(connection);
		}
		return null;
	}

	@Override
	public List<User> getStaff() throws SQLException {
		ArrayList<User> listStaff = new ArrayList<>();
		String sql = "SELECT * FROM `nhanvien`";
		ConnectUtil connectUtil = new ConnectUtil();
		Connection connection = connectUtil.connect();
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();

			User user;
			while (resultSet.next()) {
				user = new User();
				user.setMaNV(resultSet.getString("maNV"));
				user.setHoVaTen(resultSet.getString("HoVaTen"));
				user.setIsThuNgan(resultSet.getInt("IsThuNgan"));
				user.setIsKeToan(resultSet.getInt("IsKeToan"));
				user.setUserName(resultSet.getString("taiKhoan"));
				user.setPassWord(resultSet.getString("matKhau"));
				user.setDienThoai(resultSet.getString("dienThoai"));
				user.setDiaChi(resultSet.getString("diaChi"));
				user.setMaSoThue(resultSet.getString("maSoThue"));
				user.setMaBP(resultSet.getString("MaBP"));
				listStaff.add(user);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectUtil.disConnect(connection);
		}
		return listStaff;

	}

}
