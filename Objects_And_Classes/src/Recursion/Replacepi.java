package Recursion;

public class Replacepi {
	
	public static String replace(String str, int si ){
		
		
//		using substring
		
		if(si == str.length()) {
			return "";
		}
		if(str.charAt(0)=='p' && str.length()>=2 && str.charAt(1)=='i') {
			return "3.14" + replace(str.substring(si+2));
		}
			return str.charAt(0)+replace(str.substring(si+1));
		
	}
	
	public static String replace(String input){
		return replace(input,0);
	}

	public static void main(String[] args) {
	
		String s="ppip";
		System.out.println(replace(s));
	}

}
