package jdbcEX;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ex8 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:mysql://localhost:3306/gjun";
		String user = "root";
		String password = "piliLin0120";
		String SQL = "delete from member where id = ?";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, user, password);
		PreparedStatement ps = conn.prepareStatement(SQL);
		//ps.setString(1, "5");
		ps.setInt(1, 6);
		ps.executeUpdate();

	}

}
