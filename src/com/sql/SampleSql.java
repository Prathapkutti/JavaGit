package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SampleSql {
public static void main(String[] args) {
	Connection con=null;
	
try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
    con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","admin");
     String query = "Select * from employees where FIRST_NAME='Ellen'";
     PreparedStatement ps = con.prepareStatement(query);
     ResultSet rs = ps.executeQuery();

while (rs.next()) {
	String fn = rs.getString("FIRST_NAME");
	System.out.println(fn);
}

con.close();	
}	
	
catch (Exception e) {
	e.printStackTrace();
}	
	
	
	
}
}
