package recursion2;

public class PrintSubsequences {
	
	public static void printSubseq(String a, String op) {
		if(a.length()==0) {
			System.out.println(op);
			return;
		}
		printSubseq(a.substring(1), op);
		printSubseq(a.substring(1), op+a.charAt(0));
		
	}

	public static void printSubseq(String a) {
		printSubseq(a,"");
	}
	
	public static void main(String[] args) {
		printSubseq("xyz");
	}

}
