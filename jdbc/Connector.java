package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {
	private Connection con;
	
	public Connector(){
		try {
			getClass().forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "HR", "yourpasswordhere");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Connection getCon() {
		return con;
	}
}
