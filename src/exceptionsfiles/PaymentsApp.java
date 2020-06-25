package exceptionsfiles;

import java.util.Scanner;

public class PaymentsApp {

	//take a positive payment from the user
	public static void main(String[] args) {
		
		double payment = 0;
		
		//1. ask the user for input
		System.out.println("Enter the payment amount: ");
		
		//2. get the amount and test the value
		Scanner in = new Scanner(System.in);
		try{
			payment = in.nextDouble();
			if (payment <0) {
				//throw the error:
				 throw new NegativePaymentException(payment);
			
		}} catch (NegativePaymentException e) {
			System.out.println("Error!: "+e.toString());
		}
		
		System.out.println(payment);
		
			//now to test the value:
		
		
		//3. handle exceptions appropriately
		//4. print confirmation
		

		}

}
