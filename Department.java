package org.department;		//create a package org.department

import org.college.College;	//import the super class College since it is present in different package 

public class Department extends College {	// derived class for Class College (becomes parent class for student class), using extends keyword for single inheritance
 	
	public void deptName() {				//method definition
		System.out.println("ECE");
	}
	
}
