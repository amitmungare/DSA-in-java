package recursion2;

public class BinarySearch {
	
	public static int binarySearch(int input[],int first, int last, int s) {
	
		if(first >last) {
			return -1;
		}
		
		int mid = (first+last)/2;
		
		if(input[mid] ==s) {
			return mid;
		}
		
		else if(input[mid] >s) {
			return binarySearch(input, first,mid-1,s);
		}else {
			return binarySearch(input, mid+1, last, s);
		}
		
	}

	public static int binarySearch(int input[], int element) {
		return binarySearch(input,0,input.length-1,element);

	}
	
	
	
	public static void main(String[] args) {
		
		int a[] = {2,3,4,5,6,8};
		int s=5;
		System.out.println(binarySearch(a,s));
	}

}
