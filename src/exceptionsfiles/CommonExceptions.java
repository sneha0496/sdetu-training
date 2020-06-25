package exceptionsfiles;

public class CommonExceptions {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 0;
		
		//1. Identify the potential problem area
		//2. Surround with a try-catch block:
		try {
		int c = a/b;
		System.out.println(c);
	} catch (ArithmeticException e) {
		System.out.println("cannot divide by 0");
		System.out.println(e.toString());
	}
		//added to show that everything is executing fine and that the flow is followed.
		System.out.println("Programming is closing");

		
		//another error:
		String[] states = {"CA", "TX", "AZ", "NY"};
		for (int i = 0; i<= states.length; i++) {
			try {
				System.out.println(states[i]);
				} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Error:Index outside of array domain");
				e.toString();
				}
			//finally will execute regardless of whether catch is excuted or not
			finally {
				System.out.println("The progream is still executing");
			}
			
		}
}
}
