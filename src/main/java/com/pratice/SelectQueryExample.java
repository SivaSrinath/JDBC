package com.pratice;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectQueryExample {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		System.out.println("Hello World!");
		java.sql.Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
				"postgres", "1234");

		Statement st = connection.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Emp ID:");
		Long empId=Long.parseLong(sc.nextLine());
		String createStudentTable = "SELECT emp_id, name, salary FROM public.emp where emp_id="+empId;
		ResultSet result = st.executeQuery(createStudentTable);

		List<PojoSelExample> data = new ArrayList<PojoSelExample>();

		while (result.next()) {
			PojoSelExample pojo = new PojoSelExample();

			pojo.setEmpId(result.getLong("emp_id"));
			pojo.setName(result.getString("name"));
			pojo.setSalary(result.getDouble("salary"));

			data.add(pojo);

		}
		System.out.println(data);
	}
}
