package com;

import java.sql.*;
import java.io.*;

public class InsertImage {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useSSL=false", "root",
					"admin");
			PreparedStatement ps = con.prepareStatement("insert into imgtable values(?,?,?)");
			ps.setString(1, "1");
			ps.setString(2, "sonoo");

			FileInputStream fin = new FileInputStream("F:/Applications/Java/java/JDBCApp/t.jpg");
			ps.setBinaryStream(3, fin, fin.available());
			int i = ps.executeUpdate();
			System.out.println(i + " records affected");

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}