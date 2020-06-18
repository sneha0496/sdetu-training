package oop;

//Bank account automatically inherits the Object class
//“Implements” is the key word used when a class is making use of an interface. 
public class BankAccount implements IRate {
	
	//what does a bank acc have?
	
	//defining the variables
	String accNo;
	
	//static means that the routingNo belongs to the class
	//it is still true for the objects, i.e. the object, say bankAcc1 can still use routingNo
	//see the BankAccountApp class
	private static String routingNo = "12345678";
	private static final String countryCode = "004";
	
	//instance Variables
	private String name;
	private String SSN;
	String accountType;
	double balance;

	BankAccount(){
		System.out.println("NEW ACC CREATED");
	}
	
	//Demonstrating overloading - name of the methods are the same, but the arguments are different
	//accountTypt is a loacl vaiable
	BankAccount(String accountType){
		System.out.println("NEW ACC CREATED OF TYPE: " + accountType);
		
	}
	
	//properties
	
	
	//public means available within the project
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("making a deposit");
		
	}
	
	//default access modifier means available within the package
	void withdraw(double amount) {
		balance = balance + amount;
		showActivity("making a withdrawl");
		
	}
	
	//available only within the class
	private void showActivity(String activity) {
		System.out.println(" You're recent activity is: "+activity);
		System.out.println("you're new balance is: " +balance);
	}
	
	void checkBalance() {
		
	}
	
	void getStatus() {
		 
	}
	
	//demonstrating overriding:
	@Override
	public String toString() { 
		return "[" + getName() + " . " + accountType + " . " + routingNo + " . " + countryCode + "]";
	}

	
	public String getName() {
		return name;
	}

	//allow the users to define the name
	public void setName(String name) {
		//this refers to the instance variable declare above:
		this.name = name;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	
	//Interface methods 
	@Override
	public void setRate() {
		System.out.println("Setting rate");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void increaseRate() {
		System.out.println("Increasing rate");
		// TODO Auto-generated method stub
		
	}
	
}
