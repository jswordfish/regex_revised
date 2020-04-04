package com.assignment.regex;


import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class TestUtil {
    
    public static String problem1testcase1 = "../problem.txt";
    
   
      
      public static Properties getForProblem1() throws Exception{
          Properties properties = new Properties();
          FileInputStream fis = new FileInputStream(new File(problem1testcase1));
          properties.load(fis);  
          fis.close();
          return properties;
      }
      
      private static java.sql.Connection getConnection() throws Exception{
    		java.util.Properties props = new java.util.Properties();
    		FileInputStream fis = new FileInputStream("jdbc.properties");
    		props.load(fis);
    		Class.forName("com.mysql.jdbc.Driver"); 
    		String server = props.getProperty("server");
    		String port = props.getProperty("port");
    		String user = props.getProperty("user");
    		String password = props.getProperty("password");
    		String db = props.getProperty("schema");
    		String url = "jdbc:mysql://"+server+":"+port+"/"+db;
    		java.sql.Connection conn = DriverManager.getConnection(url, user, password);
    		return conn;
    		
    	}
      
      public static Integer  getNoOfOccurrencesFromDb(String pattern) throws Exception{
    	  Connection conn = getConnection();
    	  Statement statement = conn.createStatement();
    	  ResultSet resultSet = statement.executeQuery("select noOfOccurrences from regex_data where pattern = '"+pattern+"'");
    	  return resultSet.getInt("noOfOccurrences");
      }
}
