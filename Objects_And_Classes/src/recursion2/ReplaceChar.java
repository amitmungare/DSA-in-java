package recursion2;

public class ReplaceChar {
	
	public static String replaceCharacter(String str, char a, char b, int si) {
		
		if(si >=str.length()) {
			return "";
		}

		if(str.charAt(si) != a) {
			return str.charAt(si)+replaceCharacter(str, a, b,si+1);
		}else {
			return b+replaceCharacter(str, a, b,si+1);
		}
		
		
////		using substring
		
//		if(str.length() ==0){
//			return "";
//		}
//		
//		if(str.charAt(0) !=a) {
//			return str.charAt(0)+replaceCharacter(str.substring(si+1),a,b);
//		}
//		return b+replaceCharacter(str.substring(si+1), a, b);
		
	}
	
	public static String replaceCharacter(String str, char a, char b) {
		
        return replaceCharacter(str, a, b, 0);

	}

	public static void main(String[] args) {
		
		String s= "abacda";
		char a='a';
		char b='x';
		System.out.println(replaceCharacter(s, a, b));
	}

}
