package com.bridgelabz.JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class EmployeePayrollTest {
	static Statement stmt;
	static Connection con;
	static ResultSet rs; 
	public static final String qry = "select avg(basic_pay) from payroll_service.employee_payroll where gender = 'M' group by gender ";
	public static final String qry1 = "select sum(basic_pay) from payroll_service.employee_payroll where gender = 'M' group by gender ";
	public static final String qry2 = "select Min(basic_pay) from payroll_service.employee_payroll where gender = 'M' group by gender ";
	public static final String qry3 = "select Max(basic_pay) from payroll_service.employee_payroll where gender = 'M' group by gender ";
	public static final String qry4 = "select department,address from payroll_service.employee_payroll";
	public static final String qry5 = "select Basic_pay,Deductions,Taxable_Pay,Tax,Net_Pay from payroll_service.employee_payroll";
	
	@Test
	public void setConnectionTest() throws Exception {
		EmployeePayroll testDB = new EmployeePayroll();
		try {
			testDB.setConnection();
		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getAvgMinMaxSumTest() throws ClassNotFoundException, SQLException {
		EmployeePayroll testDB = new EmployeePayroll();
		try {
			System.out.println("Average");
			testDB.getAvgMinMaxSum(qry);
		} 
		catch (SQLException sqe){
			System.out.println("Error Code = " + sqe.getErrorCode());
			System.out.println("SQL state = " + sqe.getSQLState());
			System.out.println("Message = " + sqe.getMessage());
			System.out.println("printTrace /n");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void getAvgMinMaxSumTest1() throws Exception {
		EmployeePayroll testDB = new EmployeePayroll();
		try {
			System.out.println("SUM");
			testDB.getAvgMinMaxSum(qry1);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void getAvgMinMaxSumTest2() throws Exception {
		EmployeePayroll testDB = new EmployeePayroll();
		try {
			System.out.println("MIN");
			testDB.getAvgMinMaxSum(qry2);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void getAvgMinMaxSumTest3() throws Exception {
		EmployeePayroll testDB = new EmployeePayroll();
		try {
			System.out.println("MAX");
			testDB.getAvgMinMaxSum(qry3);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void getDepartmentAndAddressAfterAlteringTableTest() throws Exception {
		EmployeePayroll testDB = new EmployeePayroll();
		try {
			testDB.getDepartmentAndAddressAfterAlteringTable(qry4);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void getBasic_payDeductionsTaxable_PayIncome_TaxNet_PayAfterAlteringTableTest() throws Exception {
		EmployeePayroll testDB = new EmployeePayroll();
		try {
			testDB.getDepartmentAndAddressAfterAlteringTable(qry5);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
