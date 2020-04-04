package com.assignment.regex;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.assignment.common.AssignmentException;

public class TestPatternFinder_ExceptionHandling {
	PatternFinder finder = new PatternFinderImpl();
	
	
	static{
		File file = new File("output_exception_revised.txt");
		 if(file.exists()){
			 try {
				FileUtils.forceDelete(new File("output_exception_revised.txt"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
			//	e.printStackTrace();
			}
		 }
	}
		 
	
	
	@Test(expected=AssignmentException.class)
    public void testFindNoOfOccurrences1Boundary() throws Exception{
        String input = null;
        /**
         * Whether the implementation provides reads the right no of occurrences
         */
        Integer noFromFile;
		try {
			noFromFile = finder.findNoOfOccurrences(input);
		} catch (AssignmentException e) {
			// TODO Auto-generated catch block
			File file = new File("output_exception_revised.txt");
			FileUtils.write(file, "testFindNoOfOccurrences1Boundary=true", true);
			throw e;
		}
		catch(Exception e){
			File file = new File("output_exception_revised.txt");
			FileUtils.write(file, "testFindNoOfOccurrences1Boundary=false", true);
			throw e;
		}
		
		File file = new File("output_exception_revised.txt");
		FileUtils.write(file, "testFindNoOfOccurrences1Boundary=false", true);
    }
}
