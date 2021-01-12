import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {
	public static void main(String[] args) {
		String sql1 = "insert into book values (9210, 'Time Machine', 220)";
		String sql2 = "update book set price=200 where isbn=123";
		String sql3 = "delete from book where isb=901";
		Connection conn = null;
		
		try {
			conn = JdbcUtil.getConnection();
			conn.setAutoCommit(false); // setting the auto-commit to false
			
			Statement stmt = conn.createStatement();
			// Adding batch of queries to statement to perform in one go
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			
			// To execute all the queries together
			stmt.executeBatch();
			// Committing changes when all executes successfully
			conn.commit();
			System.out.println("Transaction completed successfully");
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			System.out.println("Transaction failed due to..");
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
