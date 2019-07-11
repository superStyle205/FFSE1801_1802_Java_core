package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.DonViTinhTable;

public class DonViTinhImpl implements DonViTinh{

	public boolean addTableDonViTinh(DonViTinhTable donViTinhTable) throws SQLException {
		String sql = "INSERT INTO `donvitinh`(`maDVT`, `macDinh`) VALUES (?, ?)";
		ConnectUtil connectUtil = new ConnectUtil();
		Connection connection = connectUtil.connect();
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, donViTinhTable.getIdDVT());
			statement.setString(2, donViTinhTable.getMacDinh());
			statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connectUtil.disConnect(connection);
		}
			return false;
		}

	@Override
	public ArrayList<DonViTinhTable> getListTable() throws SQLException {
		ArrayList<DonViTinhTable> listdonViTinh = new ArrayList<>();
		String sql = "SELECT * FROM `donvitinh`";
		ConnectUtil connectUtil = new ConnectUtil();
		Connection connection = connectUtil.connect();
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			
			DonViTinhTable donViTinhTable;
			while (resultSet.next()) {
				donViTinhTable = new DonViTinhTable();
				donViTinhTable.setIdDVT(resultSet.getString("maDVT"));
				donViTinhTable.setMacDinh(resultSet.getString("macDinh"));
				
				listdonViTinh.add(donViTinhTable);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connectUtil.disConnect(connection);
		}
		return listdonViTinh;
	}

	@Override
	public void editTableDonViTinh(DonViTinhTable donViTinhTable) throws SQLException {
	String sql = "UPDATE `donvitinh` SET `maDVT`= ?, WHERE macDinh`= ? ";
		ConnectUtil connectUtil = new ConnectUtil();
		Connection connection = connectUtil.connect();
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, donViTinhTable.getIdDVT());
			
			statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connectUtil.disConnect(connection);
		}
	}

	@Override
	public void deleteTableDonViTinh(DonViTinhTable donViTinhTable) throws SQLException {
		String sql = "DELETE FROM `donvitinh` WHERE `maDVT`= ?";
		ConnectUtil connectUtil = new ConnectUtil();
		Connection connection = connectUtil.connect();
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, donViTinhTable.getIdDVT());
			
			statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectUtil.disConnect(connection);
		}
	}


}
