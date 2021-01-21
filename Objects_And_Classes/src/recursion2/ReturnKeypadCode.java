package recursion2;

public class ReturnKeypadCode {

	public static String[] digit(int n) {
		
		String[] s= {""};
		if(n<=1 || n>10) {
			return s;
		}
		
		switch(n) {
		case 2:
			String[] op2 = {"a" , "b" , "c"};
			return op2;
		case 3:
			String[] op3 = {"d" , "e" , "f"};
			return op3;
		case 4:
			String[] op4 = {"g" , "h" , "i"};
			return op4;
		case 5:
			String[] op5 = {"j" , "k" , "l"};
			return op5;
		case 6:
			String[] op6 = {"m" , "n" , "o"};
			return op6;
		case 7:
			String[] op7 = {"p" , "q" , "r", "s"};
			return op7;
		case 8:
			String[] op8 = {"t" , "u" , "v"};
			return op8;
		case 9:
			String[] op9 = {"w" , "x" , "y", "z"};
			return op9;
		default:
			 return s;
		}
		
	}
	
	public static String[] key(int n) {
		
		if(n==0) {
			String[] a = {""};
			return a;
		}
		String last[] = digit(n%10);
		String dig[] = key(n/10);
		String newans[] = new String[dig.length*last.length];
		
		int k=0;
		
		for(int i=0;i<dig.length;i++) {
			for(int j=0;j<last.length;j++) {
				newans[k] = dig[i]+last[j];
				k++;
			}
		}
		
		return newans;
		
	}
	
	
	public static void main(String[] args) {
		
		int n = 23;
		String a[] = key(n);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
