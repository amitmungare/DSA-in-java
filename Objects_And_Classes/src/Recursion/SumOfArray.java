package Recursion;

public class SumOfArray {
	
	public static int sum(int input[]) {
		
		int last = input[input.length-1];
		
		if(input.length <=1) {
			return input[0];
		}
		
		int smallInput[] =new int[input.length - 1];
		
		for(int i=0 ;i<input.length-1;i++) {
			smallInput[i] = input[i];
		}
		
		return sum(smallInput) + last;		
		
		
		
//		or
		
		
		
//		if(input.length==0){
//            return 0;
//        }
//        int temp = input[0];
//        
//        int arr[] = new int[input.length-1];
//		for(int i=1;i<input.length;i++){
//			arr[i-1]=input[i];
//		}
//       
//        int ans= sum(arr)+temp;
//        return ans;
		
		
	}

	public static void main(String[] args) {

		int input[]= {9,8,9};
		System.out.println(sum(input));
	}

}
