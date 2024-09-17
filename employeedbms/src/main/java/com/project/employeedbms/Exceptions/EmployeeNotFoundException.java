package com.project.employeedbms.Exceptions;

@SuppressWarnings("serial")
public class EmployeeNotFoundException extends RuntimeException {
	
	public EmployeeNotFoundException(String message)
	{
		super(message);
	}

}
