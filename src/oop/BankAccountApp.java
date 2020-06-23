package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		//creating a new bank account ..think instantiate an object
		
		/*Constructors: used to define, setup, initialize properties of an object. They are implicitly called upon instantiation. 
		Methods which are unique because of:
		1.	Same name as the class itself
		2.	Is called IMPLICITLY
		3.	Java calls a default constructor when there is no constructor defined.
		4.	Constructor does not have a return type, ever. 
		*/
		
		BankAccount bankAcc1 = new BankAccount();
		
		//another bank acc to demonstrate overloading - polymorphism
		//BankAccount bankAcc2 = new BankAccount("Savings");
		
		//without encapsulation:
		//bankAcc1.name = "acc1";
		
		//with encapsulation
		bankAcc1.setName("acc1");
		System.out.println(bankAcc1.getName());
		bankAcc1.setSSN("01998371");
		System.out.println("Your SSN is: "+bankAcc1.getSSN());
		bankAcc1.accountType = "1234567";
		
		//polymorphism through overriding
		bankAcc1.toString();
		
		//demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.setName("cdAccount");
		cd1.accountType = "CD account";
		System.out.println(cd1.toString());
		cd1.interestRate = "5.5"; 
		cd1.compound();
		
		//demonstating access specifiers
		 bankAcc1.deposit(2000.0);
		 bankAcc1.withdraw(100);
		 bankAcc1.deposit(1000);
		 bankAcc1.withdraw(200);
		 cd1.toString();
		 
		 //the interface's methods are going to be availabe as well:
		 bankAcc1.setRate();
		 bankAcc1.increaseRate();
	}

}
