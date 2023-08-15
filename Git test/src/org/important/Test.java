package org.important;

public class Test {
	public static void main(String[] args) {
		String s="Apple is a fruit";
		         s=s.toLowerCase();
		char find='a';
		
		int occurance=0;
		


for (int i = 0; i < s.length(); i++) 
	{
		if (s.charAt(i)==find) {
			
			occurance=occurance+1;
			
		}
	
	}
System.out.println(occurance);
}
	}



		
	
		 
	




