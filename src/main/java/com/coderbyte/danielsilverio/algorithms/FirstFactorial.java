package com.coderbyte.danielsilverio.algorithms;

import java.util.Scanner;

public class FirstFactorial {

	public static int FirstFactorial(int num) { 
		
		if( num < 0 )
			throw new IllegalArgumentException();
		
		int factorResult = num;
		for (int i = num; i > 1; i--) {
			factorResult = factorResult * (i - 1);
		}
		return factorResult;
	} 

	public static void main (String[] args) {  
		// keep this function call here     
		Scanner s = new Scanner(System.in);
		System.out.print(FirstFactorial(Integer.parseInt(s.nextLine()))); 
	}   

}
