package timeAndSpaceComplexity;

public class TripletSum {
	
	public static int tripletSum(int[] arr, int num) {
		int count =0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				for(int k=0;k<j;k++) {
					if(arr[i]+arr[j]+arr[k]==num) {
						count++;
					}
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
	
		int a[] = {1,2,3,4,5,6,7};
		System.out.println(tripletSum(a,6));
		
		
	}

}
