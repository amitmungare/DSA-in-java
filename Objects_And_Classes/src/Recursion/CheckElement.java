package Recursion;

public class CheckElement {

	public static boolean checkNumber(int input[], int x) {
//
//		int last = input[input.length-1];
//		
//		if(input.length <= 1) {
//			if(last==x) {
//				return true;
//			}	
//			return false;			
//		}
//		
//		int smallInput[] =new int[input.length - 1];		
//		for(int i=0 ;i<input.length-1;i++) {
//			smallInput[i] = input[i];
//		}
//		
//		if(last==x) {
//			return true;
//		}
//		return checkNumber(smallInput,x);		
		
		
//		or
		
//		if(input.length==0){
//            return false;
//        }
//        int temp = input[0];
//        if(temp==x){
//        return true;
//        }
//        
//           int arr[] = new int[input.length-1];
//		for(int i=1;i<input.length;i++){
//			arr[i-1]=input[i];
//		}
//        
//        boolean ans = checkNumber(arr,x);
//        return ans;
		
		
//		OR my try
		
		if(input.length==0)return false;
		
		int first = input[0];
		
		if(first==x)return true;
		
		int sa[]=new int[input.length-1];
		for(int i=1;i<input.length;i++) {
			sa[i-1]=input[i];
		}
		
		return checkNumber(sa,x);
		
	}
	
	public static void main(String[] args) {
		
		int arr[]= {1,9,8,6,7,3};
		System.out.println(checkNumber(arr,8));
	}

}
