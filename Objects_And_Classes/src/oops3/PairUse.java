package oops3;

public class PairUse {

	public static void main(String[] args) {
		
		Pair<Integer,Integer> p = new Pair(1, 2);
		p.setFirst(23);
		p.setSecond(43);
		
		int s=p.getfirst();
		int r=p.getsecond();
		
		System.out.println(s +" " + r);
		
		
		
		Pair<String,Integer> p1 = new Pair("amit", 24);
		p1.setFirst("good");
		p1.setSecond(32);
		
		String s1=p1.getfirst();
		int r1=p1.getsecond();
		
		System.out.println(s1 +" " + r1);
	}

}
