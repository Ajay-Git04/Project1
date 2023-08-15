package org.important;

public class Swap2 {
	public static void main(String[] args) {
		int a= 10;
		int b= 15;
	
		System.out.println("Before swapping A:"+a);
		System.out.println("Before swapping B:"+b);
		
		a=a+b; // 10+15=25
		b= a-b; // 25-15 =10
		a=a-b;// 25-10 =15
		
		System.out.println("After swapping A:"+a);
		System.out.println("Before swapping B:"+b);
		
	}

}
