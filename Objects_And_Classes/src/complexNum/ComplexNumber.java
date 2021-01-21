package complexNum;

public class ComplexNumber {

	private int real;
	private int imaginary;
	
	
	public ComplexNumber(int real, int imaginary) {
		this.real=real;
		this.imaginary=imaginary;
		
	}
	
	public int getImaginary() {
		return imaginary;
	}
	
	
	public int getReal() {
		return real;
	}
	
	
	public void setReal(int real) {
		this.real=real;
	}
	
	
	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}
	
	
	public void print() {
		System.out.println(real +" + i"+imaginary);
	}
	
	
	public void plus(ComplexNumber c2) {		
		this.real =this.real +c2.real;
		this.imaginary = this.imaginary +c2.imaginary;
	}
	
	
	public void multiply(ComplexNumber c2) {
	
		int a = this.real * c2.real;
		int b = this.real * c2.imaginary;
		int c = this.imaginary * c2.real;
		int d = this.imaginary * c2.imaginary;
		
		this.real = a-d;
		this.imaginary = b+c;
	}
	
	
	public ComplexNumber conjugate() {
		return null;
		
	}
	
	
	public static ComplexNumber add(ComplexNumber c2, ComplexNumber c3) {
		return c3;
		
	}
	
	
	
	
}
