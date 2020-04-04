package com.assignment.regex;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPatternFinder_Functional {
    
    
PatternFinder finder = new PatternFinderImpl();

	static{
		File file = new File("output_revised.txt");
		 if(file.exists()){
			 try {
				FileUtils.forceDelete(new File("output_revised.txt"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		 }
	}
		 
		
	
    
    @Test
    public void testFindNoOfOccurrences1() throws Exception{
        String input = "www";
        /**
         * Whether the implementation provides reads the right no of occurrences
         */
        Integer noFromFile = finder.findNoOfOccurrences(input);
//        /**
//         * Whether the test test giver is able to save information into database
//         */
//        Integer noFromDatabase = TestUtil.getNoOfOccurrencesFromDb(input);
//        
//        Assert.assertEquals(noFromFile, noFromDatabase);
//        
//        Integer answer = Integer.parseInt((String)properties.get("testcase1"));
//        Assert.assertEquals(noFromFile, answer);
        File file = new File("output_revised.txt");
//        Boolean exist = file.exists();
//        	if(!exist){
//        		FileUtils.write(file, "testFindNoOfOccurrences1="+noFromFile, true);
//        	}
        FileUtils.write(file, "testFindNoOfOccurrences1="+noFromFile, true); 
    }
    
    @Test
    public void testFindNoOfOccurrences2() throws Exception{
        String input = "qwerty";
        Integer no = finder.findNoOfOccurrences(input);
         //Integer answer = Integer.parseInt((String)properties.get("testcase2"));
         //Assert.assertEquals(no, answer);
        File file = new File("output_revised.txt");
        Boolean exist = file.exists();
//        	if(!exist){
//        		FileUtils.write(file, "\ntestFindNoOfOccurrences2="+no, true);
//        	}
        FileUtils.write(file, "\ntestFindNoOfOccurrences2="+no, true);
    }
    
    @Test
    public void testFindNoOfOccurrences3() throws Exception{
        String input = "abc";
        Integer no = finder.findNoOfOccurrences(input);
         //Integer answer = Integer.parseInt((String)properties.get("testcase3"));
        // Assert.assertEquals(no, answer);
        File file = new File("output_revised.txt");
        FileUtils.write(file, "\ntestFindNoOfOccurrences3="+no, true);
    }
}
