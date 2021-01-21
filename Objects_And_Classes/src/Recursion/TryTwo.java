package Recursion;

public class TryTwo {
	
	
	public static int firstindex(int n[],int x,int si) {
		
		if(si == n.length) {
			return -1;
		}
		
		if(n[si] == x) {
			return si;
		}
		
		return firstindex(n,x,si+1);
	}

	public static void main(String[] args) {
		
//		int n=4;
//		
//		int pow=1;		
//		for(int i=0;i<n;i++) {
//			pow*=2;
//		}
//		System.out.println(pow);
		
		
		int n[]= {4,3,4,6,3,4,6};
		int x=44;
		int si=0;
		System.out.println(firstindex(n,x,si));
	}

}
