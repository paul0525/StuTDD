package com.tdd;

public class CourseSession {

	
	private String department;
	private String number;
	private int  numberOfStudents; 
	
    CourseSession(String department, String number) {
		super();
		this.department = department;
		this.number = number;
		this.numberOfStudents = 0;
	}


	public String getDepartment() {
		return department;
	}


	public String getNumber() {
		return number;
	}
	
	
	int getNumberOfStudents(){
		return numberOfStudents;
	}
    
	void enroll( Student student ){
		numberOfStudents = numberOfStudents +1;
	}
	
}
