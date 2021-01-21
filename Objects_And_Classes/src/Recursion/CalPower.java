package Recursion;

public class CalPower {
	
	public static int Solution(int x, int n) {
		
		if(n==0) {
			return 1;
		}		
		return x * Solution(x,n-1);
	}

	public static void main(String[] args) {
		
		int x=3;
		int n=4;		
		System.out.println(Solution(x, n));
	}

}
