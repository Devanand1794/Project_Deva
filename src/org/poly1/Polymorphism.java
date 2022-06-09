package org.poly1;

public class Polymorphism {
	
	private void name(String a) {
		System.out.println("My name is" +a);
		
	}

      private void age(int b) {
	System.out.println("My age is" +b);
	
}
	
	private void gender(char M) {
		System.out.println("My gender is" +M);

	}
	
	private void companyName(String d, float e) {
		System.out.println("My company name is "+d+"\n"+"My salary is "+e);

	}
	
	private void mobileNum(float f, String g) {
	System.out.println("My Salary is"+f+"\n"+"My Name is"+g);

	}
	
	private void mobileNum(float h, String j, long i) {
		System.out.println("My salary is "+h+"\n"+"My name is "+j+"\t"+"My Mobile Number is "+i );

	}
	public static void main(String[] args) {
		
	
	Polymorphism deva=new Polymorphism();
	deva.name("Dev Anand");
	deva.age(27);
	deva.gender('M');
	deva.companyName("Wipro", 57865.6886F);
	deva.mobileNum(4565.6565F, "DEva");
	deva.mobileNum(5655.455F, "Devanand", 8610374044L);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
