package jdbcEX;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ex3 {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/gjun";
		String user = "root";
		String password = "piliLin0120";
		//String SQL = "SELECT * FROM gjun.member where name = 'abc'";//Statement
		String SQL = "SELECT * FROM member where name = ?";//PreparedStatement
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, password);
			
			/*Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(SQL);*/
			
			/*PreparedStatement ps = conn.prepareStatement(SQL);
			ResultSet rs = ps.executeQuery();*/
			
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, "abc");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("id")+
						"\t"+rs.getString("name")+
						"\t"+rs.getString("address")+
						"\t"+rs.getString("mobile"));
			}
		} catch (ClassNotFoundException e) {
			System.out.println("no Driver");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("no connection");
			e.printStackTrace();
		}

	}

}
