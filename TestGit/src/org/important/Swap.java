package org.important;

public class Swap {
	public static void main(String[] args) {
		int a= 15;
		int b= 20;
	int temp = a; // Using 3rd variable
		System.out.println("Before swapping A:"+a);
		System.out.println("Before swapping B:"+b);
		a=b;
		b=temp;
		System.out.println("After swappping A:" +a);
		System.out.println("After swappping B:" +b);
	}

}
