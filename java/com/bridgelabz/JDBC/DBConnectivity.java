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

/*
 * public static void main(String[] args) {

		String jdbcURL = "jdbc:mysql://localhost:3306/payroll_service?useSSL=false";
		String userName = "root";
		String password = "Qwerty@ 1277";
		Connection con;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");

		} catch (ClassNotFoundException e) {
			throw new IllegalStateException("Cannot find the driver in the classpath!", e);
		}
		listDrivers();

		try {

			System.out.println("Connecting to database" + jdbcURL);
			con = DriverManager.getConnection(jdbcURL, userName, password);
			System.out.println("Connection is successfull!!!!" + con);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
 * */
 