import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookDao {

	public static void saveBook(Book book) {
		String sql = "insert into book values (?,?,?)";
		Connection conn = null;
		
		try {
			conn = JdbcUtil.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, book.getIsbn());
			stmt.setString(2, book.getTitle());
			stmt.setDouble(3, book.getPrice());
			stmt.executeUpdate();
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
	
	public static void printBooks() {
		String sql = "Select * from book";
		Connection conn = null;
		
		try {
			conn = JdbcUtil.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("ISBN\tTitle\tPrice");
			while(rs.next())
				System.out.println(rs.getString("isbn") + "\t" + rs.getString(2) + "\t" + rs.getString("price"));
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
