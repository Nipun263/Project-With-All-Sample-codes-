package com.Pages;

public class StringLength {
	
	
	public static int  calculateStringLength() {
		String input = "Hello My name is Nipun";
		
		
		 char charArray[] = input.toCharArray();
		 int length = 0 ; 
		 
		 for (char c : charArray) {
			 length++;
		 }
		 return length ;
		
	}
	
	
	
	public static void main(String[] args) {
		StringLength SL =  new StringLength();
		SL.calculateStringLength();
		
		System.out.println("Length of String Passed = "   +  calculateStringLength());
		
		

}
}