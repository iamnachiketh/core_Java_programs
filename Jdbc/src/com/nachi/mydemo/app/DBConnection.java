package com.nachi.mydemo.app;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBConnection {
	static Statement getConnection(){
		Statement smt = null;
		try{
			Properties p = new Properties();
			FileReader fileRead = new FileReader("C:\\Users\\NACHIKETHA\\eclipse-workspace\\Jdbc\\src\\com\\nachi\\mydemo\\app\\config.properties");
			p.load(fileRead);
			// 1) load the driver class which will register the object 
			//    with Driver Manager class.
			Class.forName(p.getProperty("driverName"));
			
			// 2) connect to the database.  
			Connection con = DriverManager.getConnection(p.getProperty("connectionString"), p.getProperty("userName"), p.getProperty("password"));
			
			//  3) get it ready for executing the statements.
			smt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			
		}catch(SQLException e) {
			System.out.println("SQLException: "+e.getMessage());
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return smt;
	}
}
