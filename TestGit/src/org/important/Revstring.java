package org.important;

public class Revstring {
	public static void main(String[] args) {
		String s="Boomer";
		String rev="";
		
		for (int i = s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);
			
		}
			System.out.println(rev);
		
//			String[] ss = rev.split(" ");
//			for (int i = ss.length-1; i>=0; i--) {
//				System.out.print(ss[i]+" ");
	//		}
			
	}

}
