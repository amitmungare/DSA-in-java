package timeAndSpaceComplexity;

public class FindUniqueElement {
	
	public static int findUnique(int a[]) {
		
		int num=0;
		for(int i=0;i<a.length;i++) {
			num^=a[i];
		}
		return num;
	}

	public static void main(String[] args) {
		
		int a[] = {1,3,2,4,3,2,1};
		
		System.out.println(findUnique(a));
	}

}
