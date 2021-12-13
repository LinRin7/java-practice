package jdbcEX;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ex6 {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/gjun";
		String user = "root";
		String password = "piliLin0120";
		String SQL = "select * from porder where sum >= ? and sum <= ? and name <> 'abc3'";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, password);
			
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setInt(1, 5000);
			ps.setInt(2, 10000);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("id")+"\t"+
						rs.getString("name")+"\t"+
						rs.getInt("Lcd")+"\t"+
						rs.getInt("Ram")+"\t"+
						rs.getInt("mouse")+"\t"+
						rs.getInt("sum")+"\t");
			}
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
