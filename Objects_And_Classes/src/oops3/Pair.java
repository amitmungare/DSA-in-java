package oops3;

public class Pair<t,s> {

	private t first;
	private s second;
	
	public Pair(t first , s second) {
		this.first = first;
		this.second = second;
	}
	
	public t getfirst() {
		return first;
	}
	
	public s getsecond() {
		return second;
	}
	
	public void setFirst(t first) {
		this.first=first;
	}
	
	public void setSecond(s second) {
		this.second=second;
	}
	
}
