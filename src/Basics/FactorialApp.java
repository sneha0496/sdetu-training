package Basics;

public class FactorialApp {

	public static void main(String[] args) {
		//0 = 0
		// 1! = 1
		//2! = 1!*2
		//3! = 2!*3
		//4! = 3!*4
		// i = 4
		System.out.println(factorial(4));
	}
	
	public static int factorial(int n) {
		if (n == 0) {
			return 0;
		}
		else if (n ==1) {
			return 1;
		}
		else
		{
				return (n * (factorial(n-1)));
		}
	}

}
