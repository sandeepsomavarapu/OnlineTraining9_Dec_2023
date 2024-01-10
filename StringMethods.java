package com.ot9.stringclasses;

public class StringMethods {

	public static void main(String[] args) {

		String name = "welcome";
		String name1 = "welcome";	//heap-->SCP-->duplicates are not allowed 
		String name2 = new String("welcome");
		String name3 = new String("welcome");

		System.out.println(name==name1);//true
		System.out.println(name2==name3);//false
		
		
		
		System.out.println(name.equals(name1));// true
		System.out.println(name.equalsIgnoreCase(name1));// true
		System.out.println(name.compareTo(name1));// 0
		System.out.println("sandeep".compareTo("sandee"));//

		System.out.println(name.toUpperCase());
		System.out.println("sandeep".toUpperCase());
		String updateString = name.trim();
		System.out.println(updateString.length());
		
		System.out.println("capgemini".endsWith("gemini"));
		System.out.println("capgemini".charAt(2));
		System.out.println("capgemini india capgemini hyderabad capgemini".lastIndexOf("capgemini"));
		System.out.println("capgemini india hyderabad".substring(1,5));

		// returns -ve if obj1 has to before obj2
		// return +ve if obj1 has to come after obj2
		// returns 0 if both objects are same

	}

}
