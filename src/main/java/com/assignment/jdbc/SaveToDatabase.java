package com.assignment.jdbc;

public interface SaveToDatabase {

	
	public void saveToDatabase(String pattern, Integer noOfOccurrences) throws Exception;
    
    public void cleanDatabaseTables();
}
