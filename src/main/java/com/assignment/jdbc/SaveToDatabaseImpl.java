package com.assignment.jdbc;

import java.io.FileInputStream;
import java.sql.DriverManager;
import java.sql.Statement;

import com.assignment.regex.PatternFinder;
import com.assignment.regex.PatternFinderImpl;


public class SaveToDatabaseImpl implements SaveToDatabase{
    
    PatternFinder finder = new PatternFinderImpl();
    java.util.Properties props = new java.util.Properties();
    
    
    private java.sql.Connection getConnection() throws Exception{
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
    
    
    public void saveToDatabase(String pattern, Integer noOfOccurrences) throws Exception{
        java.sql.Connection connection = getConnection();
        String query = "insert into regex_data values ('"+pattern+"',"+noOfOccurrences+")"; 
        Statement statement = connection.createStatement();
        statement.execute(query);
    }
    
    public void cleanDatabaseTables(){
        
    }
}
