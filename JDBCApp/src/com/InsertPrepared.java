package com;

import java.sql.*;

class InsertPrepared {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useSSL=false", "root",
					"admin");

			PreparedStatement stmt = con.prepareStatement("insert into emp values(?,?,?,?)");
			stmt.setInt(1,3);
			stmt.setString(2, "Rahul");// 1 specifies the first parameter in the query
			stmt.setString(3, "11111");
			stmt.setString(4, "32");

			int i = stmt.executeUpdate();
			System.out.println(i + " records inserted");

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}