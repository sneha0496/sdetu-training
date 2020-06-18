package Basics;

public class NumbersCalc {
	
public static void main(String[] args) {
		
		System.out.println("System is Starting");
		printname();
		addnumbers(10,22);
		multiplynumbers(89, 99);
		
	}
	
	public static void printname() {
		System.out.println("My namne is Sneha");
	}
	
	public static void addnumbers(int num1, int num2) {
		int sum = num1+num2;
		System.out.println("Sum is: "+sum);
		
	}
	
	public static float multiplynumbers(int num1, int num2) {
		float multipliednumber = num1*num2;
		
		System.out.println("product is: "+multipliednumber);
		return multipliednumber;
	}
	

}
