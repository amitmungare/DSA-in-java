package Recursion;

public class StringTiInt {
	
	public static int convertStringToInt(String str, int si){		
		
		if(si <= 0 ) {
			return str.charAt(si)-'0' ;
		}					
		int b = str.charAt(si) - '0';
		
		return convertStringToInt(str,si-1)*10 +b;				
		
	}	
	
	
	public static int convertStringToInt(String input){		
		return convertStringToInt(input,input.length()-1);		
	}

	public static void main(String[] args) {
		String input = "0001234567";
		System.out.println(convertStringToInt(input));
	}

}
