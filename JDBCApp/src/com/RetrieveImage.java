package com;

import java.sql.*;
import java.io.*;

public class RetrieveImage {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useSSL=false", "root",
					"admin");
			PreparedStatement ps = con.prepareStatement("select * from imgtable");
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {// now on 1st row

				Blob b = rs.getBlob(2);// 2 means 2nd column data
				byte barr[] = b.getBytes(1, (int) b.length());// 1 means first image

				FileOutputStream fout = new FileOutputStream("F:/Applications/Java/java/JDBCApp/img/t.jpg");
				fout.write(barr);

				fout.close();
			} // end of if
			System.out.println("ok");

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}