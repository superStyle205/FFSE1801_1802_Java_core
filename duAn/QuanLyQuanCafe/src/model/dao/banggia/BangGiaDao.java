package model.dao.banggia;

import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.LoaiBangGiaCoffee;

public interface BangGiaDao {
	public boolean addLoaiBangGia(LoaiBangGiaCoffee loaiBangGiaCoffee) throws SQLException; 
	public ArrayList<LoaiBangGiaCoffee> getListTable()throws SQLException;
	public void  editDataTable(LoaiBangGiaCoffee loaiBangGiaCoffee)throws SQLException;
	public void deleteDataTable(LoaiBangGiaCoffee loaiBangGiaCoffee)throws SQLException;
	
}
