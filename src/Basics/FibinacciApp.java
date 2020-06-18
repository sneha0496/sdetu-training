package Basics;

public class FibinacciApp {

	public static void main(String[] args) {
		//Fibonacci sequence is achieved by the sum of the two previous two fibonacci numbers
		//fib0 = 0
		//fib1 = 1 = 1
		//fib2 = 0+1 = 1
		//fib3 = fib2 +fib1 = 1+1 = 2
		//fib4 = fib3 +fib2 = 2+1 = 3
		//fib5 = fib4 +fib3 = 3+2 = 5
		//fib6 = fib5 +fib4 = 5+3 = 8
		System.out.println(fib(6));
	}
	
	public static int fib(int n) {
		if (n == 0) 
		{
			return 0;
		}
		else if (n == 1)
		{
			return 1; 
		}
		return (fib(n-1)+ fib(n-2));
	}
} 
	
