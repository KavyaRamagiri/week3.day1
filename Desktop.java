package org.system;					//create a package org.system

public class Desktop extends Computer { //derived class, using extends keyword for single inheritance
	
	public void desktopSize() {			//method definition
		System.out.println("15.6");
	}

	public static void main(String[] args) {
		Desktop desktop= new Desktop(); // object instantiation for child class
		desktop.computerModel();		//calling method of parent class
		desktop.desktopSize();			//calling method of child class
		
			
	}

}
