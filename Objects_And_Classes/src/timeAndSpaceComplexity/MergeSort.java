package timeAndSpaceComplexity;

public class MergeSort {
	
	public static void mergeSort(int[] a, int si, int ei) {
		
		if(si >= ei) {
			return;
		}
		
		int mid=(si+ei)/2;
		
		mergeSort(a,si,mid);
		mergeSort(a, mid+1, ei);
		merge(a,si,ei);
	}

	public static void merge(int[] a, int si, int ei) {
		
		int mid =(si+ei)/2;
		int ans[] = new int[ei-si+1];
		int i=si;
		int j=mid+1;
		int k=0;
		
		while(i<=mid && j<=ei) {
			
			if(a[i]<a[i]) {
				ans[k] =a[i];
				i++;
				k++;
			}else {
				ans[k]=a[j];
				j++;
				k++;
			}
		}
		
		while(i<=mid) {
			ans[k]=a[i];
			i++;
			k++;
		}
		while(j<=mid) {
			ans[k]=a[j];
			j++;
			k++;
		}
		
		for(int l=0;l<ans.length;l++) {
			a[si+l] = ans[l];
		}
		return;
	}

	public static void main(String[] args) {
		
		for(int n=10; n<= 10000000 ; n=n*10) {
			int a[] = new int[n];
			
			for(int i=0;i<a.length;i++) {
				a[i]= a.length-i;
			}
			
			long startTime = System.currentTimeMillis();
			mergeSort(a,0,a.length-1);
			long endTime = System.currentTimeMillis();
			System.out.println("Time : " + n + " = " +(endTime-startTime));
			
		}	
	}	
}
