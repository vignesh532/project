package org.greens;

import java.util.Scanner;

;

public class Length {

	public static void main(String[] args) {

		String email = "vigneshkmr532@gmail.com";
		/*
		 * String s= "Vignesh";
		 * 
		 * String s1 = "@";
		 * 
		 * String b = "Devi";
		 * 
		 * String s2 = "Welcome To Java Class";
		 * 
		 * //To FInd Length
		 * 
		 * int l =s.length();
		 * 
		 * System.out.println(l);
		 * 
		 * // TO find character
		 * 
		 * char at =s.charAt(5); System.out.println(at);
		 * 
		 * //Ton convert to upper case
		 * 
		 * String a= s.toUpperCase(); System.out.println(a);
		 * 
		 * //To compare String
		 * 
		 * String p= s.concat(b);
		 * 
		 * System.out.println(p);
		 * 
		 * //To check end with
		 * 
		 * boolean d= s.endsWith("gnesh"); System.out.println(d);
		 * 
		 * boolean f= s.startsWith("Vig"); System.out.println(f);
		 * 
		 * 
		 * boolean g= s.contains("i");
		 * 
		 * System.out.println(g);
		 * 
		 * @SuppressWarnings("resource")
		 * 
		 * Scanner h = new Scanner(System.in);
		 * 
		 * System.out.println("Enter the Email");
		 * 
		 * h.next();
		 * 
		 * boolean v= email.contains("v");
		 * 
		 * System.out.println(v);
		 * 
		 * 
		 */ String g = email.toUpperCase();
		System.out.println(g);

		boolean x = email.isEmpty();
		System.out.println(x);

		String c = email.substring(2);
		System.out.println(c);

		String v = email.substring(4, 8);
		System.out.println(v);

		int d = email.codePointCount(2, 5);
		System.out.println(d);
		
		String gs= email.replace("vigneshkmr532@gmail.com", "@");
		
		System.out.println(gs);
		
		

	}

}
