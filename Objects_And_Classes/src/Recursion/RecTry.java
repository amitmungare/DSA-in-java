package Recursion;

public class RecTry {
	
	public static double sol(int k) {
		
//		if(n==0) {
//			return 0;
//		}
//		
//		int count =1+sol(n/10);
//		return count;
		
		
//	if(n==0) {
//		return 0;
//	}		
//	return m+sol(m,n-1);
		
		
//		if(n==0) {
//			return 1;
//		}
//		return m*sol(m,n-1);
		
		
//		if(n==0) {
//			return 0;
//		}
//		
//		int count =sol(n/10);
//		
//		if(n%10 == 0) {
//			count++;
//		}
//		return count;
		
		
		
//		if(n==0) {
//			return 0;
//		}
//		
//		int val = n%10;
//		
//		return val+sol(n/10);
		
		
		if(k==0) {
			return 1;
		}
		double pow=1;		
		for(int i=0;i<k;i++) {
			pow*=2;
		}
		
		return 1/pow + sol(k-1);
		
	}

	public static void main(String[] args) {
		
		int n=4;
		int m=4;
		System.out.println(sol(n));
//		System.out.println(sol(n,m));
	}

}
