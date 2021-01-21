package recursion2;

public class Staircase {
	
	public static int staircase(int n){
		
		if(n<0) {
			return 0;
		}
		
		if(n==0) {
			return 1;
		}else {
			return staircase(n-1)+ staircase(n-2)+ staircase(n-3);
		}

	}

	public static void main(String[] args) {
		
		int n=4;
		System.out.println(staircase(n));
		
	}

}
