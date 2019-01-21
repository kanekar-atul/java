package com;

import java.sql.*;

class FetchRecord {
	public static void main(String args[]) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useSSL=false", "root", "admin");
		Statement stmt = con.createStatement();
		ResultSet rs = ((java.sql.Statement) stmt).executeQuery("select * from emp");
		while (rs.next())
			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
		con.close();
	}
}