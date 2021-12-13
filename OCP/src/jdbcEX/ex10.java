package jdbcEX;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ex10 {

	public static void main(String[] args) {
		
		//809 ex14 Ex28
		String url = "jdbc:mysql://localhost:3306/hw4";
		String username = "root";
		String password = "piliLin0120";
		
		try {
			Connection conn = DriverManager.getConnection(url, username, password);
			Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			st.execute("select * from porder");
			ResultSet rs = st.getResultSet();
			rs.absolute(3);
			rs.moveToInsertRow();
			rs.updateInt(1, 6);
			rs.updateString(2, password);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
