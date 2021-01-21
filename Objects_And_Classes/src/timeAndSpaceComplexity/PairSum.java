package timeAndSpaceComplexity;

public class PairSum {

	public static int pairSum(int[] arr, int num) {
		
		int count =0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<i ;j++) {
				if(arr[i] + arr[j] ==num) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7};
		System.out.println(pairSum(a,6));
		
		
	}

}
