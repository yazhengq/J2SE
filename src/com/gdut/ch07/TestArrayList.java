package com.gdut.ch07;

import java.util.ArrayList;
import java.util.Collection;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new ArrayList();
		c.add("Hello");
		c.add(new Name("f1","l1"));
		c.add(new Integer(100));
		System.out.println(c.size());
		System.out.println(c);
		
		System.out.println(c.isEmpty());
//		System.out.println(c[1]);
	}
	
}
