package Recursion;

public class MultiplyTwoIntegers {
	
	public static int multiplyTwoIntegers(int m, int n) {
		
		 if(n == 0){				
	            return 0;
	     }	        
	     return m+multiplyTwoIntegers(m,n-1);
		
	}

	public static void main(String[] args) {
		
		int m=4;
		int n=5;
		
		System.out.println(multiplyTwoIntegers(m,n));
		
	}

}
