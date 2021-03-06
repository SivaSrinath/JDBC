package com.pratice;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class RetrievingAutoGeneratedKeys {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		System.out.println("Hello World!");
		java.sql.Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
				"postgres", "1234");

		String insertQuery="insert into emp(name,salary) values(?, ?)";
		PreparedStatement ps= connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter name :");
		String name=sc.nextLine();
		System.out.println("Enter salary :");
		Long salary=Long.parseLong(sc.nextLine());
		
		ps.setString(1, name);
		ps.setLong(2, salary);
		
		Integer rs = ps.executeUpdate();
		System.out.println(rs);
		
		ResultSet gk= ps.getGeneratedKeys();
		
		while(gk.next()) {
			System.out.println(gk.getLong(1));
		}
		sc.close();
	}
}