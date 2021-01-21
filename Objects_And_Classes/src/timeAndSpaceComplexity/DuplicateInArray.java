package timeAndSpaceComplexity;

public class DuplicateInArray {

	public static void main(String[] args) {
		
		int a[] = {0,1,2,3,4,5,1};
		
		System.out.println(findUnique(a));
		
	}

	private static int findUnique(int[] a) {
		
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}

		int n=a.length;
		int num=((n-2)*(n-1))/2;
		
		return sum-num;
	}

}
