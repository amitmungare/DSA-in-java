package timeAndSpaceComplexity;

public class CheckArrayRotation {
	
	  public static int arrayRotateCheck(int[] a){
	    	
		  int small = Integer.MAX_VALUE;
		  int rot=0;
		  
		  for(int i=0;i<a.length;i++) {
			  if(a[i]<small) {
				  small=a[i];
				  rot=i;
			  }
		  }
		  return rot;
	  }

	public static void main(String[] args) {
		
		int a[] = {5,6,1,2,3,4};
		System.out.println(arrayRotateCheck(a));
		
	}

}
