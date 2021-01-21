package recursion2;

public class PrintKeypadCombinationCode {
	
	
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
	private static void printKeypad(int n,String s) {
	
		if(n==0) {
			System.out.println(s);
			return;
		}
		
		String anshelp[] = digit(n%10);
		
		if(anshelp.length ==3) {
			printKeypad(n/10,anshelp[0]+s);
			printKeypad(n/10,anshelp[1]+s);
			printKeypad(n/10,anshelp[2]+s);
		}else {
			
			printKeypad(n/10,anshelp[0]+s);
			printKeypad(n/10,anshelp[1]+s);
			printKeypad(n/10,anshelp[2]+s);
			printKeypad(n/10,anshelp[3]+s);
		}
	
	}

	private static void printKeypad(int n) {
	
		printKeypad(n,"");
		return;
	
	}
	

	public static void main(String[] args) {
	
		int n = 23;
		printKeypad(n);
		
		
	}



	

}
