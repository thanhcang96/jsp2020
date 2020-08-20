package datn.shopphukien.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUntils {
	public static Connection getMySQLConnection() throws SQLException, ClassNotFoundException {
		String hostName = "localhost";
		String dbName = "shop_datn";
		String userName = "root";
		String password = "2503";
	    Class.forName("com.mysql.jdbc.Driver");
	    String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName + "?useUnicode=true&characterEncoding=UTF-8";	 
	    Connection conn = DriverManager.getConnection(connectionURL, userName,
	             password);
	     return conn;
	 }
}