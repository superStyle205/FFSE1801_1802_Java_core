package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Stack;

import model.bean.KhuVuc;

public class KhuVucDaoImpl implements KhuVucDao {

	public ArrayList<KhuVuc> getLisTable() throws SQLException {
		ArrayList<KhuVuc> list = new ArrayList<>();
		String sql = "SELECT * FROM `khuvuc`";

		ConnectUtil connectUtil = new ConnectUtil();
		Connection connection = connectUtil.connect();
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();

			KhuVuc khuVuc;
			while (resultSet.next()) {
				khuVuc = new KhuVuc();
				khuVuc.setMaKhuVuc(resultSet.getString("maKV"));
				khuVuc.setTenKhuVuc(resultSet.getString("tenKV"));		
				list.add(khuVuc);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connectUtil.disConnect(connection);
		}
		return list;
	}
	//add khu vưc
	public boolean addTableKhuVuc(KhuVuc khuVuc) throws SQLException {
		String sql = "INSERT INTO `khuvuc`(`maKV`, `tenKV`) VALUES (?, ?)";
		ConnectUtil connectUtil = new ConnectUtil();
		Connection connection = connectUtil.connect();

		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, khuVuc.getMaKhuVuc());
			statement.setString(2, khuVuc.getTenKhuVuc());
			statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connectUtil.connect();
		}
		return false;
	}

	public void editTableKhuVuc(KhuVuc khuVuc) throws SQLException {
		String sql = "UPDATE khuvuc SET tenKV =? WHERE maKV = ?";
		ConnectUtil connectUtil = new ConnectUtil();
		Connection connection = connectUtil.connect();
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, khuVuc.getTenKhuVuc());
			statement.setString(2, khuVuc.getMaKhuVuc());
			statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connectUtil.disConnect(connection);
		}
	}

	public void deleteDataTable(KhuVuc khuVuc) throws SQLException {
		String sql = "DELETE FROM `khuvuc` WHERE maKV = ?";
		ConnectUtil connectUtil = new ConnectUtil();
		Connection connection = connectUtil.connect();
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, khuVuc.getMaKhuVuc());
			statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
