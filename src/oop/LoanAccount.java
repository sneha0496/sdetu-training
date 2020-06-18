package oop;

public class LoanAccount implements IRate {

	@Override
	public void setRate() {
		System.out.println("RATEEEEE");
		
	}

	@Override
	public void increaseRate() {
		System.out.println("Increase");
		
	}
	
	public void setTerm(int term) {
		System.out.println("setting teh term to "+ term + " years.");
	}

	public void setAmmortSchedule() {
		System.out.println("setting teh ammortization schedule");
	}
}
