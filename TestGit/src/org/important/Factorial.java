package org.important;

public class Factorial {
	public static void main(String[] args) {
		
	int n=4;
	int fact=1;
	while (n>0) {
		
		fact= n*fact;
     n=n-1;
	}
	System.out.println(fact);
	}

}
