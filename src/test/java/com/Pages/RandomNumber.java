package com.Pages;

import java.util.Random;

public class RandomNumber {
	
	
	public void generateRNum() {
		
		Random RN = new Random();
		
		int randomInt = RN.nextInt(10);
		int ii = 11;
		
		String randomString  = Integer.toString(randomInt);
		System.out.println(randomString);
	}

	
	public static void main(String[] args) {
		RandomNumber RR = new RandomNumber();
		RR.generateRNum();
	}
}
