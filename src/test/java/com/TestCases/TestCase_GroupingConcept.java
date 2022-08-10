package com.TestCases;

import org.testng.annotations.Test;

public class TestCase_GroupingConcept {
	
	
		@Test(groups="SmokeTest")
		public void TestCase_1() {
	
			System.out.println("Test Case 1");
		}
		
	
		@Test(groups={"RegressionTest , SmokeTest"})
		public void TestCase_2() {
	
			System.out.println("Test Case 2");
		}
	
		
		@Test(groups="SmokeTest")
		public void TestCase_3() {
	
			System.out.println("Test Case 3");
		}
		
	
		@Test(groups="RegressionTest")
		public void TestCase_4() {
	
			System.out.println("Test Case 4");
		}
		
		
		@Test(groups="SanityTest")
		public void TestCase_5() {
	
			System.out.println("Test Case 5");
		}
		
		
		@Test
		public void TestCase_6() {
	
			System.out.println("Test Case 6");
		}
		
	
		@Test(groups="SanityTest")
		public void TestCase_7() {
	
			System.out.println("Test Case 7");
		}
		

}
