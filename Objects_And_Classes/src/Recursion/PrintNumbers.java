package Recursion;

public class PrintNumbers {	

//  1) print numbers 1 2 3 4 5
//	public static void print(int n) {	
//		if(n==1) {
//			System.out.print(n+" ");
//			return;
//		}
//		print(n-1);
//		System.out.print(n+" ");
//				
//	}
//
//	public static void main(String[] args) {	
//	print(4);			
//	}
	

	
//	2) print numbers 0 1 2 3 
//	public static void print(int n){
//	    if(n < 0){
//	        return;
//	    }
//	    if(n == 0){
//	        System.out.print(n+ " ");
//	        return ;
//	    }
//	    print(n-1);
//	    System.out.print(n+" ");
//	}
//
//	public static void main(String[] args) {
//	    int num = 3;
//	    print(num);
//	}
	
	
	
//	3)printing odd numbers 1 3 5 7 9
	 public static void print(int n){
		    if(n < 0){
		        return;
		    }
		    print(n - 2);
		    System.out.print(n+" ");
		    }

		    public static void main(String[] args) {
		    int num = 5;
		    print(num);
		    }
	
	
}
