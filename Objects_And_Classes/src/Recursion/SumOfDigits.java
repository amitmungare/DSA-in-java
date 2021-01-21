package Recursion;

public class SumOfDigits {
	
	public static int sum(int n) {
		if(n == 0) {
			return 0;
		}
		int var = n%10;
		int sans = sum(n/10)+var;

		return sans;
	}

	public static void main(String[] args) {
		
		int num=1234;
		System.out.println(sum(num));
		
	}

}
