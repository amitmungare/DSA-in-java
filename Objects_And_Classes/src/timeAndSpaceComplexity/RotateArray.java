package timeAndSpaceComplexity;

public class RotateArray {
	
//	public static int[] rot(int[] a,int si, int ei) {
//		
//		int j=ei;
//		int n=(si+ei)/2;
//		
//		for(int i=si;i<=n;i++){		
//			 int temp =a[i];
//			 a[i] = a[j];
//			 a[j] = temp;
//			 j--; 
//		}		
//		return a;
//	}
//
//	 public static int[] rotate(int[] a, int d) {
//		 
//	
//	    
//		 rot(a,0,a.length-1);
//		 rot(a,0,a.length-1-d);
//		 rot(a,a.length-d,a.length-1);
//		 
//		 return a;
//		 
//	 }
	
	
	 public static void rotate(int[] arr, int d) {
		 
		 int n=arr.length;
		 int a[]=new int[n];
		 
		 for(int i=0;i<n;i++) {
			 a[i] =arr[i];
		 }
		 
		 for(int i=0;i<n-d;i++) {
			 arr[i] = a[i+d];
		 }
		 
		 int j=0;
		 for(int i=n-d;i<n;i++) {
			 arr[i] = a[j];
			 j++;
		 }
		 
	 }

	
	
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7};
		rotate(a,2);

		for(int i:a) {
			System.out.print(i+" ");
		}
	}

}
