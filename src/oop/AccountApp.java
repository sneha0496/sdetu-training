package oop;

public class AccountApp {

	public static void main(String[] args) {
		
		LoanAccount la = new LoanAccount();
		la.setRate();
		la.increaseRate();
		la.setAmmortSchedule(); 
		la.setTerm(20);
		
		//example to show how polymorphism changes where we are pointing.
		//here, account1 has the properties of IRate but is of the LoanAccount type.
		//hence, only the methods defined in IRate will be available to account1.
		//However, when the methods are called, the LoanAccount methods are called, 
		//because the interface only provides an outline.
		IRate account1 = new LoanAccount();
		account1.increaseRate();

	}

}
