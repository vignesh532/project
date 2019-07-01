package org.greens;

import java.awt.AWTException;

public class Count {
	
	 static int k;
	 	
	 	static int a[] = { 1,2,3,4,5,6,7,8,9,10};

		
	public static void main(String[] args) throws AWTException {
		
		 String str = "Welcome To Java class @123"; 
	     int upper = 0, lower = 0, number = 0, special = 0; 
 		
 		
 		for (int i = 0; i < a.length; i++) {
 			
 			k += a[i];
 			
 		}

     for(int i = 0; i < str.length(); i++) 
     { 
         char ch = str.charAt(i); 
         if (ch >= 'A' && ch <= 'Z') 
             upper++; 
         else if (ch >= 'a' && ch <= 'z') 
             lower++; 
         else if (ch >= '0' && ch <= '9') 
             number++; 
         else
             special++; 
     } 

     System.out.println("Lower case letters : " + lower); 
     System.out.println("Upper case letters : " + upper); 
     System.out.println("Number : " + number); 
     System.out.println("Special characters : " + special); 
 } 
}
