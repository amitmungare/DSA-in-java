package Recursion;

public class CheckPalindrome {
	
	public static boolean isStringPalindrome(String str,int s, int e) {
		
//		if(s>=e) {
//			return true;
//		}
//		
//		if(str.charAt(s) != (str.charAt(e))) {
//			return false;
//		}
//				
//		return isStringPalindrome(str,s+1,e-1);
		
	
		
		
//		using substring
		
		if(str.length()<=1) {
			return true;
		}
		
		if(str.charAt(0) != str.charAt(e-1)) {
			return  false;
		}
		return isStringPalindrome(str.substring(s+1,e-1));

	}
	
	
	
	public static boolean isStringPalindrome(String str) {
		return isStringPalindrome(str,0,str.length());
	}

	public static void main(String[] args) {
	
		String ans = "racecar";
		
		System.out.println(isStringPalindrome(ans));		
		
	}

}
