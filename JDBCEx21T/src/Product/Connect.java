package Product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	public static Connection getConnect() throws ClassNotFoundException, SQLException {
		Class.forName("org.sqlite.JDBC");
		String url = "jdbc:sqlite::resource:21T1020659.db";
		Connection con = DriverManager.getConnection(url,"","");
		return con;
	}
}
