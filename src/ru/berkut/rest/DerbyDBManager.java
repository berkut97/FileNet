package ru.berkut.rest;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DerbyDBManager {
	
	public static final String driver = "org.apache.derby.jdbc.EmbeddedDriver";
	public static final String url = "jdbc:derby:applDB;create=true";
	
	public static void main(String[] args) {
	    Connection con = null ;
	    DatabaseMetaData dbmd = null ;
	         
	    try {
	        Class.forName(driver) ;
	        con = DriverManager.getConnection(url);        
	    } catch (SQLException se) {
	        printSQLException(se) ;
	    } catch(ClassNotFoundException e){
	        System.out.println("JDBC Driver " + driver + " not found in CLASSPATH") ;
	    }finally {
	        if(con != null){
	            try{
	                con.close() ;
	            } catch(SQLException se){
	                printSQLException(se) ;
	            }
	        }
	    }
	    try {
			con.createStatement().execute(
					"Create TABLE Person (staffID INT primary key, firstName varchar(20), secondName varchar(20), patronymic varchar(20), post varchar(50))");
			//con.createStatement().execute(
			//		"Create TABLE Department (staffID INT primary key, fullName varchar(50), shortTitle varchar(20), head varchar(60), phone varchar(20))");
			//con.createStatement().execute(
			//		"Create TABLE Organization (staffID INT primary key, fullName varchar(50), shortTitle varchar(20), head varchar(60), phone varchar(20))");
		} catch (SQLException se) {
	        printSQLException(se);
		}
	}
	
	private static void printSQLException(SQLException se) {
	    while(se != null) {
	        System.out.print("SQLException: State: " + se.getSQLState());
	        System.out.println("Severity: " + se.getErrorCode());
	        System.out.println(se.getMessage());            
	         
	        se = se.getNextException();
	    }
	 }

}
