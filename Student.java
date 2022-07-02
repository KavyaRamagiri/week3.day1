package org.student;									//create package org.student 

import org.department.Department;						// import the parent class Department since it is available in another package 

public class Student extends Department {				//derived class, using extends keyword for single inheritance (multilevel inheritance)

		public void studentName()  {					//method definition
			System.out.println("Lisa");
		}
		
		public void studentDept() {
			System.out.println("CSE");
		}
		
		public void studentId() {
			System.out.println("A0160");
		}
			
		public static void main(String[] args) {
			Student	student = new Student();			//object instantiation
				student.studentName();					//calling method present in same class 
				student.studentDept();					//calling method present in same class
				student.studentId();					//calling method present in same class
				student.collegeName();					//calling method present in College class
				student.collegeCode();					//calling method present in College class
				student.collegeRank();					//calling method present in College class
				student.deptName();						//calling method present in Department class
		}	
}