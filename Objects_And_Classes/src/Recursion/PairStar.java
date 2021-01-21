package Recursion;

public class PairStar {
	
	public static String addStars(String s, int si) {
		
//		if(si >= s.length()-1) {
//			return s.charAt(si)+"";
//		}
//		
//		if(s.charAt(si) == s.charAt(si+1)) {
//			return s.charAt(si)+"*"+addStars(s,si+1);
//			
//		}else {
//			return s.charAt(si)+addStars(s,si+1);			
//		}

		
////		using string
		
		if(si >=s.length()-1) {
			return s;
		}
		
		if(s.charAt(0) == s.charAt(1)) {
			return s.charAt(0)+"*"+addStars(s.substring(si+1));
		}
		return s.charAt(0)+addStars(s.substring(si+1));
		
	
	}
	
	public static String addStars(String s) {
		return addStars(s,0);
	}

	public static void main(String[] args) {

		String s="aaaa";
		System.out.println(addStars(s));
		
	}

}
