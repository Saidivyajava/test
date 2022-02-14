package com.admissions.registration.studentregistration.StudentUtil;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class StudentUtil {
	
	
	public  static  Date convertToJavadate(java.sql.Date localdate)
	
	{
		//Local date instance
	    LocalDate localDate = LocalDate.now();
	     
	    //Get LocalDate from SQL date
	    java.sql.Date sqlDate = java.sql.Date.valueOf( localDate );
	     
	    System.out.println( sqlDate );  
	    return sqlDate;
	}


	
	public static void main(String[] args) 
	  {
	   
		//System.out.println("  sql date :: "+ converttoSqlDate("10-01-1980"));
		 DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	     
		    String dateString = "14/07/2018";
		     
		    //string to date
		    LocalDate localDate = LocalDate.parse(dateString, dateTimeFormatter);
		    System.out.println("  localDate to string:"+ localDate);
}
}