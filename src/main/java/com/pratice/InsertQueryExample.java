package com.pratice;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertQueryExample {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World!");
		java.sql.Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
				"postgres", "1234");

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Data:");
		System.out.println("Enter Name:");
		String name=sc.nextLine();
		System.out.println("Enter Salary:");
		Double salary=Double.parseDouble(sc.nextLine());
		String insertQuery="INSERT INTO public.emp(" + 
				"	 name, salary)" + 
				"	VALUES ( '"+name+"',"+salary+" )";
		
		System.out.println(insertQuery);
		Statement ps = connection.createStatement();
		
		System.out.println("Result:"+ps.executeUpdate(insertQuery));
	}
}
