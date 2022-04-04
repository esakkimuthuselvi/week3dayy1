package org.student;

import org.department.Department;


public class Student extends Department {
	
	public void studentName() {
		System.out.println("Selvi");
	}
    
    public void studentDept() {
    	System.out.println("IT");
	}
    
    public void studentId() {
    	System.out.println("1204");
	}
	
    public static void main(String[] args) {
    	Student stu=new Student();
    	stu.studentName();
    	stu.studentDept();
    	stu.studentId();
    	stu.deptName();
    	stu.collegeName();
    	stu.collegeCode();
    	stu.collegeRank();
	}
}
