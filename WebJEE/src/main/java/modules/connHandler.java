package modules;

import java.sql.*;

public class connHandler {
	
	public static ResultSet function() throws SQLException, ClassNotFoundException {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String dbURL = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String pwd = "root";
		
		// connect
		Connection c = null;
		Statement stmnt = null;
		ResultSet rs = null;
		
		c = DriverManager.getConnection(dbURL, user, pwd);
		// create sql stmnt
		stmnt = c.createStatement();
		
		// execute sql stmnt
		rs = stmnt.executeQuery("SELECT * FROM test.sample");
		
		// process rows
//		while(rs.next()) {
//			System.out.println("id : " + rs.getInt("id") + " its language : " + rs.getString("language"));
//		}
		
		
		rs.close();
		stmnt.close();
		c.close();
		
		return rs;
	}
	public static void func() {
		System.out.println("hello");
	}
}