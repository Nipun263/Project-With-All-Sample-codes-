package com.Pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayAndArrayList {
	
	
	
	public void ARR() {
		ArrayList<Object> AA = new ArrayList<Object>();
		AA.add("Volwo");
		AA.add("Toyota");
		AA.add("Kia");
		AA.add("Maruti");
		
		
		int size = AA.size();
		
		for ( int i = 0 ; i <= size ; i ++) {
			String value = AA.get(i).toString();
			String value1 = AA.get(i).toString();
		}
		
			Iterator<Object> IT = AA.iterator();
			IT.hasNext();
			
			IT.next();
		
	}
	
	
	public void Pyramid() {
		
		for (int i = 0 ; i <=10 ; i ++) {
			for (int j = 0 ; j <i ; j ++) {
				
				System.out.print(" " + "*");
			}
			System.out.println();
			}
		}
		
	
	public void mergeArrays() {
		int[] a = {1,3,5,7,9};
		int[] b = {22,44,78,90};
		
		int a1 = a.length;
		int b1= b.length;
		
		int[] c = new int[a1 + b1];
		
		System.arraycopy(a, 0, c, 0, a1);  
		System.arraycopy(b, 0, c, a1, b1);  
		
		System.out.println(Arrays.toString(c));
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		ArrayAndArrayList DD = new ArrayAndArrayList();
		//DD.ARR();
		//DD.Pyramid();
		DD.mergeArrays();
		
	}

}
