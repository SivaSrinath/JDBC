package com.pratice;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        System.out.println( "Hello World!" );
        java.sql.Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "1234");
        
        if(connection==null) {
        	System.out.println("Unable to get connection");
        }else{
        	System.out.println(connection.getClass().getName());
        }

        Statement st=connection.createStatement();
        String createStudentTable="drop table student";
        Integer result=st.executeUpdate(createStudentTable);
        System.out.println("Is table created:"+result);
        
        
    }
}
