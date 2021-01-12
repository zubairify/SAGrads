import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class CallingProcedureDemo {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		try {
			conn = JdbcUtil.getConnection();
			// To call procedure by name "getname"
			CallableStatement stmt = conn.prepareCall("{call getname(?,?)}");
			
			// Replace first placeholder of isbn as 123
			stmt.setInt(1, 123);
			// Specifying VARCHAR type data and out param value
			stmt.registerOutParameter(2, Types.VARCHAR);
			// Calling procedure on the database
			stmt.execute();
			System.out.println("Title: " + stmt.getString(2));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
