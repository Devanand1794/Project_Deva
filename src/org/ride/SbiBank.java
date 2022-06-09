package org.ride;

public class SbiBank extends RbiBank {
	
	@Override
	public void saving() {
		System.out.println("My saving is 23%");
	}
	@Override
	public void current() {
		System.out.println("My current is 44%");
	}
	@Override
	public void fixed() {
		System.out.println("My fixed is 32%");
	}
	
	private void loan() {
		System.out.println("My Loan is 1%");

	}
	public static void main(String[] args) {
		
		SbiBank d=new SbiBank();
		
		d.saving();
		d.current();
		d.fixed();
		d.loan();
		
		
		
		RbiBank d1=new RbiBank();
		d1.saving();
		d1.current();
		d1.fixed();
		
		RbiBank d2=new SbiBank();
		d2.saving();
		d2.current();
		d2.fixed();
	}
	
	
}
