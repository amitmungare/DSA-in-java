package Recursion;

public class SumOfNaturalNumbers {
	
	
	public static int sum(int n) {
		
		if(n==1) {
			return 1;
		}
		
		int sans =sum(n-1);
		return n+sans;
	}

	public static void main(String[] args) {
	
		System.out.println(sum(10));
	}

}
