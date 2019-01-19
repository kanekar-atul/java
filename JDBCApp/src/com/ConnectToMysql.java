package com;

import java.sql.*;  

public class ConnectToMysql {

	public static void main(String[] args) {
		try {

			Class.forName("com.mysql.jdbc.Driver");  

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useSSL=false", "root", "admin");

			Statement stmt = (Statement) con.createStatement();
			ResultSet rs = ((java.sql.Statement) stmt).executeQuery("select * from emp");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
