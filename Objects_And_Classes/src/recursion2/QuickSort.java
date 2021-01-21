package recursion2;

public class QuickSort {
	
	public static void quickSort(int a[], int si, int ei) {
		if(si >= ei) {
			return;
		}
		
		int pivotPos =partition(a,si,ei);
		quickSort(a, si, pivotPos-1);
		quickSort(a, pivotPos+1, ei);
	}

	private static int partition(int[] a, int si, int ei) {
		
		int count =0;
		int pivot = a[si];
		for(int i=si+1;i<=ei;i++) {
			if(a[i] <= pivot)
			{
				count++;
			}
		}
		
		int pivotPos = si+count;
		int temp = a[pivotPos];
		a[pivotPos] = a[si];
		a[si] = temp;
		
		
		int i=si;
		int j=ei;
		
		while(i<pivotPos && j>pivotPos) {
			if(a[i] <= pivot) {
				i++;
			}else if(a[j] > pivot) {
				j--;
			}else {
				temp =a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
		}
		return pivotPos;
	}
	
	public static void quickSort(int[] input) {
		
		quickSort(input, 0 , input.length-1);
	}
	
	

	public static void main(String[] args) {
		
		int a[]= {6,4,2,3,1,5};
		quickSort(a);
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
