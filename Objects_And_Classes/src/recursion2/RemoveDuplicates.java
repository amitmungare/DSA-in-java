package recursion2;

public class RemoveDuplicates {	
	
	public static String removeConsecutiveDuplicates(String str,int si) {
		
		if(si >=str.length()-1) {
			return str.charAt(si)+"";
		}
		
		if(str.charAt(si) == str.charAt(si+1)) {
			return removeConsecutiveDuplicates(str,si+1);
		}
		return str.charAt(si)+removeConsecutiveDuplicates(str,si+1);
		
		
//		using substring
		
//		if(str.length()-1 <=0){
//			return str.charAt(si)+"";
//		}
//		
//		if(str.charAt(0)==str.charAt(1)) {
//			return removeConsecutiveDuplicates(str.substring(si+1));
//		}
//		return str.charAt(0)+removeConsecutiveDuplicates(str.substring(si+1));
		
		
	}
	

	public static String removeConsecutiveDuplicates(String str) {
		return removeConsecutiveDuplicates(str,0);

	}
	
	public static void main(String[] args) {
		
		String s="xxxyyyzww";
		System.out.println(removeConsecutiveDuplicates(s));
	}

}
