package week_3.day1.assignmentss;

public class Automation extends MultipleLangauge implements TestTool, Language { //execution class Automation which is a derived class
	
	public void Selenium() {					//TestTool interface related method
	System.out.println("selenium training");	//method definition 
	}
	
	public void Java() {						//Language interface related method
		System.out.println("Java training");	
	}
	
	@Override
	public void Ruby() {						//overriden method of abstract class MultipleLangauge
		System.out.println("Ruby");	
		
	}
	
	public static void main(String[] args) {	
		Automation auto = new Automation();		//object instantiation 
		auto.Selenium();						//calling methods of interface TestTool
		auto.Java();							//calling methods of Language interface
		auto.Ruby();							//calling overiden method of abstract class MultipleLangauge
		auto.python();							//calling method of abstract class MultipleLangauge

	}
}
