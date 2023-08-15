package org.important;

import java.util.Scanner;

public class Reverseanumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to reverse:");
		int num= s.nextInt();
		
		int rev=0;
	while (num>0) {
		 
		int n= num%10;
		rev=(rev*10)+n;
		num=num/10;
		
	}
	
	System.out.println("reversed number:"+rev);
		}

}
