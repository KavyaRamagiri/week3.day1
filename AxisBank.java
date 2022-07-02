package week_3.day1.assignmentss;

 public class AxisBank extends BankInfo {	//derived class AxisBank, using extends keyword for single inheritance

	public void deposit() {					//method definition
			
			System.out.println("deposit amount 1000");
		}

	public static void main(String[] args) {
	AxisBank axis=new AxisBank();			//object instantiation
	axis.deposit();							//overriden method present in BankInfo but priority is given to child class and calls the child class method  
	axis.saving();							//calling method present in BankInfo 
	axis.fixed();							//calling method present in BankInfo 
	BankInfo bank = new BankInfo();			//since priority is given to child class overriden method instantiated object to call parent class method 
	bank.deposit();							//calling method present in BankInfo
	}
}
