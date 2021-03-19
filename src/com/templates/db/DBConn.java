package com.templates.db;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 *  NOTE : Create a new file like this with the name -> "DBConnection" 
 */

public class DBConn {
     public Connection con = null;
     public Connection getConnection() {
 		Connection con = null;
 		try {
 			Class.forName("com.mysql.jdbc.Driver"); 
 			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/your-db-schema","your-username","your-password");
 		}
 		catch(Exception e) {
 			e.printStackTrace();
 		} 		
 		return con;
 	}
}
