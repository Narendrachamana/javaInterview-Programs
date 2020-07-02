package com.Day1;

public class PalindromeNumber {

	public static void main(String[] args) {

		int num = 12;

		int rev = 0;
		int actual = num;

		while (num > 0) {
			int n = num % 10;
			rev = rev*10+ n;
			num = num / 10;

		}
		
		//System.out.println(rev);
		
		if(actual==rev)
		{
			System.out.println("given number is palindrome");
		}
		else
		{
			System.out.println("given number is not a palindrome");
		}

	}

}
