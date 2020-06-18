package Basics;

public class SalaryCalculator {

	public static void main(String[] args) {
		
		//create a variable to declare our career
		
		//declaring the variable
		String career;
		System.out.println("program is starting");
		
		//defining the variable
		career = "s/w developer";
		System.out.println("My career is: "+career );
		
		//declare and define
		int hoursperweek = 50;
		int weeksperyear = 52;
		double rate = 42.50;
		
		//Compute our annual salary = rate * hrs per week *weeks per year
		double salary = hoursperweek*weeksperyear*rate;
		System.out.println("My salary as a "+career+" "+"Salary is: "+salary);
	}

}
