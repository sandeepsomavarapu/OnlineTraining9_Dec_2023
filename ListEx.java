package com.ot9.collections;

import java.util.ArrayList;
import java.util.LinkedList;

//Collection:
//1)collections will allow both homogeneous data and heterogenous is allowed
//2)collections are not fixed in size/  growable in nature  AIOE  AL-10-->16--->25
//3)lots of methods
//List
//1)duplicates are allowed 
//2)insertion order is preserved 

public class ListEx {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();// generic -->10-->16 -->(cc*3/2)+1
		list.add("suresh");
		list.add("naresh");
		list.add("mahesh");
		list.add("rajesh");
		list.add("somesh");
		list.add("suresh");
		list.add(2,"sandeep");

		System.out.println(list);

		ArrayList list1 = new ArrayList();// generic -->10-->16 -->(cc*3/2)+1
		list1.add("suresh");
		list1.add("naresh");
		list1.add('c');
		list1.add(true);
		list1.add(123);
		list1.add("somesh");
		list1.add('c');
		list1.add("sandeep");
		System.out.println(list1);

	}

}
