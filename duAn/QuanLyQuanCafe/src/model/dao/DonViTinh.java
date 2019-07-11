package model.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.DonViTinhTable;
import model.bean.LoaiBangGiaCoffee;

public interface DonViTinh {
	public boolean addTableDonViTinh(DonViTinhTable donViTinhTable) throws SQLException; 
	public ArrayList<DonViTinhTable> getListTable()throws SQLException;
	public void  editTableDonViTinh(DonViTinhTable donViTinhTable )throws SQLException;
	public void deleteTableDonViTinh(DonViTinhTable donViTinhTable)throws SQLException;
	
}
