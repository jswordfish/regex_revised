package com.assignment.common;

public class AssignmentException extends RuntimeException{
	
	String message;
	
	public AssignmentException(){
		
	}

	public AssignmentException(String message){
		this.message = message;
	}
}
