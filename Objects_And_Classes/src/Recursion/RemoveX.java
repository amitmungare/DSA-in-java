package Recursion;

public class RemoveX {
	
	public static String removeX(String str,int si){
	
//		if(si >=str.length()) {
//			return "";
//		}
//		
//		if(str.charAt(si)!='x') {
//			return str.charAt(si)+removeX(str,si+1);			
//		}		
//		return removeX(str,si+1);
		
		
		
		
////		using substring
		
		if(str.length()<=1) {
			return "";
		}
		
		if(str.charAt(si) != 'x') {
			return str.charAt(si)+removeX(str.substring(si+1));
		}
		return removeX(str.substring(si+1));
	     
		
	}
	
	
	
	public static String removeX(String input){
		return removeX(input,0);
	}


	public static void main(String[] args) {
		
		String s="xbxxax";
		System.out.println(removeX(s));
		
		
	}

}
