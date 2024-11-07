package com.nachi.mydemo.app;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.sql.ResultSet;

public class StartApp {
	static Set<FireFlixUsers> ts = new TreeSet<>(new FireFlixLastNameComparator());
	static void selectOperation() throws SQLException,NullPointerException{
		String displayQuery = "select * from sample.customer;";
		Statement smt = DBConnection.getConnection();
		ResultSet res = smt.executeQuery(displayQuery);	
		while(res.next()) ts.add(new FireFlixUsers(res.getInt("customer_id"),res.getString("first_name"),res.getString("last_name"),res.getString("email")));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			selectOperation();
		}catch(Exception e) {
			e.printStackTrace();
		}
		Iterator<FireFlixUsers> ls = ts.iterator();
		while(ls.hasNext()) {
			FireFlixUsers s = ls.next();
			System.out.println("Customer id: "+s.cid+", Customer FirstName: "+s.fname+", Customer LastName: "+s.lname+", Customer Email: "+s.email);
			System.out.println("");
		}
	}

}
