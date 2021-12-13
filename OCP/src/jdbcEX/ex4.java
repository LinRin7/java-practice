package jdbcEX;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ex4 {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/gjun";
		String user = "root";
		String password = "piliLin0120";
		String SQL = "insert into porder(name, Lcd, Ram, mouse, sum) "+
					"values(?, ?, ?, ?, ?)";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, password);
			
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, "abc4");
			ps.setString(2, "3");
			ps.setString(3, "3");
			ps.setString(4, "3");
			ps.setString(5, "12000");
			ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch(SQLException e) {
			
			e.printStackTrace();
		}
		

	}

}
