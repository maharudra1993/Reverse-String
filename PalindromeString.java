package com.string_program;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s = sc.nextLine();
		
//		String s = "madam";
		
		int n = s.length();
		
		String rev = "";
		for(int i=n-1; i>=0; i--) {
			rev = rev + s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println("This is palindrome string");
		}else {
			System.out.println("This is not palindrome string");
		}

	}

}
