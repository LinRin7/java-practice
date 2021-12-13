package jdbcEX;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ex7 {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/gjun";
		String user = "root";
		String password = "piliLin0120";
		String SQL = "update member set name = ?, address = ?, mobile = ? "+
					"where id = ?";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, password);
			
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, "zoo");
			ps.setString(2, "zoo");
			ps.setString(3, "000");
			ps.setString(4, "5");
			ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
