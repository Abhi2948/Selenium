package org.seli.intro;

import java.util.ArrayList;

public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str1="Abhishek Pateriya";
//		String str2="Abhishek Pateriya";
		
		String str3=new String("Welcome");
		String str4=new String("Welcome");
		String str1="Abhishek Pramod Pateriya";
//		String[] splittedString=str1.split(" ");
//		System.out.println(splittedString[0]);
//		System.out.println(splittedString[1]);
//		System.out.println(splittedString[2]);
		String[] splittedString=str1.split("Pramod");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());
		for(int i=str1.length()-1;i>=0;i--) {
			System.out.println(str1.charAt(i));
		}
	}

}
