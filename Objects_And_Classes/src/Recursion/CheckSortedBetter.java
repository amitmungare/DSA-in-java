package Recursion;

public class CheckSortedBetter {
	
	private static boolean checkSortedbetter(int input[],int si) {
		
		if(si ==input.length-1) {
			return true;
		}
		
		if(input[si]>input[si+1]) {
			return false;
		}			
		
		return checkSortedbetter(input,si+1);
	}
	
	private static boolean checkSortedbetter(int input[]) {
		return checkSortedbetter(input,0);
	}

	public static void main(String[] args) {
		int input[]= {1,2,3,4,5};
		System.out.println(checkSortedbetter(input));
	}

}
