import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.OracleDriver;

public class JdbcUtil {

	public static Connection getConnection() throws SQLException {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "zubair";
		String password = "oracle";
		
		// Instantiating driver class
		OracleDriver driver = new OracleDriver();
		
		// Registering driver with Driver Manager
		DriverManager.registerDriver(driver);
		
		// Requesting connection from Driver Manager
		Connection conn = DriverManager.getConnection(url, username, password);
		
		return conn;
	}
}
