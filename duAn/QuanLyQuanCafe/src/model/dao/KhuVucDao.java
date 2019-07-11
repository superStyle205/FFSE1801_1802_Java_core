package model.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.KhuVuc;

public interface KhuVucDao {

	public ArrayList<KhuVuc> getLisTable()throws SQLException;
	public boolean addTableKhuVuc(KhuVuc khuVuc)throws SQLException;
	public void editTableKhuVuc(KhuVuc khuVuc) throws SQLException;
	public void deleteDataTable (KhuVuc khuVuc) throws SQLException;
}
