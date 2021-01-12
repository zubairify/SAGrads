import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreCompileDemo {

	public static void main(String[] args) {
		int isbn = 9012;
		String name = "Prophecy";
		double price = 150;
		// Query with place-holders i.e. ? - position starts from 1
		String sql = "insert into book values (?, ?, ?)";
		Connection conn = null;
		
		try {
			conn = JdbcUtil.getConnection();
			// Created a pre-compiled statement
			PreparedStatement stmt = conn.prepareStatement(sql);
			// Replace place-holders with values
			stmt.setInt(1, isbn);
			stmt.setString(2, name);
			stmt.setDouble(3, price);
			// Execute statment to perform insert
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
