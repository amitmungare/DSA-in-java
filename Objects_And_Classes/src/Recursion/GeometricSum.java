package Recursion;

public class GeometricSum {
	
	public static double findGeometricSum(int k){
		
		if(k==0) {
			return 1;
		}
		double pow=1;		
		for(int i=0;i<k;i++) {
			pow*=2;
		}
		
		return 1/pow + findGeometricSum(k-1);
			
	}

	public static void main(String[] args) {
		
		int n=4;
		System.out.println(findGeometricSum(n));
			
		
	}

}
