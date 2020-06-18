package oop;

//CD inherits bankAccount which inherits the object class
public class CDAccount extends BankAccount {

	String interestRate;
	
	void compound() {
		System.out.println("Compounding interest");
	}
}
