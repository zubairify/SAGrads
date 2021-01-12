import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CmdLineInputDemo {
	
	public static void main(String[] args) {
		
		String sql = "insert into book values (?, ?, ?)";
		Connection conn = null;
		
		try {
			conn = JdbcUtil.getConnection();
			// Created a pre-compiled statement
			PreparedStatement stmt = conn.prepareStatement(sql);
			// Replace place-holders with command line input values
			stmt.setInt(1, Integer.parseInt(args[0]));
			stmt.setString(2, args[1]);
			stmt.setDouble(3, Double.parseDouble(args[2]));
			
			// Execute statement to perform insert
			stmt.executeUpdate();
			System.out.println("Book inserted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
