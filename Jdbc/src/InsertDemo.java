import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) {
		
		String sql = "insert into book values (123, 'The Alchemist', 120)";
		Connection conn = null;
		
		try {
			conn = JdbcUtil.getConnection();
			// Creating a statement object 
			Statement stmt = conn.createStatement();
			// Performing DML operation
			int rows = stmt.executeUpdate(sql);
			System.out.println(rows + " inserted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Clean-up operations - runs in both cases.
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
