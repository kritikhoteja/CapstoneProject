package com.beanlib;

public class Configuration {
	// Approver's email address for user registration
	 String approvEmail = "kriti.khoteja@myacu.edu.au";
		
	// You can either create a MySQl account with user = "admin" and password = "hilst601"
	// or modify this URL to use a different user/password
	static String user = "root";
	static String password = "123456789";
	
	// connecting to MySQL without a database
	static String connectionURL = "jdbc:mysql://localhost:3306?user=" + user + "&password=" + password;
		 
	// connecting to an existing database proadb 
	static String dbConnectionURL = "jdbc:mysql://localhost:3306/proadb?user=" + user + "&password=" + password;
	
	// connecting to an existing database proadb allowing loading data from local file
	static String dbLoadConnectionURL = "jdbc:mysql://localhost:3306/proadb?allowLoadLocalInfile=true&user=" + user + "&password=" + password;
	
	// Provide access from jsp programs
	public String getApprovEmail() {
		return approvEmail;
	}

}
