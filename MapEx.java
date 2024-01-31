package com.ot9.collections;

import java.util.TreeMap;

public class MapEx {

	public static void main(String[] args) {
		TreeMap<Integer,String>emps=new TreeMap<Integer,String>();//16
					emps.put(123, "sandeep");//entry
					emps.put(23, "suresh");
					emps.put(14, "kalyan");
					emps.put(5, "somesh");
					emps.put(64, "rajesh");
					emps.put(123, "mahesh");
					System.out.println(emps);
	}

}
