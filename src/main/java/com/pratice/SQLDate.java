package com.pratice;

import java.sql.Date;
import java.sql.Timestamp;

public class SQLDate {
	public static void main(String[] args) {

		Date sqlDate1 = new Date(System.currentTimeMillis());

		System.out.println(sqlDate1);

		Date sqlDate2 = new Date(new java.util.Date().getTime());

		System.out.println(sqlDate2);
		
		Timestamp timeStamp=new Timestamp(System.currentTimeMillis());
		System.out.println(timeStamp);
		
		Timestamp timestamp2=new Timestamp(new java.util.Date().getTime());
		
		System.out.println(timestamp2);
		System.out.println(System.currentTimeMillis());

	}
}
