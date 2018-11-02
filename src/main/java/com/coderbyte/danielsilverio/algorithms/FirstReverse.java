package com.coderbyte.danielsilverio.algorithms;

import java.util.Scanner;

public class FirstReverse {

	public static String FirstReverse(String str) { 
		String reverseWord = new String();
		for (int i = str.length() - 1 ; i >= 0; i--) {
			reverseWord = reverseWord.concat( String.valueOf(str.charAt(i)) );
		}
		return reverseWord;
	} 

	public static void main (String[] args) {  
		// keep this function call here     
		Scanner s = new Scanner(System.in);
		System.out.print(FirstReverse(s.nextLine())); 
	}   

}
