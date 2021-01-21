package recursion2;

public class CheckAB {
	
	
	private static boolean checkAB(String a) {
		
		
//		Using substring
		
		if(a.length()==0) {
			return true;
		}
		if(a.charAt(0) == 'a') {
			if(a.substring(1).length()>1 && a.substring(1,3).equals("bb")) {
				return checkAB(a.substring(3));
			}else {
				return checkAB(a.substring(1));
			}
		}
		return false;
		
		
		
		
		
//		if(si >=a.length()-1) {
//			return true;
//		}
//		
//		if(a.charAt(0) =='a') {
//		
//			if(a.charAt(si)=='a'  && a.charAt(si+1)=='a') {				
//				
//				return true;
//			}
//			else if(a.charAt(si)=='a'  && a.charAt(si+1)=='b' && a.charAt(si+2)=='b' && a.charAt(si+3)!='b'){
//				
//				return true;
//			}
//			else if(a.charAt(si)=='b'  && a.charAt(si+1)=='b' && a.charAt(si+2)=='a'){
//				
//				return true;
//			}
//			
//		}
//		checkAB(a,si+1);
//		return false;
	
		
		
		
		
	}

//	public static boolean checkAB(String input) {
//		return checkAB(input,0);
//	}
//	
	public static void main(String[] args) {
		
		String a = "abbbabaaa";
		System.out.println(checkAB(a));
	}


}
