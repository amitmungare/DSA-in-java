package Recursion;

public class FristPositionOfElement {
	
	public static int firstIndex(int input[], int x,int si) {
		
		
		if(si >= input.length-1) {
			return -1;
		}
		
		if(input[si] == x) {
			return si;
		}
		
		return firstIndex(input,x,si+1);
		
	}
	
	
	public static int firstIndex(int input[], int x) {
		return firstIndex(input,x,0);
	}

	public static void main(String[] args) {
		
		int arr[]= {9,8,4,8};
		System.out.println(firstIndex(arr,8));
	}
}
