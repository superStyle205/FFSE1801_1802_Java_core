package model.dao;

import java.security.KeyStore.TrustedCertificateEntry;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectUtil {
	public static Connection connect() throws SQLException {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?characterEncoding=UTF-8","root" ,"");
		} catch (Exception e) {
			throw new SQLException(e.getMessage());
		} 
		return connection;
	}
	public static void  disConnect(Connection connection) throws SQLException {
		if (connection != null) {
			try {
				connection.close();
			} catch (Exception e) {
				throw new SQLException(e.getMessage());
			}
		}
	}
}
