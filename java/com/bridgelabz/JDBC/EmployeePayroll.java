package com.bridgelabz.JDBC;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeePayroll {
	static Statement stmt;
	static Connection con;
	static ResultSet rs;
	
	
	public void setConnection() throws Exception{
		System.out.println("Driver Class Loaded");
		con = DBConnectivity.createCP();
		System.out.println("Connetion Establish with db server"); 
		stmt = con.createStatement();
	}
	
	public void getAvgMinMaxSum(String qry) throws Exception{
		setConnection();
		System.out.println("Data Update"); 
		rs = stmt.executeQuery(qry);
		while (rs.next()) {
			double result = rs.getDouble(1);
			System.out.println("Result : " + result);
		} 
	}	
	
	public void getDepartmentAndAddressAfterAlteringTable(String qry) throws Exception{
		setConnection();
		rs = stmt.executeQuery(qry);	
		
	}
	
	public void getBasic_payDeductionsTaxable_PayIncome_TaxNet_PayAfterAlteringTable(String qry) throws Exception{
		setConnection();
		rs = stmt.executeQuery(qry);		
	}
}
