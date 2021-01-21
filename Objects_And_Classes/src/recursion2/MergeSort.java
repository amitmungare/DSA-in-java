package recursion2;

public class MergeSort {
	
	public static void mergesort(int a[],int si,int ei) {
		
		if(si >=ei) {
			return;
		}
		
		int mid =(si+ei)/2;
		
		mergesort(a, si, mid);
		mergesort(a,mid+1, ei);
		merge(a,si,ei);
	}

	public static void merge(int a[],int si,int ei) {

		int mid =(si+ei)/2;		
		int ans[] = new int[ei -si +1];
		int i=si;
		int j=mid+1;
		int k=0;
		
		while(i<=mid && j<=ei) {
			if(a[i]<a[j]) {
				ans[k]=a[i];
				i++;
				k++;
			}else {
				ans[k]=a[j];
				j++;
				k++;
			}
		}
		
		while(i <= mid) {
			ans[k]=a[i];
			i++;
			k++;
		}
		while(j <= ei) {
			ans[k]=a[j];
			j++;
			k++;
		}
		
		for(int q=0;q<ans.length;q++) {
			a[si+q] = ans[q];
		}
		return;
	}
	
	public static void mergesort(int[] a) {
		mergesort(a, 0, a.length-1);
	}
	
	public static void main(String[] args) {
		
		
		int a[] = {2,6,8,5,4,3};

		mergesort(a);
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
