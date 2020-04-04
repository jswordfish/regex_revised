package com.assignment.regex;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class PatternFinderImpl implements PatternFinder{

/**
 * Use regex to find the no of occurences of text - 'www'
 *  without quotes in file - regex.txt at root location
 * 
 */
    public Integer findNoOfOccurrences(String str) throws IOException{
        // TODO Auto-generated method stub
        String data = FileUtils.readFileToString(new File("regex.txt"));
        //start coding
        return 0;
    }
    
    
}
