package org.important;


public class PalindromeNumber {
	public static void main(String[] args) {
	
		int num=575;
		int f = num;
		int rev=0;
	while (num>0) {
		 
		int n= num%10;
		rev=(rev*10)+n;
		num=num/10;
		
	}
	
	System.out.println("reversed number:"+rev);
	if (f==rev) {
		System.out.println("Palindrome");
		
	} else {
System.out.println("Not a palindrome");
	}
		}

}
