package Recursion;

public class FibonacciNumbers {

	public static int fib(int n) {
		
		if(n==0 || n==1) {
			return n;
		}
		
		
		return (n-1)+(n-2);
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(fib(5));
		
	}

	

	
	
	
	
	
	
}
