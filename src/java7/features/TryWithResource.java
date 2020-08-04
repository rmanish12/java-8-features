package java7.features;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryWithResource {

	// Before Java 7
	public void getString() {
		Connection con = null;
		
		try {
			con = DriverManager.getConnection("url");
			
			// DB operations
			System.out.println("Before Java 7, connection established");
		} catch( SQLException e) {
			System.out.println(e);
		} finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	// After Java 7
	public void returnString() {
		try (Connection con = DriverManager.getConnection("url")) {
			
			// DB operations
			System.out.println("After Java 7, connection established");
			
		} catch(SQLException e) {
			System.out.println(e);
		}
		
		// no need of finally block
	}
	
}
