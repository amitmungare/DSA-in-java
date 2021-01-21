package Recursion;

public class CountZerosRec {
	
	public static int countZerosRec(int input){

//		if(input == 0){
//				return 0;
//		}
//		
//		int count= countZerosRec(input/10);
//        	if(input%10==0){
//        		 count++;
//        	}        	
//            return count;	
		
		
		if(input<10) {
			if(input==0)return 1 ;
			else return 0;
		}
		if(input%10==0) {
			return countZerosRec(input/10)+1;
		}
		else
			return countZerosRec(input/10);
		
		
	
	
//	if(n==0) {
//		return 0;
//	}
//	
//	int count =sol(n/10);
//	
//	if(n%10 == 0) {
//		count++;
//	}
//	return count;

	}
		
	public static void main(String[] args) {
		
		int n=0;
		System.out.println(countZerosRec(n)); 
		
	}
}

