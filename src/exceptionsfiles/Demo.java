package exceptionsfiles;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Program stars");
		//passing a 0 into the method:
		doMath(9,0);
	}
	
	public static void doMath(int q, int x) {
		answer(q,x);
	}
	
	public static double answer(int a, int b) {
		return a/b;
	}

}
