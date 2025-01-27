package org.seli.intro;

import java.util.ArrayList;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr2= {11,22,33,44,55,66,77,88,12,13,14};
//		for(int i=0;i<arr2.length;i++) {
//			if(arr2[i]%2==0) {
//				System.out.println(arr2[i]);
//			}
//			else
//			{
//				System.out.println(arr2[i]+" is not multi of 2");
//			}
//			
//		}
		ArrayList<String> arr1 = new ArrayList<String>();
		arr1.add("Abhishek1");
		arr1.add("Abhishe2");
		arr1.add("Abhishk3");
		arr1.add("Abhisek4");
		// arr1.remove(2);
		// System.out.println(arr1.get(3));
		// System.out.println(arr1.remove(3)+" : removed");
		for (int i = 0; i < arr1.size(); i++) {
			System.out.println(arr1.get(i));
		}
		for (String val : arr1) {
			System.out.println(val);

		}
		System.out.println(arr1.contains("Abhishke3"));
	}

}
