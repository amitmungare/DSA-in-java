package Recursion;

public class LastIndexOfNumber {
	
	public static int[] allIndexes(int input[], int x,int si) {

		if(si==input.length) {
			int  a[] = new int[0];
			return a;
		}
		
		int sarr[]=allIndexes(input,x,si+1);
		
		if(input[si]==x) {
			
			int newarr[] = new int[sarr.length+1];
			
			newarr[0]=si;
			for(int i=0;i<sarr.length;i++) {
				newarr[i+1]=sarr[i];
			}
			return newarr;
		}	
		return sarr;
	}
	
	
	public static int[] allIndexes(int input[], int x) {
		return allIndexes(input,x,0);
	}

	public static void main(String[] args) {
		
		int arr[]= {8,4,5,8,3,8,8};
		int a[] = allIndexes(arr,8);
		for(int e:a) {
			System.out.print(e+" ");
		}

		
	}

}
