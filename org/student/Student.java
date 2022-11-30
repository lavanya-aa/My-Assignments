package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName() {
		// TODO Auto-generated method stub
		System.out.println("Aaleyah");
		

	}
	
	public void studentId() {
		// TODO Auto-generated method stub
System.out.println("5545");
	}
	
public void studentDept() {
		// TODO Auto-generated method stub
		
	System.out.println("ECE");	

	}
	
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu = new Student();
		stu.collegeCode();
		stu.collegeName();
		stu.collegeRank();
		stu.studentDept();
		stu.studentId();
		stu.studentName();
		stu.deptName();
		
		

	}

}
