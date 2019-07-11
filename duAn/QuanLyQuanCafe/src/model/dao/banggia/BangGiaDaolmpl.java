package model.dao.banggia;

import java.io.BufferedWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.LoaiBangGiaCoffee;
import model.dao.ConnectUtil;

public class BangGiaDaolmpl implements BangGiaDao{
	@Override
	public boolean addLoaiBangGia(LoaiBangGiaCoffee loaiBangGiaCoffee) throws SQLException {
		String sql = "INSERT INTO `loaibanggia`(`MaBG`, `TenBG`, `MacDinh`) VALUES (?, ?, ?) ";
		ConnectUtil connectUtil = new ConnectUtil();
		Connection connection = connectUtil.connect();
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, loaiBangGiaCoffee.getId());
			statement.setString(2, loaiBangGiaCoffee.getTenBG());
			statement.setInt(3, loaiBangGiaCoffee.getMacDinh());
			statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connectUtil.disConnect(connection);
		}
		return false;
	}
	// add bang giá 

	public ArrayList<LoaiBangGiaCoffee> getListTable() throws SQLException{

		ArrayList<LoaiBangGiaCoffee> list = new ArrayList<>();
		String sql = "SELECT * FROM `loaibanggia`";

		ConnectUtil connectUtil = new ConnectUtil();
		Connection connection = connectUtil.connect();
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();

			LoaiBangGiaCoffee loaiBangGiaCoffee;
			while (resultSet.next()) {
				loaiBangGiaCoffee = new LoaiBangGiaCoffee();
				loaiBangGiaCoffee.setId(resultSet.getString("maBG"));
				loaiBangGiaCoffee.setTenBG(resultSet.getString("TenBG"));
				loaiBangGiaCoffee.setMacDinh(resultSet.getInt("MacDinh"));

				list.add(loaiBangGiaCoffee);
			}


		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connectUtil.disConnect(connection);
		}

		return list;

	}


	public void editDataTable(LoaiBangGiaCoffee loaiBangGiaCoffee) throws SQLException {
		String sql = "UPDATE loaibanggia SET TenBG = ?,MacDinh = ? WHERE MaBG = ?";
		ConnectUtil connectUtil = new ConnectUtil();
		Connection connection = connectUtil.connect();
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, loaiBangGiaCoffee.getTenBG());
			statement.setInt(2, loaiBangGiaCoffee.getMacDinh());
			statement.setString(3, loaiBangGiaCoffee.getId());
						
			
			statement.executeUpdate();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectUtil.disConnect(connection);
		}
	}

	public void deleteDataTable(LoaiBangGiaCoffee loaiBangGiaCoffee) throws SQLException {
		String sql = "DELETE FROM `loaibanggia` WHERE MaBG = ?";
		ConnectUtil connectUtil = new ConnectUtil();
		Connection connection = connectUtil.connect();
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, loaiBangGiaCoffee.getId());
			
			statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectUtil.disConnect(connection);
		}
	}
}
