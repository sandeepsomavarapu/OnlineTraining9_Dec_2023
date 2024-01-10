package com.ot9.stringclasses;

public class StringEx {

	public static void main(String[] args) {
		//String,StringBuffer,StringBuilder
		String countryName	="india";//Immutable literal
		String countryName1	=new String("india");
		System.out.println(countryName);
		System.out.println(countryName.concat(" Banglore"));
		System.out.println(countryName);
		
		System.out.println("***********StringBuffer************");
		
		StringBuffer sb=new StringBuffer("india");//mutable,thread safety,performance low
		System.out.println(sb);
		sb.append(" delhi");
		System.out.println(sb);
		System.out.println("************StringBuilder***********");
		StringBuilder sb1=new StringBuilder("india");//mutable ,no thread safety,better performance
		System.out.println(sb1);
		sb1.append(" delhi");
		System.out.println(sb1);
		
	}

}
