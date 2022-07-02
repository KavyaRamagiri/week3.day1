package week_3.day1.assignmentss;

public class Students {						//created class Students
	
	public int getStudentInfo(int id) {		//method definition with 1 parameter 
		
	return id;								//returns id since return type used is int
	
	}
	
	public void getStudentInfo(int id, String name) {	//method definition with 2 parameters having different data types (method overloading)
		System.out.println("id is" + " " + id + " , " +  "name is" + " " + name);
			
		}
	public void getStudentInfo(long phoneNumber, String email) {	//method definition with 2 parameters having different data types (method overloading)
		System.out.println("phoneNumber is" + " " + phoneNumber + "," + "email is" + " " + email);
	}
	
	public static void main(String[] args) {
		Students students = new Students();		//object instantiation
		int a =students.getStudentInfo(123);	//assigning value into local variable
		System.out.println(a);					//print the output in console
		students.getStudentInfo(101,"Rocky");	//passing values and calling the method 
		students.getStudentInfo(215640L,"rkavya19123@gmail.com"); //passing values and calling the method 
	}

}
