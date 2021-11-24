package com.bridgelabz.JDBC;


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class DBConnectivity {   
	static Connection con;

	private static void listDrivers() {
		Enumeration<Driver> driverList = DriverManager.getDrivers();
		while (driverList.hasMoreElements()) {
			Driver driverClass = (Driver) driverList.nextElement();
			System.out.println("listDriver " + driverClass.getClass().getName());
		}
	}
	
	public static Connection createCP() throws Exception   {   
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=Qwerty@ 1277");
		return con;		
	}

}


 