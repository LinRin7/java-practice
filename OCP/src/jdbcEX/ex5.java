package jdbcEX;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ex5 {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/gjun";
		String user = "root";
		String password = "piliLin0120";
		String SQL = "SELECT * FROM porder order by sum desc";//·Ósum±Æ§Ç »¼´î
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, password);
			
			PreparedStatement ps = conn.prepareStatement(SQL);
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
