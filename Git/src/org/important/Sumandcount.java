package org.important;

public class Sumandcount {
	public static void main(String[] args) {
		int sum= 0;
		int count=0;
		
		System.out.println("Even numbers from 0 to 10:");
		for (int i = 1; i <=10; i++) {
			
			if (i%2==0) {
				count= count+1;
				sum= sum+i;
				System.out.println(i);
			}
		}
			
			System.out.println("SUM OF EVEN :" +sum);
			System.out.println("Count of even :" +count);
		}
	}

