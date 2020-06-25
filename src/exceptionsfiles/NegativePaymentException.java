 package exceptionsfiles;

public class NegativePaymentException extends Exception {
	
double payment;

public NegativePaymentException(double payment)  {
	this.payment = payment;
	System.out.println("Error: negative payment");
}

@Override
public String toString() {
	return "Cannot accept negative payment " + payment;
}

}
