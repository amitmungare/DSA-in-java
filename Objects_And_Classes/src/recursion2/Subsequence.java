package recursion2;

public class Subsequence {
	
    private static String[] findSubsequences(String str) {
		
    	if(str.length()==0) {
    		String a[] = {""};
    		return a;
    	}
    	
    	String smallAns[] = findSubsequences(str.substring(1));
    	String a[] = new String[2* smallAns.length];
    	
    	int k=0;
    	for(int i=0;i<smallAns.length;i++) {
    		a[k]=smallAns[i];
    		k++;
    	}
    	
    	for(int i=0;i<smallAns.length;i++) {
    		a[k]=str.charAt(0)+smallAns[i];
    		k++;
    	}
    	return a;
	}

	public static void main(String[] args) {
		
		String str = "xyz";
		String a[] = findSubsequences(str);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

	

}
