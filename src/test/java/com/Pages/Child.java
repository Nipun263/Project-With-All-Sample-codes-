package com.Pages;

import net.bytebuddy.implementation.bind.annotation.Super;

public class Child extends Parent{
	
	
	
	
	void M2() {
		super.M1();
		System.out.print(super.a);
		System.out.print("M2-Child");
	}
	
	
	
	void M3() {
		super.M4();
		System.out.println(super.b);
	}
	
	void M5() {
		System.out.println("Child_M5");
	}
	
	
	public static void main(String[] args) {
		
		Parent PP = new Child();
		Child CB = (Child)PP;//Downcating 
		//Child ki class ka refernce use karke parent ke object (method ko access karna and that too jo overridden ho
	CB.M5();
		
		
	}

}
