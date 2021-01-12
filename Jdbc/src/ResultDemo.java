import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultDemo {

	public static void main(String[] args) {
		
		String sql = "Select * from book";
		Connection conn = null;
		
		try {
			conn = JdbcUtil.getConnection();
			Statement stmt = conn.createStatement();
			// Executing select query and getting results back
			ResultSet rs = stmt.executeQuery(sql);
			
			// Until there's next record it will keep looping
			while(rs.next())
				System.out.println(rs.getString("isbn") + "\t" + rs.getString(2) + "\t" + rs.getString("price"));
//				System.out.println(rs.getInt("isbn") + "\t" + rs.getString(2) + "\t" + rs.getDouble("price"));
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
