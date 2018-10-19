package com.pratice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SqlInjectionSolutionTest {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World!");
		Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
				"postgres", "1234");
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter data");
		System.out.println("enter name :");
		String name = sc.nextLine();

		System.out.println("enter empid :");
		Long empid = Long.parseLong(sc.nextLine());

		String sql = "select emp_id, name, salary from emp where name=? and emp_id=?";
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, name);
		ps.setLong(2, empid);
		
		ResultSet rs= ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("salary"));
		}
	}
}
