package jdbcEX;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ex2 {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/gjun";
		String user = "root";
		String password = "piliLin0120";
		String SQL = "insert into member(name, address, mobile)"+
					"values(?, ?, ?)";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, password);
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, "bb");
			ps.setString(2, "shiboku");
			ps.setString(3, "0965");
			ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			System.out.println("no Driver");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("no connection");
			e.printStackTrace();
		}

	}

}
