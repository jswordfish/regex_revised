package com.assignment.regex;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPatternFinder_Boundary {
	
	    
	PatternFinder finder = new PatternFinderImpl();
	
		static{
			File file = new File("output_boundary_revised.txt");
			 if(file.exists()){
				 try {
					FileUtils.forceDelete(new File("output_boundary_revised.txt"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
				//	e.printStackTrace();
				}
			 }
		}
			 
		
		


	    
	    @Test
	    public void testFindNoOfOccurrences1Boundary() throws Exception{
	        String input = "";
	        /**
	         * Whether the implementation provides reads the right no of occurrences
	         */
	        Integer noFromFile = finder.findNoOfOccurrences(input);
	        
	        File file = new File("output_boundary_revised.txt");
	        FileUtils.write(file, "testFindNoOfOccurrences1Boundary="+(noFromFile==-1?true:false), true);
	       
	        
	        Assert.assertEquals(noFromFile, new Integer(-1));
	        
	        
	        
	    }
	    
	    @Test
	    public void testFindNoOfOccurrences2() throws Exception{
	        String input = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
	        Integer no = finder.findNoOfOccurrences(input);
	        
	        File file = new File("output_boundary_revised.txt");
	        FileUtils.write(file, "\ntestFindNoOfOccurrences2="+(no==0?"true":"false"), true);
	         
	         Assert.assertEquals(no, new Integer(0));
	        
	    }
	    
	    
}
