package com.wipro.bus.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil 
{
	static Connection getDBConnection()
	{
	try
	{
	Class.forName("oracle.jdbc.OracleDriver");
	String url="jdbc:oracle:thin:@localhost:1521:ORCL";
	String username="B44641345068";
	String password="B44641345068";
	Connection con=DriverManager.getConnection(url, username, password);
	System.out.println("Connection "+con);
	return con;
	}
	catch(ClassNotFoundException e)
	{
		e.printStackTrace();
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	return null;
}
}
